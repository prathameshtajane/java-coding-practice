package shapes;

public class ColoredRectangle extends Rectangle{
    private String color;

    public ColoredRectangle(double width, double height,String color){
        super(width,height);
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
}
