package com.duck.simulator.duck.behavior.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("...");
    }
}
