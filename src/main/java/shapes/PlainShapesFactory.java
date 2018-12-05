package shapes;

public class PlainShapesFactory implements AbstractShapeFactory{

    private double size;
    private double width;

    public PlainShapesFactory(double size){
        this.size=size;
    }

    public PlainShapesFactory(double size, double width){
        this.size=size;
        this.width=width;
    }


    @Override
    public Shape createCircle() {
        return new Circle(this.size);
    }

    @Override
    public Shape createSquare() {
        return new Square(this.size);
    }

    @Override
    public Shape createRectangle() {
        return new Rectangle(this.size,this.width);
    }
}
