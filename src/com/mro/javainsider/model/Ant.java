package com.mro.javainsider.model;

import com.mro.javainsider.Walkable;

public class Ant implements Walkable {

    private int totalDistance = 100;
    @Override
    public void walk() {
        totalDistance -= 10;
    }

    @Override
    public void stop() {
        totalDistance = 100;
    }
}
