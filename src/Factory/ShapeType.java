package Factory;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public enum ShapeType {
RECTANGLE {
    @Override
    public Rectangle2D.Double createShape() {
        return new Rectangle2D.Double();
    }
},
    ELLIPSE{
        @Override
        public Ellipse2D.Double createShape() {
            return new Ellipse2D.Double();
        }
    };
public abstract Object createShape();
}
