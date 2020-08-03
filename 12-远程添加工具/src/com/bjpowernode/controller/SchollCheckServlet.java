package com.bjpowernode.controller;

import com.bjpowernode.controller.dao.SchoolDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @PACKAGE_NAME: ${PACKAGE_NAME}
 * @NAME: ${NAME}
 * @date: 2020/7/20 14:44 周一
 * @author: heqinz
 */
public class SchollCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sname = null;
        SchoolDao dao = new SchoolDao();
        int result=0;
        //1.读取请求协议包参数【部门名称】
        sname = request.getParameter("sname");
        //2.Dao层查询这个部门名称是否已经存在
        result = dao.checkDname(sname);
        //3.将查询结果写入到【响应包】
        response.getWriter().print(result);
    }
}
