package com.duck.simulator.duck.behavior.quack;

public class Quack implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("Quack!");
    }
}
