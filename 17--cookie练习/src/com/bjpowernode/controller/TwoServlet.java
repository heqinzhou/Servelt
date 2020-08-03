package com.bjpowernode.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * @PACKAGE_NAME: ${PACKAGE_NAME}
 * @NAME: ${NAME}
 * @date: 2020/7/22 13:30 周三
 * @author: heqinz
 */
public class TwoServlet extends HttpServlet {


    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/ssm";


    static final String USER = "root";
    static final String PASS = "root";


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        Statement stmt = null;
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String title = "学生信息";
        String docType = "<!DOCTYPE html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n");
// 注册 JDBC 驱动器
      try {
          Class.forName("com.mysql.jdbc.Driver");

        // 打开一个连接
        conn = DriverManager.getConnection(DB_URL,USER,PASS);

        // 执行 SQL 查询

            stmt = conn.createStatement();

        String sql;
        sql = "SELECT * FROM student";
        ResultSet rs = stmt.executeQuery(sql);

        // 展开结果集数据库
        while(rs.next()){
            // 通过字段检索
            int id  = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String age = rs.getString("age");

            // 输出数据
            out.println("ID: " + id);
            out.println("<br />");
            out.println("姓名: " + name);
            out.println("<br />");
            out.println("邮箱: " + email);
            out.println("<br />");
            out.println("年龄: " + age);
            out.println("<br />");
        }
        out.println("</body></html>");

        // 完成后关闭
        rs.close();
        stmt.close();
        conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
