package Factory;

import java.awt.geom.Ellipse2D;

public class EllipseMaker implements ShapeMaker{
    private double x;
    private double y ;
    private double width;
    private  double height;

    public EllipseMaker(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public Ellipse2D buildShape() {
        return new Ellipse2D.Double(x, y, width, height);
    }

}
