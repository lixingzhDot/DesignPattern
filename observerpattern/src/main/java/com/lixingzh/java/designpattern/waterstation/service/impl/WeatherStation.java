package com.lixingzh.java.designpattern.waterstation.service.impl;

import com.lixingzh.java.designpattern.waterstation.service.Observer;
import com.lixingzh.java.designpattern.waterstation.service.Subject;

import java.util.ArrayList;

public class WeatherStation implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        int i = observers.indexOf(ob);
        observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for(Observer ob : observers) {
            ob.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        this.notifyObserver();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObserver();
    }
}
