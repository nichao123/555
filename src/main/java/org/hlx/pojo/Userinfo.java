package org.hlx.pojo;

import java.io.Serializable;

public class Userinfo implements Serializable {
    private int userId;
    private String loginName;
    private String loginPass;
    private String phone;
    private String realname;
    private int amount;
    private int admin;

    @Override
    public String toString() {
        return "Userinfo{" +
                "userId=" + userId +
                ", loginName='" + loginName + '\'' +
                ", loginPass='" + loginPass + '\'' +
                ", phone='" + phone + '\'' +
                ", realname='" + realname + '\'' +
                ", amount=" + amount +
                ", admin=" + admin +
                '}';
    }

    public Userinfo() {
    }



    public Userinfo(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }

    public Userinfo(String loginName, String loginPass, String phone, String realname) {
        this.loginName = loginName;
        this.loginPass = loginPass;
        this.phone = phone;
        this.realname = realname;
    }

    public Userinfo(String loginName, String loginPass, String phone, String realname, int amount) {
        this.loginName = loginName;
        this.loginPass = loginPass;
        this.phone = phone;
        this.realname = realname;
        this.amount = amount;
    }


    public Userinfo(int userId, String loginName, String loginPass, String phone, String realname, int amount, int admin) {
        this.userId = userId;
        this.loginName = loginName;
        this.loginPass = loginPass;
        this.phone = phone;
        this.realname = realname;
        this.amount = amount;
        this.admin = admin;
    }


    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
}
