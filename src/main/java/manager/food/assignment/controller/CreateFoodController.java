package manager.food.assignment.controller;

import manager.food.assignment.entity.Food;
import manager.food.assignment.model.FoodModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateFoodController extends HttpServlet {
    private FoodModel foodModel = new FoodModel();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/food/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            String category = req.getParameter("category");
            String description = req.getParameter("description");
            String thumbnail = req.getParameter("thumbnail");
            double price = Double.parseDouble(req.getParameter("price"));
            String sdate = req.getParameter("sdate");
            String fdate = req.getParameter("fdate");
            String status = req.getParameter("status");
            Food f = new Food(id, name, category, description, thumbnail, price, sdate, fdate, status);
            if(foodModel.save(f)){
//                resp.getWriter().println("OK");
                resp.sendRedirect("/admin/food/list");
            }
        }catch (Exception e){
            resp.getWriter().println("Error");
        }
    }
}
