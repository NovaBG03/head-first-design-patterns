package com.duck.simulator.duck;

import com.duck.simulator.duck.behavior.fly.FlyRocketPowered;
import com.duck.simulator.duck.behavior.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.setFlyBehavior(new FlyRocketPowered());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Model duck");
    }
}
