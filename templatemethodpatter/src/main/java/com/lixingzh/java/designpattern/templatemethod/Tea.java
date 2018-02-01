package com.lixingzh.java.designpattern.templatemethod;

/**
 * Created by magicxdms on 1/31/18.
 */
public class Tea extends CaffeineBeverage {

    public Tea() {
        super();
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
