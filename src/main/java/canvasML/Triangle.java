// 
// Decompiled by Procyon v0.5.36
// 

package canvasML;

import java.awt.*;

public class Triangle {
  int width;
  int height;
  int xPosition;
  int yPosition;
  String color;
  
  public Triangle(final int xPosition, final int yPosition, final int width, final int height, final String color) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.width = width;
    this.height = height;
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
  
  public void changeSizeTo(final int newWidth, final int newHeight) {
    this.width = newWidth;
    this.height = newHeight;
  }
  
  public void changeSize(final int deltaSize) {
    this.width *= deltaSize;
    this.height *= deltaSize;
  }
  
  public void changeColor(final String newColor) {
    this.color = newColor;
  }
  
  public void draw() {
    final Canvas canvas = Canvas.getCanvas();
    canvas.setForegroundColour(this.color);
    final int[] xpoints = {this.xPosition, this.xPosition + this.width / 2, this.xPosition - this.width / 2};
    final int[] ypoints = {this.yPosition, this.yPosition + this.height, this.yPosition + this.height};
    canvas.fill(new Polygon(xpoints, ypoints, 3));
    canvas.wait(Canvas.DefaultWaitTime);
  }
  
  public void erase() {
    final Canvas canvas = Canvas.getCanvas();
    final int[] xpoints = {this.xPosition, this.xPosition + this.width / 2, this.xPosition - this.width / 2};
    final int[] ypoints = {this.yPosition, this.yPosition + this.height, this.yPosition + this.height};
    canvas.erase(new Polygon(xpoints, ypoints, 3));
  }
  
  public int getWidth() {
    return this.width;
  }
  
  public void setWidth(final int width) {
    this.width = width;
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public void setHeight(final int height) {
    this.height = height;
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
