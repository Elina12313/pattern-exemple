package Factory;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class RectangularMaker implements ShapeMaker {
private double x;
private double y ;
private double width;

private  double height;

    public RectangularMaker(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public RectangularShape buildShape() {
        return  new Rectangle2D.Double(x, y, width, height);
    }
}
