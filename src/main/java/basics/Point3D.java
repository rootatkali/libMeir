package basics;

public class Point3D {
  double xx;
  
  double yy;
  
  double zz;
  
  public Point3D(double xx, double yy, double zz) {
    this.xx = xx;
    this.yy = yy;
    this.zz = zz;
  }
  
  public Point3D() {
    this.xx = 0.0D;
    this.yy = 0.0D;
    this.zz = 0.0D;
  }
  
  public Point3D(Point3D p) {
    this.xx = p.getXx();
    this.yy = p.getYy();
    this.zz = p.getZz();
  }
  
  public double getXx() {
    return this.xx;
  }
  
  public void setXx(double xx) {
    this.xx = xx;
  }
  
  public double getYy() {
    return this.yy;
  }
  
  public void setYy(double yy) {
    this.yy = yy;
  }
  
  public double getZz() {
    return this.zz;
  }
  
  public void setZz(double zz) {
    this.zz = zz;
  }
  
  public double distance(Point3D pt) {
    return Math.sqrt((this.xx - pt.getXx()) * (this.xx - pt.getXx()) + (this.yy - pt.getYy()) * (this.yy - pt.getYy()) + (this.zz - pt.getZz()) * (this.zz - pt.getZz()));
  }
  
  public boolean eqauls(Point3D other) {
    return (this.xx == other.getXx() && this.yy == other.getYy() && this.zz == other.getZz());
  }
  
  public String toString() {
    return "Point3D [xx=" + this.xx + ", yy=" + this.yy + ", zz=" + this.zz + "]";
  }
}
