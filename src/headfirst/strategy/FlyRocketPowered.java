/*
 * @author jyk
 * @since 160413
 * 
 */

package headfirst.strategy;

public class FlyRocketPowered implements FlyBehavior {
  public void fly() {
    System.out.println("I'm flying with a rocket.");
  }
}