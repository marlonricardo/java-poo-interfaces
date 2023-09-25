package com.mro.javainsider.model;

import com.mro.javainsider.LoginInterface;

public class SameCredentialsLoginMethod implements LoginInterface {
    @Override
    public boolean login(String username, String password) {
        return username.equals(password);
    }
}
