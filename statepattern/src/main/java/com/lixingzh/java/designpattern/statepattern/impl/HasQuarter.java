package com.lixingzh.java.designpattern.statepattern.impl;

import com.lixingzh.java.designpattern.statepattern.GumballMachineState;

public class HasQuarter implements GumballMachineState {
    GumballMachine machine;

    public HasQuarter(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("not supported");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Quarter Ejected");
        machine.setCurState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank Turning");
        machine.setCurState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("not supported");
    }
}
