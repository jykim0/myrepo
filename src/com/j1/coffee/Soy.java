package com.j1.coffee;

public class Soy extends CondimentDecorator {
  Beverage beverage;
  public Soy (Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription() + " , Soy";
  }
  public double cost(){
    return .10 + beverage.cost();
  }
}