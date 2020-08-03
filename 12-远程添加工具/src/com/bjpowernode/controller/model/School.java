package com.bjpowernode.controller.model;

/**
 * @PACKAGE_NAME: com.bjpowernode.controller.model
 * @NAME: School
 * @date: 2020/7/20 14:35 周一
 * @author: heqinz
 */
public class School {
    private Integer sid;
    private String sname;
    private String adress;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public School(Integer sid, String sname, String adress) {
        this.sid = sid;
        this.sname = sname;
        this.adress = adress;
    }

    public School(){

    }
}
