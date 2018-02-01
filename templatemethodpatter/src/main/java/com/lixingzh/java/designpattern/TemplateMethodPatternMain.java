package com.lixingzh.java.designpattern;

/**
 * Created by magicxdms on 1/31/18.
 */

import com.lixingzh.java.designpattern.templatemethod.CaffeineBeverage;
import com.lixingzh.java.designpattern.templatemethod.Coffee;
import com.lixingzh.java.designpattern.templatemethod.Tea;

/**
 * Template Method Pattern
 * Defines the skeleton of an algorithm in an method, defering some steps to subclasses.
 * Template Method lets subclasses redefine certian steps of an algorithm without changing the algoithm's structure.
 *
 * Examples:
 * 1. Swingin with Frames
 * 2. Applets
 */
public class TemplateMethodPatternMain {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        System.out.println("Prepare Tea: ");
        tea.prepareReceipe();


        System.out.println();
        System.out.println("Coffee Tea: ");
        coffee.prepareReceipe();
    }
}
