package com.lixingzh.java.designpattern;

import com.lixingzh.java.designpattern.consumer.Controller;
import com.lixingzh.java.designpattern.producer.CommandLoader;

/**
 * Command Pattern
 * encapsulates a request as an object, thereby letting you parameterize other objects
 * with different requests queue or log request, queue, log requests, and support undoable operations.
 *
 * Self Understanding:
 * This pattern have 3 main parts:
 * 1. Command Producer(s) - initiate the command object which implements command interface.
 * 2. Command Consumer(s) - able to accept command and manage the received command.
 * 3. The communication between producer and consumer to allow the command could be transmitted.
 */
public class CommandPatternMain {

    public static void main(String[] args) {
        Controller controller = new Controller();
        CommandLoader loader = new CommandLoader(controller);
        controller.processing();
        controller.processing();
        controller.processing();
        controller.processing();
    }
}
