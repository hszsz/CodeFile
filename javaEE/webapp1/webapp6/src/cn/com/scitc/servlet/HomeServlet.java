package cn.com.scitc.servlet;

import cn.com.scitc.dao.UserDao;
import cn.com.scitc.model.User;

import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "HomeServlet",urlPatterns = "/home")
public class HomeServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        UserDao dao = new UserDao();
        List<User> user =  dao.findAll();
        request.setAttribute("user",user);
        request.getRequestDispatcher("/home.jsp").forward(request,response);
    }
}