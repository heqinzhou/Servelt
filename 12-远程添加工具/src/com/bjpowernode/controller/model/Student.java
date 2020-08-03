package com.bjpowernode.controller.model;

import java.util.SplittableRandom;

/**
 * @PACKAGE_NAME: com.bjpowernode.controller.model
 * @NAME: Student
 * @date: 2020/7/20 14:35 周一
 * @author: heqinz
 */
public class Student {
    private Integer id;
    private String name;
    private String eamil;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(Integer id, String name, String eamil, Integer age) {
        this.id = id;
        this.name = name;
        this.eamil = eamil;
        this.age = age;
    }

    public Student(){

    }
}
