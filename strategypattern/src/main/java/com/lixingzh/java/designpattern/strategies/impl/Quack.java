package com.lixingzh.java.designpattern.strategies.impl;

import com.lixingzh.java.designpattern.strategies.SquackBehavior;

public class Quack implements SquackBehavior {
    public void squack() {
        System.out.println("Just Quack");
    }
}
