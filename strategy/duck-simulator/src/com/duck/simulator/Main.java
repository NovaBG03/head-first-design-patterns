package com.duck.simulator;

import com.duck.simulator.duck.Duck;
import com.duck.simulator.duck.ModelDuck;

public class Main {

    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.quack();
        duck.fly();
    }
}
