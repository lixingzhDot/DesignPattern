package com.lixingzh.java.designpattern.strategies.impl;

import com.lixingzh.java.designpattern.strategies.SquackBehavior;

public class Squeak implements SquackBehavior {
    public void squack() {
        System.out.println("Squeak!!");
    }
}
