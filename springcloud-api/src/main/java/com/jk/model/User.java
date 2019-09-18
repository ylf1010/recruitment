package com.jk.model;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String username;

    private String userpowd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpowd() {
        return userpowd;
    }

    public void setUserpowd(String userpowd) {
        this.userpowd = userpowd;
    }
}
