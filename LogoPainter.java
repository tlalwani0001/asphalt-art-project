import org.code.neighborhood.*;
public class LogoPainter extends PainterPlus {
// The following code paints the youtube logo
  public void paintLogo() {
if (canMove()) {
  turnRight();
  move();
  move();
  move();
  move();
    turnLeft();
  move();
  move();
  move();
  move();
}
    if (canMove()) {
      paintLine("red", 8);
      turnRight();
      move();
      turnRight();
      paintLine("red", 10);
      turnLeft();
      move();
    turnLeft();
      move();
      paintLine("red", 10);
      turnRight();
      move();
      turnRight();
      move();
      paintLine("red", 10);
      turnLeft();
      move();
    turnLeft();
      move();
      paintLine("red", 10);
      turnRight();
      move();
      turnRight();
      move();
      paintLine("red", 10);
       turnLeft();
      move();
    turnLeft();
      move();
      paintLine("red", 10);
      turnRight();
      move();
      turnRight();
      move();
      move();
      paintLine("red", 8);
    }
    paintPlay();
   }
  // the following code prints the white play button inside of the red youtube logo.
public void paintPlay() {
  setPaint(5);
  turnRight();
  move();
  move();
  move();
  turnRight();
  move();
  move();
  move();
  move();
  paint("white");
    turnLeft();
  move();
  paint("white");
    move();
  paint("white");
  turnRight();
  turnRight();
  move();
  turnLeft();
  move();
  paint("white");
}

  
  }