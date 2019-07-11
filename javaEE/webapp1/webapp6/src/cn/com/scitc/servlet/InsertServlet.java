package cn.com.scitc.servlet;

import cn.com.scitc.dao.UserDao;
import cn.com.scitc.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "InsertServlet",urlPatterns = "/insert")
public class InsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Date birthday = Date.valueOf(request.getParameter("birthday"));

        UserDao dao = new UserDao();
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setBirthday(birthday);
        dao.insert(user);

        response.sendRedirect("home");

    }
}
