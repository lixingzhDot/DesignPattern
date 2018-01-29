package com.lixingzh.java.designpattern.decorator.impl;

import com.lixingzh.java.designpattern.decorator.Beverage;
import com.lixingzh.java.designpattern.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 1.99 + beverage.cost();
    }
}
