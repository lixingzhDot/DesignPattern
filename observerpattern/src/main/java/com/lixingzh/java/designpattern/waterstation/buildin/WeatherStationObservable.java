package com.lixingzh.java.designpattern.waterstation.buildin;

import java.util.Observable;
import java.util.Observer;

public class WeatherStationObservable extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStationObservable() {
    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
