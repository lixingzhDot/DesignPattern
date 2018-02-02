package com.lixingzh.java.designpattern.composite.impl;

import com.lixingzh.java.designpattern.composite.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by magicxdms on 2/1/18.
 */
public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        } else {
          Iterator iterator = stack.peek();
          if(!iterator.hasNext()) {
              stack.pop();
              return hasNext();
          }

          return true;
        }
    }

    @Override
    public Object next() {
        if(hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof Menu) {
                stack.push(component.createIterator());
            }

            return component;
        } else {
            return null;
        }
    }
}
