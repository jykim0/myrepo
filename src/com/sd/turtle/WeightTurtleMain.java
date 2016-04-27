/*
 * @author jyk
 * @since 160413
 * 
 */


package com.sd.turtle;

import ch.aplu.turtle.*;
import java.awt.Color;

public class WeightTurtleMain {
  public static void main(String[] args) {
    WeightTurtle wt = new WeightTurtle(100);
    System.out.println("Hello weight turtle");
    wt.addStatusBar(30); /* height of bar */
    String msg="Hello I weight "+wt.getWeight()+" kg.";
    wt.setStatusText(msg); /* msg in bar*/
  }
}