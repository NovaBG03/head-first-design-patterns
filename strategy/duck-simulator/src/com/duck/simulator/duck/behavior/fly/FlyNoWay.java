package com.duck.simulator.duck.behavior.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("Can't fly");
    }
}
