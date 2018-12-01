package leetcode_solutions;

/**
 * 38. Count and Say
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 *
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 * Example 2:
 *
 * Input: 4
 * Output: "1211"
 *
 * Link : https://leetcode.com/problems/count-and-say/
 *
 * Time Complexity : O(n^2)
 *
 */


public class E_CountAndSay {
    public static String countAndSay(int n) {
        String str = new String("1");
        StringBuilder op_string = new StringBuilder(str);
        for(int i = 2 ; i <= n ; i++){
            String temp = op_string.toString();
            //flush op_string to generate latest count and say value
            op_string = new StringBuilder();
            char prev_char = temp.charAt(0);
            int counter = 1;
            for(int j = 1; j < temp.length() ; j++){
                char curr_char = temp.charAt(j);
                if(prev_char != curr_char){
                    op_string.append(counter);
                    op_string.append(prev_char);
                    //initialise prev_char and counter
                    prev_char=curr_char;
                    counter =1;
                }else{
                    ++counter;
                }
            }
            //add last character and its count into output
            op_string.append(counter);
            op_string.append(prev_char);
        }
    return op_string.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
    }
}











