package com.lixingzh.java.designpattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumAdatper implements Iterator {
    Enumeration enumeration;

    public IteratorToEnumAdatper(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
