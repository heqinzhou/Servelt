package com.bjpowernode.controller;

import com.bjpowernode.controller.dao.SchoolDao;
import com.bjpowernode.controller.model.School;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @PACKAGE_NAME: ${PACKAGE_NAME}
 * @NAME: ${NAME}
 * @date: 2020/7/20 14:50 周一
 * @author: heqinz
 */
public class SchoolFindServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SchoolDao dao = new SchoolDao();
        List<School> deptList=null;
        PrintWriter out = null;


        //1.JDBC查询所有部门信息
        deptList=dao.findAll();

        //2.响应对象将查询结果写入到响应体
        response.setContentType("text/html;charset=GBK");
        out = response.getWriter();
        out.write("<center>");
        out.write("<table border='2'");
        out.write("<tr>");
        out.write("<td>学校编号</td>");
        out.write("<td>学校名称</td>");
        out.write("<td>学校位置</td>");
        out.write("</tr>");
        for(School dept:deptList){
            out.write("<tr>");
            out.write("<td>"+dept.getSid()+"</td>");
            out.write("<td>"+dept.getSname()+"</td>");
            out.write("<td>"+dept.getAdress()+"</td>");
            out.write("</tr>");

        }
        out.write("</table>");
        out.write("<center>");



    }//Tomcat在DeptFindServlet运行完毕后，将响应包推送到浏览器上

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
