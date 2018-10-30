import java.util.ArrayList;
import java.util.Collection;

class Product{
    private String name;
    private int weight;

    Product(String name,int weight){
        this.name=name;
        this.weight=weight;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    @Override
    public String toString(){
        return "name : "+name+" and weight: "+weight;
    }

}

class TestFile{

    public static void printFullCollection(Collection<Product> products){
        for(Product product : products){
            System.out.println(product.toString());
        }
    }
    public static void main(String args[]){
        ArrayList<Product> products = new ArrayList<>();
        Product pd1=new Product("abc",23);
        Product pd2=new Product("abc2",22);
        Product pd3=new Product("abc3",24);

        products.add(0,pd1);
        products.add(pd2);
        products.add(pd3);
        TestFile.printFullCollection(products);
    }
}