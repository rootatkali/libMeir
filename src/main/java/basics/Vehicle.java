package basics;

public class Vehicle {
  int wheels;
  
  int length;
  
  int width;
  
  int passangers;
  
  public Vehicle(int wheels, int length, int width, int passangers) {
    this.wheels = wheels;
    this.length = length;
    this.width = width;
    this.passangers = passangers;
  }
  
  public int getWheels() {
    return this.wheels;
  }
  
  public void setWheels(int wheels) {
    this.wheels = wheels;
  }
  
  public int getLength() {
    return this.length;
  }
  
  public void setLength(int length) {
    this.length = length;
  }
  
  public int getWidth() {
    return this.width;
  }
  
  public void setWidth(int width) {
    this.width = width;
  }
  
  public int getPassangers() {
    return this.passangers;
  }
  
  public void setPassangers(int passangers) {
    this.passangers = passangers;
  }
  
  public String toString() {
    return "Vehicle [wheels=" + this.wheels + ", length=" + this.length + ", width=" + this.width + ", passangers=" + this.passangers +
        "]";
  }
}
