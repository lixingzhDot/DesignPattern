package com.lixingzh.java.designpattern.waterstation.service;

public interface Subject {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObserver();
}
