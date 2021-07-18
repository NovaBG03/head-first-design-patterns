package com.duck.simulator.duck.behavior.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("Flying with wings");
    }
}
