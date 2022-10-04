package com.headfirst.duckuapp;

import com.headfirst.duckuapp.behaviors.fly.FlyRocketPowered;
import com.headfirst.duckuapp.duck.Duck;
import com.headfirst.duckuapp.duck.MallardDuck;
import com.headfirst.duckuapp.duck.ModelDuck;

/*
  Example of a strategy pattern usage:
    The Strategy Pattern defines a family of algorithms,
    encapsulates each one, and makes them interchangeable.
    Strategy lets the algorithm vary independently from
    clients that use it.

  The main point of this pattern: let you change behavior at runtime.
  See the model duck. At the first time it couldn't fly, but at runtime
  were added some rockets to it!
*/

public class MainClass {

  public static void main(String[] args) {
    System.out.println("Duck simulator");

    System.out.println("\nI'm a mallard duck");
    Duck mallard = new MallardDuck();
    mallard.swim();
    mallard.performQuack();
    mallard.performFly();

    System.out.println("\nNow it's time to build a model duck on the go");
    Duck model = new ModelDuck();
    model.performFly();
    System.out.println("Let's add some rockets...");
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
