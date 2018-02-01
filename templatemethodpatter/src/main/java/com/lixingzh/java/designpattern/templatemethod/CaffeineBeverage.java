package com.lixingzh.java.designpattern.templatemethod;

/**
 * Created by magicxdms on 1/31/18.
 */
public abstract class CaffeineBeverage {
    final public void prepareReceipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pouring into Cup");
    }
}
