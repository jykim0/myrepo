/*
 * @author jyk
 * @since 160413
 * 
 */

package headfirst.strategy;

public class Quack implements QuackBehavior { 
  //interface implementation
  public void quack() {
    System.out.println("Quack");
  }
}