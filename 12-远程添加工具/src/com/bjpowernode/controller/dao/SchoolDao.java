package com.bjpowernode.controller.dao;

import com.bjpowernode.controller.model.School;
import com.bjpowernode.controller.util.SqlSession;

import java.util.List;

/**
 * @PACKAGE_NAME: com.bjpowernode.controller.dao
 * @NAME: SchoolDao
 * @date: 2020/7/20 14:46 周一
 * @author: heqinz
 */
public class SchoolDao {
    public List findAll(){
        String sql ="select * from school";
        List deptList = SqlSession.selectList(sql, School.class);
        return deptList;
    }

    public int checkDname(String sname){
        String sql ="select * from school where sname='"+sname+"'";
        List deptList = SqlSession.selectList(sql, School.class);
        int result = deptList.size();
        return result;
    }
}

