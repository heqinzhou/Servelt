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
 * @date: 2020/7/19 18:01 周日
 * @author: heqinz
 */
public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num = 100;
        PrintWriter out = response.getWriter();
//        out.write(num);
        out.print(num);

        /*
         out.write();  只能将“字符串"或者【unicode码】写入响应体
         100   值为100的【unicode码】所对应的字符串为 【d】
         */
    }
}
