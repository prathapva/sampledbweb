package com.example.sampleweb.controller;

import com.example.sampleweb.dao.UserDao;
import com.example.sampleweb.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String location = request.getParameter("location");
        String phone = request.getParameter("phone");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setLocation(location);
        user.setPhone(phone);

        try {
            userDao.saveUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("index.jsp");
    }
}
