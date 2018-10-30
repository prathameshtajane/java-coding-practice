package daily_coding_challenges;

/**
    cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
    For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

     Given this implementation of cons:

     def cons(a, b):
        def pair(f):
            return f(a, b)
        return pair

     Implement car and cdr.
 */
public class Prob5_JaneStreet {

    static class Pair{
        int left;
        int right;

        Pair(int left, int right){
            this.left=left;
            this.right=right;
        }
    }

    static Pair cons(int l,int r){
        Pair node = new Pair(l,r);
        return node;
    }

    static int car(Pair node){
        return node.left;
    }

    static int cdr(Pair node){
        return node.right;
    }

    public static void main(String args[]){
        System.out.println("Prob5_JaneStreet");
        System.out.println(Prob5_JaneStreet.car(Prob5_JaneStreet.cons(3,4)));
        System.out.println(Prob5_JaneStreet.cdr(Prob5_JaneStreet.cons(3,4)));
    }
}
