package leetcode_solutions;


/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 *
 *
 * Example 1:
 *
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 *
 * Input: "here"
 * Output: "here"
 * Example 3:
 *
 * Input: "LOVELY"
 * Output: "lovely"
 *
 * link : https://leetcode.com/problems/to-lower-case/
 *
 * Time Complexity : O(n)
 */

public class E_ImplementToLowerCase {
    public static String toLowerCase(String str) {
        StringBuilder op_string = new StringBuilder(str);
        for(int i = 0 ; i < op_string.length() ; i++){
            if((int)op_string.charAt(i) >= 65 &&  (int)op_string.charAt(i) <= 90){
                op_string.setCharAt(i,(char)(op_string.charAt(i)+32));
            }
        }
        return op_string.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("HELLo"));
    }
}
