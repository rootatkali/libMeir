// 
// Decompiled by Procyon v0.5.36
// 

package canvasML;

import java.awt.geom.Ellipse2D;

public class Ellipse {
  int diameterX;
  int diameterY;
  int xPosition;
  int yPosition;
  String color;
  RedGreenBlue rgb;
  
  public Ellipse(final int xPosition, final int yPosition, final int diameterX, final int diameterY,
                 final String color) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.diameterX = diameterX;
    this.diameterY = diameterY;
    this.color = color;
    this.rgb = null;
    this.draw();
  }
  
  public Ellipse(final int xPosition, final int yPosition, final int diameterX, final int diameterY, final int r,
                 final int g, final int b) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.diameterX = diameterX;
    this.diameterY = diameterY;
    this.color = "";
    this.rgb = new RedGreenBlue(r, g, b);
    this.draw();
  }
  
  public Ellipse(final int xPosition, final int yPosition, final int diameterX, final int diameterY,
                 final RedGreenBlue rgb) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.diameterX = diameterX;
    this.diameterY = diameterY;
    this.color = "";
    this.rgb = new RedGreenBlue(rgb.getRed(), rgb.getGreen(), rgb.getBlue());
    this.draw();
  }
  
  public Ellipse(final Ellipse e) {
    this.xPosition = e.getX();
    this.yPosition = e.getY();
    this.diameterX = e.getDiaX();
    this.diameterY = e.getDiaY();
    this.color = e.getCol();
    if (e.getRGB() != null) {
      this.rgb = new RedGreenBlue(e.getRGB());
    } else {
      this.rgb = null;
    }
    this.draw();
  }
  
  public Ellipse(final int xPosition, final int yPosition, final int diameterX, final int diameterY,
                 final String color, final boolean draw) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.diameterX = diameterX;
    this.diameterY = diameterY;
    this.color = color;
    if (draw) {
      this.draw();
    }
  }
  
  public void moveTo(final int newX, final int newY) {
    this.xPosition = newX;
    this.yPosition = newY;
  }
  
  public void move(final int deltaX, final int deltaY) {
    this.xPosition += deltaX;
    this.yPosition += deltaY;
  }
  
  public void changeSizeTo(final int newDiameterX, final int newDiameterY) {
    this.diameterX = newDiameterX;
    this.diameterY = newDiameterY;
  }
  
  public void changeSize(final int deltaDiameter) {
    this.diameterX *= deltaDiameter;
    this.diameterY *= deltaDiameter;
  }
  
  public void changeSize(final double deltaDiameter) {
    this.diameterX *= (int) deltaDiameter;
    this.diameterY *= (int) deltaDiameter;
  }
  
  public void changeColor(final String newColor) {
    this.color = newColor;
  }
  
  public void draw() {
    final Canvas canvas = Canvas.getCanvas();
    if (this.rgb != null) {
      canvas.setForegroundColour(this.rgb);
    } else if (!this.color.equals("")) {
      canvas.setForegroundColour(this.color);
    } else {
      canvas.setForegroundColour("black");
    }
    canvas.fill(new Ellipse2D.Double(this.xPosition, this.yPosition, this.diameterX, this.diameterY));
    canvas.wait(Canvas.DefaultWaitTime);
  }
  
  public void erase() {
    final Canvas canvas = Canvas.getCanvas();
    canvas.erase(new Ellipse2D.Double(this.xPosition, this.yPosition, this.diameterX, this.diameterY));
  }
  
  public int getX() {
    return this.xPosition;
  }
  
  public void setX(final int x) {
    this.xPosition = x;
  }
  
  public int getY() {
    return this.yPosition;
  }
  
  public void setY(final int y) {
    this.yPosition = y;
  }
  
  public int getDiaX() {
    return this.diameterX;
  }
  
  public void setDiaX(final int x) {
    this.diameterX = x;
  }
  
  public int getDiaY() {
    return this.diameterY;
  }
  
  public void setDiaY(final int y) {
    this.diameterY = y;
  }
  
  public String getCol() {
    return this.color;
  }
  
  public void setCol(final String col) {
    this.color = col;
  }
  
  public RedGreenBlue getRGB() {
    if (this.rgb != null) {
      return new RedGreenBlue(this.rgb);
    }
    return null;
  }
  
  public void setRGB(final RedGreenBlue rgb) {
    this.rgb = new RedGreenBlue(rgb);
  }
  
  @Override
  public String toString() {
    if (this.rgb != null) {
      return this.xPosition + " " + this.yPosition + " " + this.diameterX + " " + this.diameterY + " "
          + this.color + " " + this.rgb.toString();
    }
    return this.xPosition + " " + this.yPosition + " " + this.diameterX + " " + this.diameterY + " " + this.color;
  }
}
