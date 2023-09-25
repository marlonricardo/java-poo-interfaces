package com.mro.javainsider.app;

import com.mro.javainsider.LoginInterface;
import com.mro.javainsider.model.Login;
import com.mro.javainsider.model.SameCredentialsLoginMethod;

public class App2 {
    public static void main(String[] args) {
        Login l1 = new Login();
        System.out.println(l1.login("admin", "admin"));
        System.out.println(l1.login("adm5n", "42385"));

        var l2 = new SameCredentialsLoginMethod();
        System.out.println(l2.login("marlonricardo", "marlonricardo"));
        System.out.println(l2.login("marlonricardo", "asda"));

        Login l3 = new Login("abc", "abcd1234");
        System.out.println(l3.login("abc", "abcd1234"));
        System.out.println(l3.login("abc", "abc1234"));

    }
}
