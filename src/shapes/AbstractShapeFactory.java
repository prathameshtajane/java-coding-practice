package shapes;

public interface AbstractShapeFactory {
    Shape createCircle();
    Shape createSquare();
    Shape createRectangle();
}
