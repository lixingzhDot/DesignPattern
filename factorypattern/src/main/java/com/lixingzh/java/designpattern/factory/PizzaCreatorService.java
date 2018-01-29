package com.lixingzh.java.designpattern.factory;

public abstract class PizzaCreatorService {
    public void orderPizza(String type) {
        PizzaProduct pizza = createPizza(type);
        System.out.println("Order Received: " + pizza.getPizzaType());
        pizza.cook();
        pizza.cut();
        pizza.delivered();
    }

    public abstract PizzaProduct createPizza(String type);
}
