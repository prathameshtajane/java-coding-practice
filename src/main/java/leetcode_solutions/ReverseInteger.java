package leetcode_solutions;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1:
 * Input: 123
 * Output:  321
 *
 * Example 2 :
 * Input: -123
 * Output: -321
 *
 * Example 3:
 * Input: 120
 * Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
*/
public class ReverseInteger {
    public static int reverse(int x){
        boolean isNegNum=false;
        int X=0;
        int q=1;
        int remainder=0;
        StringBuffer opString = new StringBuffer();

        if(x == 0){
            return x;
        }

        if(x < 0){
            isNegNum = true;
            X = 0-x;
        }else{
            X=x;
        }

        while(X != 0){
            remainder = X%10;
            opString.append(remainder);
            X=X/10;
        }
        if(opString.charAt(opString.length()-1)==0){
            opString.deleteCharAt(opString.length()-1);
        }
        try {
            if (isNegNum) {
                return 0 - Integer.parseInt(opString.toString());
            }
            return Integer.parseInt(opString.toString());
        }catch (NumberFormatException e){
            return 0;
        }
    }
    public static void main(String args[]){
        int output = reverse(120);
        System.out.println("Output :"+output);
        System.out.println("test"+0120);
    }
}
