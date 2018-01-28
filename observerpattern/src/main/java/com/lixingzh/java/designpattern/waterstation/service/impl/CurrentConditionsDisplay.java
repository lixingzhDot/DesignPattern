package com.lixingzh.java.designpattern.waterstation.service.impl;

import com.lixingzh.java.designpattern.waterstation.domain.StationMeasurement;
import com.lixingzh.java.designpattern.waterstation.service.DisplayElement;
import com.lixingzh.java.designpattern.waterstation.service.Observer;
import com.lixingzh.java.designpattern.waterstation.service.Subject;

public class CurrentConditionsDisplay extends StationMeasurement implements Observer, DisplayElement  {

    @Override
    public void display() {
        System.out.println("Current conditions: " + getTemperature() + "F degrees and " + getHumidity() + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        setHumidity(humidity);
        setPressure(pressure);
        setTemperature(temp);

        display();
    }

    public CurrentConditionsDisplay(Subject weatherStation) {
        super(weatherStation);
    }
}
