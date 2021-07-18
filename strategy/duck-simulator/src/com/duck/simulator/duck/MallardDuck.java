package com.duck.simulator.duck;

import com.duck.simulator.duck.behavior.fly.FlyWithWings;
import com.duck.simulator.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
