package comparator_practice;

public class Employee {
    private Hierachy rank;
    private String pos;
    Employee(Hierachy rank,String pos){
        this.rank=rank;
        this.pos=pos;
    }
    public Hierachy getRank(){
        return rank;
    }

    public String getPos(){
        return pos;
    }
}
