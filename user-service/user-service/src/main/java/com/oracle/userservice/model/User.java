package com.oracle.userservice.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer userId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNo;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private Integer age;

    public User() {
    }

    public User(Integer userId, String name, String phoneNo, String mail, String state, Integer age) {
        this.userId = userId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.mail = mail;
        this.state = state;
        this.age = age;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
