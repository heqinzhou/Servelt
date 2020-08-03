package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @PACKAGE_NAME: ${PACKAGE_NAME}
 * @NAME: ${NAME}
 * @date: 2020/7/22 9:46 周三
 * @author: heqinz
 */
public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goodsName = request.getParameter("name");

        HttpSession session = request.getSession();

        Integer goodsNum = (Integer)session.getAttribute(goodsName);

        if(goodsNum == null){
            session.setAttribute(goodsName,1);
        }else {
            session.setAttribute(goodsName,goodsName+1);
        }
    }
}
