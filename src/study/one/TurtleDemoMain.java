package study.one;
import ch.aplu.turtle.*;

class TurtleDemoMain {
  Turtle t1 = new Turtle();

  TurtleDemoMain() {
    t1.forward(100);
    t1.right(90);
    t1.forward(100);
    t1.right(90);
    t1.forward(100);
    t1.right(90);
    t1.forward(100);
    t1.right(90);
  }

  public static void main(String[] args) {
    new TurtleDemoMain();
  }
}