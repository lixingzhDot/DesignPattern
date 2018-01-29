package com.lixingzh.java.designpattern.domain;

import com.lixingzh.java.designpattern.producer.Command;

public class DoorCommand implements Command {
    Door door;

    public DoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.setOn(!door.isOn());
        System.out.println("light: " + door.getName() + " - " + door.isOn());
    }
}
