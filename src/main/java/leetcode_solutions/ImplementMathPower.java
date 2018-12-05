package leetcode_solutions;

/**
 * Implement Math.pow() function
 */
public class ImplementMathPower {

    static int pow(int x,int n){

        //corner condition : 1
        if(n == 0){
            return 1;
        }

        int result = x;
        int i=n;

        while(i > 1){
            i = i/2;
            result *= result;
        }

        //condition : if n is odd
        if(n%2 == 1 ){
            result *= x;
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println("ImplementMathPower");
        System.out.println(ImplementMathPower.pow(2,4));
        System.out.println(ImplementMathPower.pow(2,3));
        System.out.println(ImplementMathPower.pow(3,2));
        System.out.println(ImplementMathPower.pow(3,0));
        System.out.println(ImplementMathPower.pow(0,1));
    }
}
