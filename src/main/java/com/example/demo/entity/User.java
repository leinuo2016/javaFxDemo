package com.example.demo.entity;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Create by leinuo on 19-8-30 下午5:10
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
@Entity
@Table(name="muser")
public class User extends BaseEntity {
    @Transient
    private StringProperty username = new SimpleStringProperty();
    @Transient
    private StringProperty password = new SimpleStringProperty();

    private String name;
    private String pwd;

    public User() {

    }
    public User(String name, String pwd) {
        setName(name);
        setPwd(pwd);
    }

    public String getName() {
        return username.get();
    }

    public void setName(String name) {
        this.name = name;
        this.username.set(name);
    }

    public String getPwd() {
            return password.get();
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
        this.password.set(pwd);
    }

    public String getUsername() {
        return username.get();
    }

    public StringProperty usernameProperty() {
        return username;
    }

    public StringProperty passwordProperty() {
        return password;
    }



}


