import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the PainterPlus object to the right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
//take all paint from the buckets.
  public void takeAllPaint() {
   while(isOnBucket()) 
     takePaint();
  }
  //paints a straight line
 public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }
  //makes painter 180
   public void turnAround() {
    turnLeft();
    turnLeft();
  }
}