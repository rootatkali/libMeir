// 
// Decompiled by Procyon v0.5.36
// 

package canvasML;

import java.awt.*;

public class Rect {
  int vSide;
  int hSide;
  int xPosition;
  int yPosition;
  String color;
  
  public Rect(final int xPosition, final int yPosition, final int vSide, final int hSide, final String color) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.vSide = vSide;
    this.hSide = hSide;
    this.color = color;
    this.draw();
  }
  
  public Rect(final Rect r) {
    this.xPosition = r.getxPosition();
    this.yPosition = r.getyPosition();
    this.vSide = r.vSide;
    this.hSide = r.hSide;
    this.color = r.getColor();
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
  
  public void changeSideTo(final int newHSide, final int newVSide) {
    this.vSide = newVSide;
    this.hSide = newHSide;
  }
  
  public void changeSide(final int deltaSide) {
    this.vSide *= deltaSide;
    this.hSide *= deltaSide;
  }
  
  public void changeColor(final String newColor) {
    this.color = newColor;
  }
  
  public void draw() {
    final Canvas canvas = Canvas.getCanvas();
    canvas.setForegroundColour(this.color);
    canvas.fill(new Rectangle(this.xPosition, this.yPosition, this.hSide, this.vSide));
    canvas.wait(Canvas.DefaultWaitTime);
  }
  
  public void erase() {
    final Canvas canvas = Canvas.getCanvas();
    canvas.erase(new Rectangle(this.xPosition, this.yPosition, this.hSide, this.vSide));
  }
  
  @Override
  public String toString() {
    String str = "";
    str =
        str + this.xPosition + " " + this.yPosition + " " + this.vSide + " " + this.hSide + " " + this.color;
    return str;
  }
  
  public int getvSide() {
    return this.vSide;
  }
  
  public void setvSide(final int vSide) {
    this.vSide = vSide;
  }
  
  public int gethSide() {
    return this.hSide;
  }
  
  public void sethSide(final int hSide) {
    this.hSide = hSide;
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
