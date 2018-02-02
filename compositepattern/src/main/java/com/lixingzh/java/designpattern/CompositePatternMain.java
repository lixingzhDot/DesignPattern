package com.lixingzh.java.designpattern;

/**
 * Created by magicxdms on 1/31/18.
 */

import com.lixingzh.java.designpattern.composite.MenuComponent;
import com.lixingzh.java.designpattern.composite.Waitress;
import com.lixingzh.java.designpattern.composite.impl.Menu;
import com.lixingzh.java.designpattern.composite.impl.MenuItem;

/**
 * Composite Pattern
 * Allows you to compose objecs into tree structures to represent part-whole hierarchies.
 * Composite lets clients treat individual objects and compositions of objects uniformly.
 *
 * A tree like hierarchy.
 */
public class CompositePatternMain {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");

        MenuComponent allMenu = new Menu("ALL MENU", "All menus combined");
        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);

        dinerMenu.add(new MenuItem("pasta", "Spaghetti with Mrinara Sauce", 3.89, true));
        cafeMenu.add(new MenuItem("mocha", "coffee + milk + choclate", 1.11, false));

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
    }
}
