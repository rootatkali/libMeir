// 
// Decompiled by Procyon v0.5.36
// 

package canvasML;

import javax.swing.*;
import java.awt.*;

public class Canvas {
  public static final int WIDTH = 600;
  public static final int HEIGHT = 400;
  public static Canvas canvasSingleton;
  public static int DefaultWaitTime;

  static {
    Canvas.DefaultWaitTime = 30;
  }

  public CanvasPane canvas;
  public Graphics2D graphic;
  private final JFrame frame;
  private Color backgroundColour;
  private Image canvasImage;
  
  private Canvas(final String title, final int width, final int height, final Color bgColour) {
    this.frame = new JFrame();
    this.canvas = new CanvasPane();
    this.frame.setContentPane(this.canvas);
    this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.frame.setLocationRelativeTo(null);
    this.frame.setTitle(title);
    this.canvas.setPreferredSize(new Dimension(width, height));
    this.backgroundColour = bgColour;
    this.frame.pack();
    this.frame.toFront();
  }
  
  public static void setWaitFast() {
    Canvas.DefaultWaitTime = 0;
  }
  
  public static void setWaitNormal() {
    Canvas.DefaultWaitTime = 30;
  }
  
  public static void setWaitSlow() {
    Canvas.DefaultWaitTime = 100;
  }
  
  public static Canvas getCanvas() {
    if (!Chk.newChkDate()) {
      return null;
    }
    if (Canvas.canvasSingleton == null) {
      Canvas.canvasSingleton = new Canvas(Chk.chkVersion(), WIDTH, HEIGHT, Color.white);
    }
    Canvas.canvasSingleton.setVisible(true);
    return Canvas.canvasSingleton;
  }
  
  public boolean isVisible() {
    return this.frame.isVisible();
  }
  
  public void setVisible(final boolean visible) {
    if (this.graphic == null) {
      final Dimension size = this.canvas.getSize();
      this.canvasImage = this.canvas.createImage(size.width, size.height);
      (this.graphic = (Graphics2D) this.canvasImage.getGraphics()).setColor(this.backgroundColour);
      this.graphic.fillRect(0, 0, size.width, size.height);
      this.graphic.setColor(Color.black);
    }
    this.frame.setVisible(visible);
  }
  
  public void draw(final Shape shape) {
    this.graphic.draw(shape);
    this.canvas.repaint();
  }
  
  public void fill(final Shape shape) {
    this.graphic.fill(shape);
    this.canvas.repaint();
    this.wait(Canvas.DefaultWaitTime);
  }
  
  public void erase(final Shape shape) {
    final Color original = this.graphic.getColor();
    this.graphic.setColor(this.backgroundColour);
    this.graphic.fill(shape);
    this.graphic.setColor(original);
    this.canvas.repaint();
  }
  
  public void eraseOutline(final Shape shape) {
    final Color original = this.graphic.getColor();
    this.graphic.setColor(this.backgroundColour);
    this.graphic.draw(shape);
    this.graphic.setColor(original);
    this.canvas.repaint();
  }
  
  public boolean drawImage(final Image image, final int x, final int y) {
    System.out.println(image);
    final boolean result = this.graphic.drawImage(image, x, y, null);
    System.out.println(result);
    this.canvas.repaint();
    return result;
  }
  
  public void drawString(final String text, final int x, final int y) {
    this.graphic.drawString(text, x, y);
    this.canvas.repaint();
  }
  
  public void eraseString(final String text, final int x, final int y) {
    final Color original = this.graphic.getColor();
    this.graphic.setColor(this.backgroundColour);
    this.graphic.drawString(text, x, y);
    this.graphic.setColor(original);
    this.canvas.repaint();
  }
  
  public void drawLine(final int x1, final int y1, final int x2, final int y2) {
    this.graphic.drawLine(x1, y1, x2, y2);
    this.canvas.repaint();
    this.wait(Canvas.DefaultWaitTime);
  }
  
  public void eraseLine(final int x1, final int y1, final int x2, final int y2) {
    final Color original = this.graphic.getColor();
    this.graphic.setColor(this.backgroundColour);
    this.graphic.drawLine(x1, y1, x2, y2);
    this.canvas.repaint();
  }
  
  public void setForegroundColour(final int r, final int g, final int b) {
    this.graphic.setColor(new Color(r, g, b));
  }
  
  public Color getForegroundColour() {
    return this.graphic.getColor();
  }
  
  public void setForegroundColour(final String colourString) {
    if (!colourString.equals("")) {
      if (colourString.equals("red")) {
        this.graphic.setColor(Color.red);
      } else if (colourString.equals("black")) {
        this.graphic.setColor(Color.black);
      } else if (colourString.equals("blue")) {
        this.graphic.setColor(Color.blue);
      } else if (colourString.equals("yellow")) {
        this.graphic.setColor(Color.yellow);
      } else if (colourString.equals("green")) {
        this.graphic.setColor(Color.green);
      } else if (colourString.equals("magenta")) {
        this.graphic.setColor(Color.magenta);
      } else if (colourString.equals("white")) {
        this.graphic.setColor(Color.white);
      } else if (colourString.equals("gray")) {
        this.graphic.setColor(Color.gray);
      } else if (colourString.equals("orange")) {
        this.graphic.setColor(Color.orange);
      } else {
        this.graphic.setColor(Color.black);
      }
    }
  }
  
  public void setForegroundColour(final Color newColour) {
    this.graphic.setColor(newColour);
  }
  
  public void setForegroundColour(final RedGreenBlue rgb) {
    if (rgb != null) {
      this.graphic.setColor(new Color(rgb.getRed(), rgb.getGreen(), rgb.getBlue()));
    }
  }
  
  public Color getBackgroundColour() {
    return this.backgroundColour;
  }
  
  public void setBackgroundColour(final Color newColour) {
    this.backgroundColour = newColour;
    this.graphic.setBackground(newColour);
  }
  
  public Font getFont() {
    return this.graphic.getFont();
  }
  
  public void setFont(final Font newFont) {
    this.graphic.setFont(newFont);
  }
  
  public void setSize(final int width, final int height) {
    this.canvas.setPreferredSize(new Dimension(width, height));
    this.frame.pack();
  }
  
  public Dimension getSize() {
    return this.canvas.getSize();
  }
  
  public void wait(final int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (Exception ex) {
    }
  }
  
  private class CanvasPane extends JPanel {
    @Override
    public void paint(final Graphics g) {
      g.drawImage(Canvas.this.canvasImage, 0, 0, null);
    }
  }
}
