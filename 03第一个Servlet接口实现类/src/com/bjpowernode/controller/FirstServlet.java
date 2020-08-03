package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @PACKAGE_NAME: ${PACKAGE_NAME}
 * @NAME: ${NAME}
 * @date: 2020/7/18 15:48 周六
 * @author: heqinz
 */

/*
    如果浏览器采用【post】方式向Tomcat索要FirstServlet时，
       Tomcat调用FirstServlet中doPost方法，并将这个方法运行结果写在相应包中

     如果浏览器采用【get】方式向Tomcat索要FirstServlet时，
       Tomcat调用FirstServlet中doGet方法，并将这个方法运行结果写在相应包中
 */
public class FirstServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("FirstServlet doGet方法被调用了。。。。");
    }
}
