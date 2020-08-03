package com.bjpowernode.controller;

import com.bjpowernode.controller.model.School;
import com.bjpowernode.controller.util.RequestUtil;
import com.bjpowernode.controller.util.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @PACKAGE_NAME: ${PACKAGE_NAME}
 * @NAME: ${NAME}
 * @date: 2020/7/20 14:43 周一
 * @author: heqinz
 */
public class SchoolAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        School school = null;
        //1.设置request使用的字符集
        request.setCharacterEncoding("utf-8");
        //2.【request】读取【请求协议包】中【请求参数信息】
        school = (School) RequestUtil.init(request, School.class);
        //3.【JDBC】得到新部门信息添加到部门表
        SqlSession.insert(school);

        //4 通过重定向方案，将【DeptFindServlet】地址交给浏览器
        response.sendRedirect("/myweb/dept/find.do");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
