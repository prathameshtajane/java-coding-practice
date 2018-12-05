package shapes;

public class ColoredShapesFactory implements AbstractShapeFactory{

    private String color;
    private double size;
    private double width;

    public ColoredShapesFactory(String color,double size){
        this.color=color;
        this.size=size;
    }

    public ColoredShapesFactory(String color,double size,double width){
        this.color=color;
        this.size=size;
        this.width=width;
    }


    @Override
    public Shape createCircle() {
        return new ColoredCircle(this.size,this.color);
    }

    @Override
    public Shape createSquare() {
        return new ColoredSquare(this.size,this.color);
    }

    @Override
    public Shape createRectangle() {
        return new ColoredRectangle(this.size,this.width,this.color);
    }
}
