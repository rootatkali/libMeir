package basics;

public class Line4D {
  private Point4D pStart;
  
  private Point4D pEnd;
  
  public Line4D(Point4D ps, Point4D pe) {
    this.pStart = new Point4D(ps);
    this.pEnd = new Point4D(pe);
  }
  
  public Line4D(Line4D l) {
    this.pStart = new Point4D(l.getpStart());
    this.pEnd = new Point4D(l.getpEnd());
  }
  
  public Point4D getpStart() {
    return this.pStart;
  }
  
  public void setpStart(Point4D pStart) {
    this.pStart = pStart;
  }
  
  public Point4D getpEnd() {
    return this.pEnd;
  }
  
  public void setpEnd(Point4D pEnd) {
    this.pEnd = pEnd;
  }
  
  public String toString() {
    return "Line4D [pStart=" + this.pStart + ", pEnd=" + this.pEnd + "]";
  }
  
  public boolean equals(Line4D other) {
    return toString().equals(other.toString());
  }
  
  public double length() {
    return this.pStart.distance(this.pEnd);
  }
}
