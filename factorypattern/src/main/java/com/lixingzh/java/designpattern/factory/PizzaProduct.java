package com.lixingzh.java.designpattern.factory;

public class PizzaProduct {
    String pizzaType;

    public PizzaProduct(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void cook() {
        System.out.println("cooking...");
    }

    public void cut() {
        System.out.println("cutting...");
    }

    public void delivered() {
        System.out.println("delivered!!");
    }
}
