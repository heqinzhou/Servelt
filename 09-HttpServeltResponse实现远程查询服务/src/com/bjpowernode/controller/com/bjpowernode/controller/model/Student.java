package com.bjpowernode.controller.com.bjpowernode.controller.model;

/**
 * @PACKAGE_NAME: com.bjpowernode.controller.com.bjpowernode.controller.model
 * @NAME: Student
 * @date: 2020/7/20 9:55 周一
 * @author: heqinz
 */
public class Student {

    private Integer id;
    private String name;
    private String email;
    private  Integer age;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Student(){

    }
}
