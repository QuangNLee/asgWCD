package manager.food.assignment.model;

import manager.food.assignment.entity.Food;
import manager.food.assignment.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FoodModel {
    public static void main(String[] args) {
        FoodModel foodModel = new FoodModel();
//        foodModel.save(new Food(1, "Ga Nuong", "Mon Nuong", "Ngon", "Ga", 12000, "ngay12", "ngay13", "dang ban"));
//        foodModel.save(new Food(1, "Ga Luoc", "Mon Luoc", "Ngon2", "Ga2", 15000, "ngay12", "ngay13", "dang ban"));
//        foodModel.save(new Food(1, "Ga Xao", "Mon Xao", "Ngo3n", "Ga3", 1700, "ngay12", "ngay13", "dang ban"));
//        ArrayList<Food> listGame = foodModel.findAll();
//        System.out.println(listGame.size());
//        foodModel.findAll();
//        Food f = foodModel.findById(3);
//        f.setName("Ga Cut");
//        foodModel.update(f.getId(), f);
        foodModel.delete(3);
    }

    public ArrayList<Food> findAll() {
        ArrayList<Food> result = new ArrayList<>();
        Connection connection = ConnectionHelper.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from foods where status like '%Đang bán%'");
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String category = resultSet.getString("category");
                    String description = resultSet.getString("description");
                    String thumbnail = resultSet.getString("thumbnail");
                    double price = resultSet.getDouble("price");
                    String sdate = resultSet.getString("sdate");
                    String fdate = resultSet.getString("fdate");
                    String status = resultSet.getString("status");
                    Food food = new Food(id, name, category, description, thumbnail, price, sdate, fdate, status);
                    result.add(food);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public Food findById(int id) {
        Connection connection = ConnectionHelper.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from foods where id = ?");
                preparedStatement.setInt(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()){
                    int foodId = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String category = resultSet.getString("category");
                    String description = resultSet.getString("description");
                    String thumbnail = resultSet.getString("thumbnail");
                    double price = resultSet.getDouble("price");
                    String sdate = resultSet.getString("sdate");
                    String fdate = resultSet.getString("fdate");
                    String status = resultSet.getString("status");
                    Food food = new Food(foodId, name, category, description, thumbnail, price, sdate, fdate, status);
                    return food;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public boolean save(Food food) {
        Connection connection = ConnectionHelper.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement =
                        connection.prepareStatement("insert into foods (name, category, description, thumbnail, price, sdate, fdate, status) values (?,?,?,?,?,?,?,?) ");
                preparedStatement.setString(1, food.getName());
                preparedStatement.setString(2, food.getCategory());
                preparedStatement.setString(3, food.getDescription());
                preparedStatement.setString(4, food.getThumbnail());
                preparedStatement.setDouble(5, food.getPrice());
                preparedStatement.setString(6, food.getSdate());
                preparedStatement.setString(7, food.getFdate());
                preparedStatement.setString(8, food.getStatus());
                preparedStatement.execute();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean update(int id, Food food) {
        Connection connection = ConnectionHelper.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement =
                        connection.prepareStatement("update foods set name = ?, category = ?, description = ?, thumbnail = ?, price = ?, sdate = ?, fdate = ?, status = ? where id = ?");
                preparedStatement.setString(1, food.getName());
                preparedStatement.setString(2, food.getCategory());
                preparedStatement.setString(3, food.getDescription());
                preparedStatement.setString(4, food.getThumbnail());
                preparedStatement.setDouble(5, food.getPrice());
                preparedStatement.setString(6, food.getSdate());
                preparedStatement.setString(7, food.getFdate());
                preparedStatement.setString(8, food.getStatus());
                preparedStatement.setInt(9, id);
                preparedStatement.execute();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean delete(int id) {
        Connection connection = ConnectionHelper.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement =
                        connection.prepareStatement("delete from foods where id = ?");
                preparedStatement.setInt(1, id);
                preparedStatement.execute();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
