package com.duck.simulator.duck;

import com.duck.simulator.duck.behavior.fly.FlyWithWings;
import com.duck.simulator.duck.behavior.quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Redhead Duck");
    }
}
