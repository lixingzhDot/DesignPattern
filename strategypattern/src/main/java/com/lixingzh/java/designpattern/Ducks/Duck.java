package com.lixingzh.java.designpattern.Ducks;

import com.lixingzh.java.designpattern.strategies.FlyBehavior;
import com.lixingzh.java.designpattern.strategies.SquackBehavior;


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
