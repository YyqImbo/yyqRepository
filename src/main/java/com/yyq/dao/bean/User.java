package com.yyq.dao.bean;

import com.yyq.common.BaseEntity;

public class User extends BaseEntity {

    private static final long serialVersionUID = 5892047986142810552L;

    private Long userId;

    //用户编号
    private String userNumber;

    //用户名称
    private String userName;

    //用户地址
    private String address;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userId=" + userId +
                ", userNumber='" + userNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
