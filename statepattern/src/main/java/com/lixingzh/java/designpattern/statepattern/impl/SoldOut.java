package com.lixingzh.java.designpattern.statepattern.impl;

import com.lixingzh.java.designpattern.statepattern.GumballMachineState;

public class SoldOut implements GumballMachineState {
    GumballMachine machine;

    public SoldOut(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("not supported");
    }

    @Override
    public void ejectQuater() {
        System.out.println("not supported");
    }

    @Override
    public void turnCrank() {
        System.out.println("not supported");
    }

    @Override
    public void dispense() {
        System.out.println("not supported");
    }
}
