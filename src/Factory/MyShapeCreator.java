package Factory;

public class MyShapeCreator {
    private ShapeMaker shapeMaker;

    public MyShapeCreator(ShapeMaker shapeMaker) {
        this.shapeMaker = shapeMaker;
    }
    public Object createShape() {
        return shapeMaker.buildShape();
    }

}
