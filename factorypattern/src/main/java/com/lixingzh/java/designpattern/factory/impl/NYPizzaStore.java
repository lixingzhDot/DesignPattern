package com.lixingzh.java.designpattern.factory.impl;

import com.lixingzh.java.designpattern.factory.PizzaCreatorService;
import com.lixingzh.java.designpattern.factory.PizzaProduct;

public class NYPizzaStore extends PizzaCreatorService {
    @Override
    public PizzaProduct createPizza(String type) {
        return new PizzaProduct(type);
    }
}
