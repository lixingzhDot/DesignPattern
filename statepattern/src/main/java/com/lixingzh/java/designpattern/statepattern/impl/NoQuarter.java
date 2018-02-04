package com.lixingzh.java.designpattern.statepattern.impl;

import com.lixingzh.java.designpattern.statepattern.GumballMachineState;

public class NoQuarter implements GumballMachineState {
    GumballMachine machine;

    public NoQuarter(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter Inserted");
        machine.setCurState(machine.getHasQuarterState());
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
