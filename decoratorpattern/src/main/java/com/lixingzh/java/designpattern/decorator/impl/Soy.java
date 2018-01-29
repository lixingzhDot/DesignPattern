package com.lixingzh.java.designpattern.decorator.impl;

import com.lixingzh.java.designpattern.decorator.Beverage;
import com.lixingzh.java.designpattern.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}
