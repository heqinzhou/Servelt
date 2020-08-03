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
 * @date: 2020/7/19 17:54 周日
 * @author: heqinz
 */
public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "hello HttpServeltResponse"; //OneServlet运行结果

        //通过【响应对象】将【英文字符串】写入刀【响应体】

        //1、从【响应对象】获得一个【输出流】
        PrintWriter out = response.getWriter();
        //2、[输出流]将【英文字符串】写入【响应体】
        out.write(str);

    }//Tomcat在OneServlet调用完毕后，将响应包推送到浏览器

}
