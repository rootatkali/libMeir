// 
// Decompiled by Procyon v0.5.36
// 

package canvasML;

import java.awt.geom.Ellipse2D;

public class Circle {
  int diameter;
  int xPosition;
  int yPosition;
  String color;
  
  public Circle(final int xPosition, final int yPosition, final int diameter, final String color) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.diameter = diameter;
    this.color = color;
    this.draw();
  }
  
  public void moveTo(final int newX, final int newY) {
    this.xPosition = newX;
    this.yPosition = newY;
  }
  
  public void move(final int deltaX, final int deltaY) {
    this.xPosition += deltaX;
    this.yPosition += deltaY;
  }
  
  public void changeSizeTo(final int newDiameter) {
    this.diameter = newDiameter;
  }
  
  public void changeSize(final int deltaDiameter) {
    this.diameter *= deltaDiameter;
  }
  
  public void changeColor(final String newColor) {
    this.color = newColor;
  }
  
  public int getDiameter() {
    return this.diameter;
  }
  
  public void setDiameter(final int diameter) {
    this.diameter = diameter;
  }
  
  public int getxPosition() {
    return this.xPosition;
  }
  
  public void setxPosition(final int xPosition) {
    this.xPosition = xPosition;
  }
  
  public int getyPosition() {
    return this.yPosition;
  }
  
  public void setyPosition(final int yPosition) {
    this.yPosition = yPosition;
  }
  
  public String getColor() {
    return this.color;
  }
  
  public void setColor(final String color) {
    this.color = color;
  }
  
  public void draw() {
    final Canvas canvas = Canvas.getCanvas();
    canvas.setForegroundColour(this.color);
    canvas.fill(new Ellipse2D.Double(this.xPosition, this.yPosition, this.diameter, this.diameter));
    canvas.wait(Canvas.DefaultWaitTime);
  }
  
  public void erase() {
    final Canvas canvas = Canvas.getCanvas();
    canvas.erase(new Ellipse2D.Double(this.xPosition, this.yPosition, this.diameter, this.diameter));
  }
}
