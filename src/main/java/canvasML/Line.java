// 
// Decompiled by Procyon v0.5.36
// 

package canvasML;

public class Line {
  int xPosition;
  int yPosition;
  int xEnd;
  int yEnd;
  String color;
  
  public Line(final int xPosition, final int yPosition, final int xEnd, final int yEnd, final String color) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.xEnd = xEnd;
    this.yEnd = yEnd;
    this.color = color;
    this.draw();
  }
  
  public Line(final Line l) {
    this.xPosition = l.getXs();
    this.yPosition = l.getYs();
    this.xEnd = l.getXe();
    this.yEnd = l.getYe();
    this.color = l.getCol();
    this.draw();
  }
  
  public void setPoints(final int Xs, final int Ys, final int Xe, final int Ye) {
    this.xEnd = Xe;
    this.yEnd = Ye;
    this.xPosition = Xs;
    this.yPosition = Ys;
  }
  
  public int getXs() {
    return this.xPosition;
  }
  
  public int getYs() {
    return this.yPosition;
  }
  
  public int getXe() {
    return this.xEnd;
  }
  
  public int getYe() {
    return this.yEnd;
  }
  
  public String getCol() {
    return this.color;
  }
  
  public void moveTo(final int newX, final int newY) {
    this.xEnd = this.xEnd - this.xPosition + newX;
    this.yEnd = this.yEnd - this.yPosition + newY;
    this.xPosition = newX;
    this.yPosition = newY;
  }
  
  public void move(final int deltaX, final int deltaY) {
    this.xPosition += deltaX;
    this.yPosition += deltaY;
    this.xEnd += deltaX;
    this.yEnd += deltaY;
  }
  
  public void changeSize(final int deltaLength) {
    this.xEnd = (this.xEnd - this.xPosition) * deltaLength;
    this.yEnd = (this.yEnd - this.yPosition) * deltaLength;
  }
  
  public void changeSizeTo(final int deltaLength) {
    final double cc =
        Math.sqrt((this.xEnd - this.xPosition) * (this.xEnd - this.xPosition) + (this.yEnd - this.yPosition) * (this.yEnd - this.yPosition));
    final double deltaX = deltaLength * (double) (this.xEnd - this.xPosition) / cc;
    final double deltaY = deltaLength * (double) (this.yEnd - this.yPosition) / cc;
    this.xEnd += (int) deltaX;
    this.yEnd += (int) deltaY;
  }
  
  public void changeColor(final String newColor) {
    this.color = newColor;
  }
  
  public void draw() {
    final Canvas canvas = Canvas.getCanvas();
    canvas.setForegroundColour(this.color);
    canvas.drawLine(this.xPosition, this.yPosition, this.xEnd, this.yEnd);
    canvas.wait(Canvas.DefaultWaitTime);
  }
  
  public void erase() {
    final Canvas canvas = Canvas.getCanvas();
    canvas.eraseLine(this.xPosition, this.yPosition, this.xEnd, this.yEnd);
  }
}
