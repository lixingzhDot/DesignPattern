package com.lixingzh.java.designpattern.Ducks;

import com.lixingzh.java.designpattern.strategies.FlyBehavior;
import com.lixingzh.java.designpattern.strategies.SquackBehavior;

public class RedHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a red head duck");
    }

    public RedHeadDuck(FlyBehavior flyBehavior, SquackBehavior squackBehavior) {
        super(flyBehavior, squackBehavior);
    }
}
