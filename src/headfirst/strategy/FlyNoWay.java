/*
 * @author jyk
 * @since 160413
 * 
 */

package headfirst.strategy;

public class FlyNoWay implements FlyBehavior {
  public void fly(){
    System.out.println("I can't flying!");
  }
}