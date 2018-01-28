package com.lixingzh.java.designpattern.strategies.impl;

import com.lixingzh.java.designpattern.strategies.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I cannot fly");
    }
}
