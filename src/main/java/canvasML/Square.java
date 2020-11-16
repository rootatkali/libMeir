// 
// Decompiled by Procyon v0.5.36
// 

package canvasML;

import java.awt.*;

public class Square {
  int side;
  int xPosition;
  int yPosition;
  String color;
  
  public Square(final int xPosition, final int yPosition, final int side, final String color) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.side = side;
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
  
  public void changeSideTo(final int newSide) {
    this.side = newSide;
  }
  
  public void changeSide(final int deltaSide) {
    this.side *= deltaSide;
  }
  
  public void changeColor(final String newColor) {
    this.color = newColor;
  }
  
  public void draw() {
    final Canvas canvas = Canvas.getCanvas();
    canvas.setForegroundColour(this.color);
    canvas.fill(new Rectangle(this.xPosition, this.yPosition, this.side, this.side));
    canvas.wait(Canvas.DefaultWaitTime);
  }
  
  public void erase() {
    final Canvas canvas = Canvas.getCanvas();
    canvas.erase(new Rectangle(this.xPosition, this.yPosition, this.side, this.side));
  }
  
  @Override
  public String toString() {
    String str = "";
    str = this.xPosition + " " + this.yPosition + " " + this.side + " " + this.color;
    return str;
  }
  
  public int getSide() {
    return this.side;
  }
  
  public void setSide(final int side) {
    this.side = side;
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
}
