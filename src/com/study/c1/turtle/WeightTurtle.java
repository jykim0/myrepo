/*
 * @author jyk
 * @since 160413
 * 
 */

package com.study.c1.turtle;

import ch.aplu.turtle.*;
import java.awt.Color;

public class WeightTurtle extends Turtle {
  protected int weight;
  public WeightTurtle(int w){
    weight=w;
    setColor(Color.red);
    setPenColor(Color.red);
  }
  public int getWeight(){
    return weight;
  }
}