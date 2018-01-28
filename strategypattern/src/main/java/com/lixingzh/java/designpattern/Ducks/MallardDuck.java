package com.lixingzh.java.designpattern.Ducks;

import com.lixingzh.java.designpattern.strategies.FlyBehavior;
import com.lixingzh.java.designpattern.strategies.SquackBehavior;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a MallardDuck");
    }

    public MallardDuck(FlyBehavior flyBehavior, SquackBehavior squackBehavior) {
        super(flyBehavior, squackBehavior);
    }

    public MallardDuck() {
        super();
    }
}
