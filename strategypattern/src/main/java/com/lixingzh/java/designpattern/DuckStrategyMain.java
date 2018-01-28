package com.lixingzh.java.designpattern;

import com.lixingzh.java.designpattern.Ducks.Duck;
import com.lixingzh.java.designpattern.Ducks.MallardDuck;
import com.lixingzh.java.designpattern.Ducks.RedHeadDuck;
import com.lixingzh.java.designpattern.strategies.impl.FlyNoWay;
import com.lixingzh.java.designpattern.strategies.impl.FlyWithWings;
import com.lixingzh.java.designpattern.strategies.impl.MuteQuack;
import com.lixingzh.java.designpattern.strategies.impl.Squeak;

/**
 * Strategy Pattern
 * The Strategy Pattern defines a family of algorithms, encapsulates each one and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 *
 * In this example, not every duck can fly. So we make fly to be an "strategy" (interface), make it "interchangeable".
 */
public class DuckStrategyMain {
    public static void main(String[] args) {
        Duck[] ducks = new Duck[2];

        ducks[0] = new MallardDuck(new FlyWithWings(), new Squeak());
        ducks[1] = new RedHeadDuck(new FlyNoWay(), new MuteQuack());

        for(Duck duck : ducks) {
            duck.display();
            duck.performFly();
            duck.performSquack();
        }
    }
}
