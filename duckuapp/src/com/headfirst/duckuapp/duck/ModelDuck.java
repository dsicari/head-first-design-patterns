package com.headfirst.duckuapp.duck;

import com.headfirst.duckuapp.behaviors.fly.FlyNoWay;
import com.headfirst.duckuapp.behaviors.quack.Quack;

public class ModelDuck extends Duck{

  public ModelDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyNoWay();
  }

  public void display(){
    System.out.println("I'm a model duck");
  }
}
