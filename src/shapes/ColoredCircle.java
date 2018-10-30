package shapes;

public class ColoredCircle extends Circle{
    private String color;
    public ColoredCircle(double radius,String color){
        super(radius);
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
}
