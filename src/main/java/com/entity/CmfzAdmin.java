package com.entity;

/**
 * @Author: renpu
 * @Date: 2019/2/26 16:42
 * @Description:
 */
public class CmfzAdmin {
    private int id;
    private String userName;
    private String passWord;

    public CmfzAdmin(int id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public CmfzAdmin(String userName, String passWord) {

        this.userName = userName;
        this.passWord = passWord;
    }


    public CmfzAdmin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
