package com.lixingzh.java.designpattern.strategies.impl;

import com.lixingzh.java.designpattern.strategies.SquackBehavior;

public class MuteQuack implements SquackBehavior {
    public void squack() {
        System.out.println("I cannot quack");
    }
}
