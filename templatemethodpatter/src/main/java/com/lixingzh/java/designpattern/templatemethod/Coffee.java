package com.lixingzh.java.designpattern.templatemethod;

/**
 * Created by magicxdms on 1/31/18.
 */
public class Coffee extends CaffeineBeverage {
    public Coffee() {
        super();
    }

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
