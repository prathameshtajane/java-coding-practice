package shapes;

public class Application {
    public static void main(String args[]){
        AbstractShapeFactory shapeFactory = null;
        shapeFactory=new ColoredShapesFactory("pink",1);
        Shape circle = shapeFactory.createCircle();
    }
}
