package com.lixingzh.java.designpattern.producer;

import com.lixingzh.java.designpattern.consumer.Controller;
import com.lixingzh.java.designpattern.domain.Door;
import com.lixingzh.java.designpattern.domain.DoorCommand;
import com.lixingzh.java.designpattern.domain.Light;
import com.lixingzh.java.designpattern.domain.LightCommand;

public class CommandLoader{
    Command doorCmd = new DoorCommand(new Door("FrontDoor", false));
    Command lightCmd = new LightCommand(new Light("BedroomLight", false));
    Controller controller;

    public CommandLoader(Controller controller) {
        this.controller = controller;
        controller.addCommand(doorCmd);
        controller.addCommand(lightCmd);
    }
}