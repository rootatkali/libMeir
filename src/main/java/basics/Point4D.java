package basics;

public class Point4D {
  private int x;
  
  private int y;
  
  private int z;
  
  private int t;
  
  public Point4D(int x, int y, int z, int t) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.t = t;
  }
  
  public Point4D(Point4D p) {
    this.x = p.getX();
    this.y = p.getY();
    this.z = p.getZ();
    this.t = p.getT();
  }
  
  public int getX() {
    return this.x;
  }
  
  public void setX(int x) {
    this.x = x;
  }
  
  public int getY() {
    return this.y;
  }
  
  public void setY(int y) {
    this.y = y;
  }
  
  public int getZ() {
    return this.z;
  }
  
  public void setZ(int z) {
    this.z = z;
  }
  
  public int getT() {
    return this.t;
  }
  
  public void setT(int t) {
    this.t = t;
  }
  
  public String toString() {
    return "Point4D [x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", t=" + this.t + "]";
  }
  
  public boolean equals(Point4D other) {
    if (this == other)
      return true;
    if (other == null)
      return false;
    if (this.t != other.t)
      return false;
    if (this.x != other.x)
      return false;
    if (this.y != other.y)
      return false;
    return this.z == other.z;
  }
  
  public int distance(Point4D p) {
    return
        (int) Math.sqrt(Math.pow((this.x - p.getX()), 2.0D) +
            Math.pow((this.y - p.getY()), 2.0D) +
            Math.pow((this.z - p.getZ()), 2.0D) +
            Math.pow((this.t - p.getT()), 2.0D));
  }
}
