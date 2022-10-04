package com.headfirst.duckuapp.duck;

import com.headfirst.duckuapp.behaviors.fly.FlyWithWings;
import com.headfirst.duckuapp.behaviors.quack.Quack;

public class MallardDuck extends Duck{

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }
}
