package com.bjpowernode.controller.dao;

import com.bjpowernode.controller.model.Student;
import com.bjpowernode.controller.util.SqlSession;

import java.util.List;

/**
 * @PACKAGE_NAME: com.bjpowernode.controller.dao
 * @NAME: StudentDao
 * @date: 2020/7/20 14:39 周一
 * @author: heqinz
 */
public class StudentDao {
    public List findEmpAll(){
        String sql ="select * from student";
        List list = SqlSession.selectList(sql, Student.class);
        return list;
    }

    public Student login(Student student){

        String sql ="select * from student where id="+student.getId()+" and name='"+student.getName()+"'";

        List list = SqlSession.selectList(sql, Student.class);

        if(list==null || list.size()==0){
            return null;
        }else{
            return (Student)list.get(0);
        }
    }
}
