package com.lixingzh.java.designpattern.Ducks;

import com.lixingzh.java.designpattern.strategies.FlyBehavior;
import com.lixingzh.java.designpattern.strategies.SquackBehavior;

/**
 * Strategy Pattern
 * The Strategy Pattern defines a family of algorithms, encapsulates each one and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 *
 * In this example, not every duck can fly. So we make fly to be an "strategy" (interface), make it "interchangeable".
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private SquackBehavior squackBehavior;

    Duck() {

    }

    Duck(FlyBehavior flyBehavior, SquackBehavior squackBehavior) {
        this.flyBehavior = flyBehavior;
        this.squackBehavior = squackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSquackBehavior(SquackBehavior squackBehavior) {
        this.squackBehavior = squackBehavior;
    }

    public void swim() {
        System.out.println("I can swim");
    }

    abstract public void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSquack() {
        squackBehavior.squack();
    }

}
