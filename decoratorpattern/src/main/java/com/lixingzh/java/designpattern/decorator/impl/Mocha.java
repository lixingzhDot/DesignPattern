package com.lixingzh.java.designpattern.decorator.impl;

import com.lixingzh.java.designpattern.decorator.Beverage;
import com.lixingzh.java.designpattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.99 + beverage.cost();
    }
}
