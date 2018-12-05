package shapes;

public class Square extends Shape{
    private double size;
    public Square(double size){
        this.size=size;
    }
    public double getArea(){
        return size*size;
    }

}
