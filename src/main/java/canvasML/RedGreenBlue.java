// 
// Decompiled by Procyon v0.5.36
// 

package canvasML;

public class RedGreenBlue {
  private int red;
  private int green;
  private int blue;
  
  public RedGreenBlue(final int r, final int g, final int b) {
    this.red = r;
    this.green = g;
    this.blue = b;
  }
  
  public RedGreenBlue(final RedGreenBlue rgb) {
    this.red = rgb.getRed();
    this.green = rgb.getGreen();
    this.blue = rgb.getBlue();
  }
  
  public int getRed() {
    return this.red;
  }
  
  public void setRed(final int red) {
    this.red = red;
  }
  
  public int getGreen() {
    return this.green;
  }
  
  public void setGreen(final int green) {
    this.green = green;
  }
  
  public int getBlue() {
    return this.blue;
  }
  
  public void setBlue(final int blue) {
    this.blue = blue;
  }
  
  @Override
  public String toString() {
    return "RedGreenBlue [red=" + this.red + ", green=" + this.green + ", blue=" + this.blue + "]";
  }
  
  public boolean equals(final RedGreenBlue col) {
    return this.toString().equals(col.toString());
  }
}
