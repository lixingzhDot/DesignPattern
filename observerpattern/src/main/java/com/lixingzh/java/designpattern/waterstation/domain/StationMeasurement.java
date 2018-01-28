package com.lixingzh.java.designpattern.waterstation.domain;

import com.lixingzh.java.designpattern.waterstation.service.Observer;
import com.lixingzh.java.designpattern.waterstation.service.Subject;

public class StationMeasurement implements Observer{
    private String name;
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherStation;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public Subject getWeatherStation() {
        return weatherStation;
    }

    public void setWeatherStation(Subject weatherStation) {
        this.weatherStation = weatherStation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temp;
        this.pressure = pressure;
    }

    public StationMeasurement(Subject weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }
}
