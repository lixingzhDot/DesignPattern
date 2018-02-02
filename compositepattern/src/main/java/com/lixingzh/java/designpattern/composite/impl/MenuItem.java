package com.lixingzh.java.designpattern.composite.impl;

import com.lixingzh.java.designpattern.composite.MenuComponent;

import java.util.Iterator;

/**
 * Created by magicxdms on 2/1/18.
 */
public class MenuItem extends MenuComponent{
    String name;
    String description;
    double price;
    boolean isVegetarian;

    public MenuItem(String name, String description, double price, boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
       return price;
    }

    @Override
    public boolean isVegetarian() {
        return this.isVegetarian;
    }

    @Override
    public void print() {
        System.out.println(" " + getName());
        if(isVegetarian()) {
            System.out.println("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("   -- " + getDescription());
    }

    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
