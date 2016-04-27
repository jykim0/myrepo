package com.j1.coffee;
public abstract class Beverage {
  String description = "Unknown Beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}
