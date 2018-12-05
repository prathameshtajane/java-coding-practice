package shapes;

public class ColoredSquare extends Square{
    private String color;
    public ColoredSquare(double size,String color){
        super(size);
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
}
