package basics;

public class Point {
  private int xPos;
  
  private int yPos;
  
  public Point(int x, int y) {
    this.xPos = x;
    this.yPos = y;
  }
  
  public void moveAbs(int x, int y) {
    this.xPos = x;
    this.yPos = y;
  }
  
  public void moveDelta(int x, int y) {
    this.xPos += x;
    this.yPos += y;
  }
  
  public int getX() {
    return this.xPos;
  }
  
  public void setX(int x) {
    this.xPos = x;
  }
  
  public int getY() {
    return this.yPos;
  }
  
  public void setY(int y) {
    this.yPos = y;
  }
  
  public int dist() {
    return (int) Math.sqrt((this.xPos * this.xPos + this.yPos * this.yPos));
  }
  
  public String toString() {
    return "(" + this.xPos + "," + this.yPos + ")";
  }
}
