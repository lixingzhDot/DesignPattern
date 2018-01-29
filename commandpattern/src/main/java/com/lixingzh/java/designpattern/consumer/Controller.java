package com.lixingzh.java.designpattern.consumer;

import com.lixingzh.java.designpattern.producer.Command;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Command> commands;

    public Controller() {
        commands = new ArrayList<>();
    }

    public void processing() {
        if(null != commands && !commands.isEmpty()) {
            for(Command cmd : commands) {
                System.out.println("processing commands");
                cmd.execute();
                //commands.remove(cmd);
            }
        }
    }

    public void addCommand(Command cmd) {
        commands.add(cmd);
    }
}
