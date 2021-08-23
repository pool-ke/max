package com.shiyan.hellospring.entity;

public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWork() {
        return passWord;
    }

    public void setPassWork(String passWork) {
        this.passWord = passWork;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public User(Integer id, String userName, String passWork, String realName) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWork;
        this.realName = realName;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWork='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
