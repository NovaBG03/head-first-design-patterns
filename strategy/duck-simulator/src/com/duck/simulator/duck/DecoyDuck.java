package com.duck.simulator.duck;

import com.duck.simulator.duck.behavior.fly.FlyNoWay;
import com.duck.simulator.duck.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }
}
