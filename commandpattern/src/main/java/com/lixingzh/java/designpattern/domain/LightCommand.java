package com.lixingzh.java.designpattern.domain;

import com.lixingzh.java.designpattern.producer.Command;

public class LightCommand implements Command {
    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.setOn(!light.isOn());
        System.out.println("light: " + light.getName() + " - " + light.isOn());
    }
}
