package com.bjpowernode.controller;

import com.bjpowernode.controller.Utils.DB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @PACKAGE_NAME: ${PACKAGE_NAME}
 * @NAME: ${NAME}
 * @date: 2020/7/20 10:57 周一
 * @author: heqinz
 */
public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sql = "select * from student";
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
        PrintWriter out=null;
        try {
        conn = DB.getConn();
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
            response.setContentType("text/html;charset=GBK");
            out=response.getWriter();
            out.print("<table border='2'>");
            out.print("<tr>");
            out.print("<td>编号</td>");
            out.print("<td>姓名</td>");
            out.print("<td>邮箱</td>");
            out.print("<td>年龄</td>");
            out.print("</tr>");

            while(rs.next()) {
                Integer id=rs.getInt("id");
                String name=rs.getString("name");
                String email=rs.getString("email");
                Integer age=rs.getInt("age");
                out.print("<tr>");
                out.print("<td>"+id+"</td>");
                out.print("<td>"+name+"</td>");
                out.print("<td>"+email+"</td>");
                out.print("<td>"+age+"</td>");
                out.print("</tr>");
            }
            out.print("</table>");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
