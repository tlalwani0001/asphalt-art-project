import org.code.neighborhood.*;
// the follwoing code prints a checker pattern of the original white backround.
//the painter returns back to the orginal starting point and paints a chcker pattern going row to row.
public class CheckerPainter extends PainterPlus{
 public void paintBackround(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }

    paintLine(color, size);
    turnAround();
    moveToCorner();
  paintCheckerPattern();
   
  }  
   public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
   public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }
  public void paintCheckerPattern() {
       turnRight();
    turnRight();
    while (canMove()){
      move();
    }
      turnLeft();
     while (canMove()){
      move();
    }
    turnRight();
    turnRight();

    setPaint(256);

    while (canMove("south")) {
if (isFacingEast()){
  paint("black");
  move();
  move();
  paint("black");
   move();
  move();
  paint("black");
   move();
  move();
  paint("black");
   move();
  move();
  paint("black");
   move();
  move();
  paint("black");
   move();
  move();
  paint("black");
   move();
  move();
  paint("black");
  move();
 turnRight();
  move();
  turnRight();
  
}
 
if (isFacingWest()) {
 paint("black");
  move();
  move();
  paint("black");
   move();
  move();
  paint("black");
   move();
  move();
  paint("black");
   move();
  move();
  paint("black");
   move();
  move();
  paint("black");
   move();
  move();
  paint("black");
   move();
  move();
  paint("black");
  move();
turnLeft();
  if (canMove()){
  move();
    
  }  
   turnLeft();   
      }
      

  }
   




    
  }




  
}