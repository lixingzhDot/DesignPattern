package com.lixingzh.java.designpattern.waterstation.buildin;

import com.lixingzh.java.designpattern.waterstation.service.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayObserver implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("Current conditions Java Buildin Observer: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherStationObservable) {
            WeatherStationObservable wso = (WeatherStationObservable) o;
            this.temperature = wso.getTemperature();
            this.humidity = wso.getHumidity();
            this.pressure = wso.getPressure();

            display();
        }
    }
}
