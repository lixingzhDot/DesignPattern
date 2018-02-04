package com.lixingzh.java.designpattern.statepattern;

public interface GumballMachineState {
    public void insertQuarter();
    public void ejectQuater();
    public void turnCrank();
    public void dispense();
}
