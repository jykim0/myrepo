/*
 * @author jyk
 * @since 160413
 * 
 */

package headfirst.strategy;

public class MiniDuckSimulator1 {
  public static void main(String[] args){
    Duck mallard = new MallardDuck(); /*upcasting*/
    mallard.performQuack();
    mallard.performFly();
    
    Duck model = new ModelDuck(); /*upcasting*/
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}