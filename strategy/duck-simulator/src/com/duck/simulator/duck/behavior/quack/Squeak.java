package com.duck.simulator.duck.behavior.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("Squeak!");
    }
}
