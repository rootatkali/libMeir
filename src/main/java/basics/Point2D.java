package basics;

public class Point2D {
  private double xx;
  
  private double yy;
  
  public Point2D() {
    this.xx = 0.0D;
    this.yy = 0.0D;
  }
  
  public Point2D(double xx, double yy) {
    this.xx = xx;
    this.yy = yy;
  }
  
  public double getX() {
    return this.xx;
  }
  
  public void setX(double xx) {
    this.xx = xx;
  }
  
  public double getY() {
    return this.yy;
  }
  
  public void setY(double yy) {
    this.yy = yy;
  }
  
  public double distance(Point2D pt) {
    return Math.sqrt((this.xx - pt.getX()) * (this.xx - pt.getX()) + (this.yy - pt.getY()) * (this.yy - pt.getY()));
  }
  
  public String toString() {
    return "Point2D [xx=" + this.xx + ", yy=" + this.yy + "]";
  }
  
  public boolean eqauls(Point2D other) {
    return (this.xx == other.getX() && this.yy == other.getY());
  }
}
