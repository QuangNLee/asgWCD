package manager.food.assignment.controller;

import manager.food.assignment.entity.Food;
import manager.food.assignment.model.FoodModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ListFoodController extends HttpServlet {
    private FoodModel foodModel = new FoodModel();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Food> listFood = foodModel.findAll();
        req.setAttribute("list", listFood);
        req.getRequestDispatcher("/admin/food/list.jsp").forward(req, resp);
    }
}
