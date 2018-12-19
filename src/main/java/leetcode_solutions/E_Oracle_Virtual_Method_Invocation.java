package leetcode_solutions;

public class E_Oracle_Virtual_Method_Invocation {
    static class A{
        A(){
            System.out.println("A");
        }
    }
    static class B extends A{
        B(){
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        B b = new B();
        A a = (A)b;
        System.out.println(b.getClass());
        System.out.println(a.getClass());
    }
}
