package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @PACKAGE_NAME: ${PACKAGE_NAME}
 * @NAME: ${NAME}
 * @date: 2020/7/19 18:18 周日
 * @author: heqinz
 */
public class ThreeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = "下班了";
        response.setCharacterEncoding("GBK");
        response.getWriter().write(a);
    }
}
