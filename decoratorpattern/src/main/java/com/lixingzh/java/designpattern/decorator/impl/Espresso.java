package com.lixingzh.java.designpattern.decorator.impl;

import com.lixingzh.java.designpattern.decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
