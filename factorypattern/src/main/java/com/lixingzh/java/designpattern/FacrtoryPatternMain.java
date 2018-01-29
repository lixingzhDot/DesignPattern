package com.lixingzh.java.designpattern;

import com.lixingzh.java.designpattern.factory.PizzaCreatorService;
import com.lixingzh.java.designpattern.factory.PizzaProduct;
import com.lixingzh.java.designpattern.factory.impl.NYPizzaStore;

/**
 * Factory Pattern
 * Defines an interface for creating an object, but let subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 *
 *
 * Abstract Factory Pattern(No Example)
 * provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 *
 * Difference:
 * Factory Pattern:
 *      factory is an abstract class, concrete factory extends the abstract factory.
 *      same as product class.
 * Abstract Factory Pattern:
 *      factory is an interface. Concrete factory implements the interface.
 *      same as product (interface + concrete product)
 */
public class FacrtoryPatternMain {
    public static void main(String[] args) {
        PizzaCreatorService pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("ALL-MEAT Pizza");
    }
}
