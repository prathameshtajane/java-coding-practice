package leetcode_solutions.google;

/*
    Given an integer, write a function to determine if it is a power of two.

    Example 1:

    Input: 1
    Output: true
    Explanation: 20 = 1
    Example 2:

    Input: 16
    Output: true
    Explanation: 24 = 16
    Example 3:

    Input: 218
    Output: false
*/



public class E_Power_of_Two {



    public boolean isPowerOfTwo(int n) {
        if(n<0)
            return false;

        if((n&(n-1)) == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String args[]){
        System.out.println(" Power of Two");
        E_Power_of_Two PT = new E_Power_of_Two();
        System.out.println(PT.isPowerOfTwo(2));
        System.out.println(PT.isPowerOfTwo(3));
        System.out.println(PT.isPowerOfTwo(0));
        System.out.println(PT.isPowerOfTwo(1));
        System.out.println(PT.isPowerOfTwo(536870912));

    }
}
