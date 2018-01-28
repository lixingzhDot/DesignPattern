package com.lixingzh.java.designpattern.strategies.impl;

import com.lixingzh.java.designpattern.strategies.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    public void fly() {
        System.out.println("I can fly with wings");
    }
}
