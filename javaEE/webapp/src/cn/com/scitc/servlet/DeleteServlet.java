package cn.com.scitc.servlet;

import cn.com.scitc.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet",urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        UserDao dao = new UserDao();
        dao.deleteById(id);

//        response.sendRedirect("home");

        System.out.println("delete success");
        request.getSession().setAttribute("msg","删除数据成功");
        response.sendRedirect("msg");
    }
}
