package com.lixingzh.java.designpattern.decorator.impl;

import com.lixingzh.java.designpattern.decorator.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super.setDescription("DarkRoast");
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
