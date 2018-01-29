package com.lixingzh.java.designpattern;

import com.lixingzh.java.designpattern.decorator.Beverage;
import com.lixingzh.java.designpattern.decorator.impl.DarkRoast;
import com.lixingzh.java.designpattern.decorator.impl.Espresso;
import com.lixingzh.java.designpattern.decorator.impl.Mocha;
import com.lixingzh.java.designpattern.decorator.impl.Whip;

/**
 * Decorator Pattern
 * Attaches additional responsibilities to an object dynamically.
 * Decorators provides a flexible alternative to subclassing for extending functionality
 *
 * Self Understanding:
 * 1. The difference between a concrete object and a decorator object is that a decorator object could "has a" decorator object.
 * 2. Every CondimentDecorator is like a wrapper, it can wrapper any CondimentDecorator and Beverage.
 */
public class DecoratorPatternMain {
    public static void main(String[] args) {
        Beverage b1 = new DarkRoast();
        System.out.println(b1.getDescription() + ": $" + b1.cost());

        b1 = new Mocha(b1);
        b1 = new Mocha(b1);
        b1 = new Whip(b1);

        System.out.println(b1.getDescription() + ": $" + b1.cost());
    }
}
