package com.lixingzh.java.designpattern.statepattern.impl;

import com.lixingzh.java.designpattern.statepattern.GumballMachineState;

public class Sold implements GumballMachineState {
    GumballMachine machine;

    public Sold(GumballMachine machine) {
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
        machine.releaseBall();
        if(machine.getBallCount() > 0) {
            machine.setCurState(machine.getNoQuarterState());
        } else {
            System.out.println("Out of Stock");
            machine.setCurState(machine.soldoutState);
        }
    }
}
