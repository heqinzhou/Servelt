package com.bjpowernode.controller;

import com.bjpowernode.controller.Utils.DB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @PACKAGE_NAME: ${PACKAGE_NAME}
 * @NAME: ${NAME}
 * @date: 2020/7/20 10:55 周一
 * @author: heqinz
 */
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//1.读取浏览器发送的请求参数
        String deptNo,dname,loc=null;
        Connection conn=null;
        PreparedStatement ps=null;
        String sql="insert into student value(?,?,?,?)";
        String id=request.getParameter("id");
        String name = request.getParameter("name");
        String email=request.getParameter("email");
        String age=request.getParameter("age");


        //2.jdbc部门信息添加
        try {
            conn= DB.getConn();
            ps=conn.prepareStatement(sql);
            ps.setInt(1, Integer.valueOf(id));
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setInt(4, Integer.valueOf(age));
            ps.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            DB.closeConn(conn);
            DB.closeStmt(ps);

        }
        //通定向方式实现多个servlet完成一个请求

        response.sendRedirect("/myweb/one");

    }

    }

