package com.mro.javainsider.model;

import com.mro.javainsider.LoginInterface;

public class Login implements LoginInterface {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    private String username;
    private String password;

    public Login(){
        this(USERNAME, PASSWORD);
    }

    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }



}
