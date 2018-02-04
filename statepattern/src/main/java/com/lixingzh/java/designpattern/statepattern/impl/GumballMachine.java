package com.lixingzh.java.designpattern.statepattern.impl;

import com.lixingzh.java.designpattern.statepattern.GumballMachineState;

public class GumballMachine {
    NoQuarter noQuarterState;
    HasQuarter hasQuarterState;
    Sold soldState;
    SoldOut soldoutState;

    GumballMachineState curState;

    int ballCount;

    public GumballMachine(int ballCount) {
        this.ballCount = ballCount;
        noQuarterState = new NoQuarter(this);
        hasQuarterState = new HasQuarter(this);
        soldState = new Sold(this);
        soldoutState = new SoldOut(this);
    }

    public void insertQuarter() {
        curState.insertQuarter();
    }

    public void ejectQuarter() {
        curState.ejectQuater();
    }

    public void turnCrank() {
        curState.turnCrank();
    }

    public NoQuarter getNoQuarterState() {
        return noQuarterState;
    }

    public HasQuarter getHasQuarterState() {
        return hasQuarterState;
    }

    public Sold getSoldState() {
        return soldState;
    }

    public SoldOut getSoldoutState() {
        return soldoutState;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out");
        if(ballCount != 0) {
            --ballCount;
        }
    }

    public void setCurState(GumballMachineState curState) {
        this.curState = curState;
    }

    public int getBallCount() {
        return ballCount;
    }
}
