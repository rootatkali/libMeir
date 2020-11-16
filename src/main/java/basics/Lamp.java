package basics;

public class Lamp {
  String color;
  
  double weight;
  
  double height;
  
  boolean status;
  
  int strength;
  
  public Lamp(String color, double weight, double height, boolean status, int strength) {
    this.color = color;
    this.weight = weight;
    this.height = height;
    this.status = status;
    this.strength = strength;
  }
  
  public Lamp() {
    this.color = "blue";
    this.weight = 2.5D;
    this.height = 0.9D;
    this.status = false;
    this.strength = 0;
  }
  
  public String getColor() {
    return this.color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public double getWeight() {
    return this.weight;
  }
  
  public void setWeight(double weight) {
    this.weight = weight;
  }
  
  public double getHeight() {
    return this.height;
  }
  
  public void setHeight(double height) {
    this.height = height;
  }
  
  public boolean getStatus() {
    return this.status;
  }
  
  public void setStatus(boolean status) {
    this.status = status;
  }
  
  public int getStrength() {
    return this.strength;
  }
  
  public void setStrength(int strength) {
    this.strength = strength;
  }
  
  public String toString() {
    return "Lamp [color=" + this.color + ", weight=" + this.weight + ", height=" + this.height + ",status=" + this.status + ",strength=" + this.strength + "]";
  }
}
