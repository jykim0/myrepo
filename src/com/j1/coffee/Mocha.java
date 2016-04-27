package com.j1.coffee;
public class Mocha extends CondimentDecorator {
  Beverage beverage;
  public Mocha (Beverage beverage) {
    this.beverage=beverage;
  }
  public String getDescription(){
    return beverage.getDescription() + ",Mocah";
  }
  public double cost(){
    return .20 + beverage.cost();
  }
}  