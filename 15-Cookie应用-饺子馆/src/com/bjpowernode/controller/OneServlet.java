package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @PACKAGE_NAME: ${PACKAGE_NAME}
 * @NAME: ${NAME}
 * @date: 2020/7/21 13:39 周二
 * @author: heqinz
 */
public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String jiaozi = request.getParameter("jiaozi");

        Cookie c1 = new Cookie("key1",name);
        Cookie c2 = new Cookie("key2",jiaozi);
        c1.setMaxAge(60);
        response.addCookie(c1);
        response.addCookie(c2);

    }
}
