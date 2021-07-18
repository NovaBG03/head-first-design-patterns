package com.duck.simulator.duck;

import com.duck.simulator.duck.behavior.fly.FlyNoWay;
import com.duck.simulator.duck.behavior.quack.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
