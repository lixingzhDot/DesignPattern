package com.lixingzh.java.designpattern.composite;

import java.util.Iterator;

/**
 * Created by magicxdms on 2/1/18.
 */
public class Waitress {
    MenuComponent menu;

    public Waitress(MenuComponent menu) {
        this.menu = menu;
    }

    public void printMenu() {
        Iterator iterator = menu.createIterator();
        while(iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if(component.isVegetarian()) {
                    component.print();
                }
            }
            catch(UnsupportedOperationException ex) {

            }
        }
    }
}
