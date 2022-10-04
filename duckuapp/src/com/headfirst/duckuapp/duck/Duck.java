package com.headfirst.duckuapp.duck;

import com.headfirst.duckuapp.behaviors.fly.FlyBehavior;
import com.headfirst.duckuapp.behaviors.quack.QuackBehavior;

public class Duck {

  QuackBehavior quackBehavior;
  FlyBehavior flyBehavior;

  public Duck() {
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }

}