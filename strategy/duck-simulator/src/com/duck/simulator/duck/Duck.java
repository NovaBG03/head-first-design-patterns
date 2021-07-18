package com.duck.simulator.duck;

import com.duck.simulator.duck.behavior.fly.FlyBehavior;
import com.duck.simulator.duck.behavior.quack.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void fly() {
        this.flyBehavior.performFly();
    }

    public void quack() {
        this.quackBehavior.performQuack();
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public abstract void display();
}
