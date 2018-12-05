package ctci;

/**
 * Created by prathamesh on 1/7/18.
 */
class A{
    public void foo(){
        System.out.println("A.foo");
    }
    public void bar(){
        System.out.println("A.bar");
    }
}
class B extends A{
    public void foo(){
        System.out.println("B.foo");
    }
    public void bar(){
        System.out.println("B.bar");
    }
}
public class Object_typecasting {

    public static void main(String args[]){

        B b = new B();
        Object o = (Object)b;
        //B b1 = (A)o;

//       B b = new B();
//        Object o = new Object();
//        A a = (A)o;
//        a.foo();

//        A a = new A();
//        Object o = new Object();
//        B b = (B)o;
//        b.foo();

    }
}
