import canvasML.Canvas;

import java.util.Objects;

public class CanvasTest {
  public static void main(String[] args) {
    Objects.requireNonNull(Canvas.getCanvas()).wait(1000);
    System.exit(0);
  }
}
