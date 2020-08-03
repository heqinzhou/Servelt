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
 * @date: 2020/7/21 13:47 周二
 * @author: heqinz
 */
public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie array[] = request.getCookies();

        for(Cookie cookie : array){
            String keyName = cookie.getName();
            String value = cookie.getValue();

            if("key1".equals(keyName)){
                response.setCharacterEncoding("GBK");
                String a = "客人，想死我啦....";
                response.getWriter().write(value + a);

            }else if("key2".equals(keyName)){
                response.setCharacterEncoding("GBK");

                String  b= "我们早就将";
                String  c = "给您准备好了";
                response.getWriter().write( b + value + c);
            }
        }
    }
}
