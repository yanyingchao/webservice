package com.example.demo.entity;

import java.io.Serializable;
/**
 * @ClassName:User
 * @Description:测试实体
 * @author Jerry
 * @date:2018年4月10日下午3:57:38
 */
public class User implements Serializable{

    private static final long serialVersionUID = -3628469724795296287L;

    private String userId;
    private String userName;
    private String email;
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
    }

}