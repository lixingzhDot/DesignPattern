package com.lixingzh.java.designpattern.waterstation;

import com.lixingzh.java.designpattern.waterstation.buildin.CurrentConditionsDisplayObserver;
import com.lixingzh.java.designpattern.waterstation.buildin.WeatherStationObservable;
import com.lixingzh.java.designpattern.waterstation.service.impl.CurrentConditionsDisplay;
import com.lixingzh.java.designpattern.waterstation.service.impl.WeatherStation;

/**
 * Observer Pattern
 * Defines a one-to-many dependency between objects so that when one object changes state,
 * all of its dependents are ntified and updated automatically.
 *
 * Subject(Publisher) + Observer(Subscribers)
 *
 * The two objects are loosely coupled
 */
public class WeatherStationObserverPatternMain {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(station);

        station.setMeasurement(80, 65, (float)30.4);
        station.setMeasurement(82, 70, (float)29.4);

        WeatherStationObservable wso = new WeatherStationObservable();
        CurrentConditionsDisplayObserver ccdo = new CurrentConditionsDisplayObserver();
        wso.addObserver(ccdo);

        wso.setMeasurement(100, 100, 100);
    }
}
