package com.mro.javainsider.app;

import com.mro.javainsider.model.Person;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.walk();
        p.jump();

        System.out.println(Person.height);
    }
}
