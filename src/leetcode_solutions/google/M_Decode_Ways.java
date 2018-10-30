package leetcode_solutions.google;

/**

     A message containing letters from A-Z is being encoded to numbers using the following mapping:

     'A' -> 1
     'B' -> 2
     ...
     'Z' -> 26
     Given a non-empty string containing only digits, determine the total number of ways to decode it.

     Example 1:

     Input: "12"
     Output: 2
     Explanation: It could be decoded as "AB" (1 2) or "L" (12).
     Example 2:

     Input: "226"
     Output: 3
     Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).

     Link : https://leetcode.com/problems/decode-ways/description/

 */
public class M_Decode_Ways {


    // Given a digit sequence of length n,
    // returns count of possible decodings by
    // replacing 1 with A, 2 woth B, ... 26 with Z
    int countDecoding(char[] digits, int n)
    {
        // base cases
        if (n == 0 || n == 1)
            return 1;

        // Initialize count
        int count = 0;

        // If the last digit is not 0, then
        // last digit must add to
        // the number of words
        if (digits[n - 1] > '0')
            count = countDecoding(digits, n - 1);

        // If the last two digits form a number
        // smaller than or equal to 26,
        // then consider last two digits and recur
        if (digits[n - 2] == '1' ||
                (digits[n - 2] == '2' && digits[n - 1] < '7'))
            count += countDecoding(digits, n - 2);

        return count;
    }

    public int numDecodings(String s) {
        if(s.length() == 1){
            if(s.charAt(0) >= '1' && s.charAt(0) <= '9'){
                return 1;
            }else{
                return 0;
            }
        }
        return countDecoding(s.toCharArray(),s.length());
    }

    public static void main(String args[]) {
        System.out.println("Decode Ways");

        M_Decode_Ways decode_ways = new M_Decode_Ways();
        System.out.println(decode_ways.numDecodings("12"));
        System.out.println(decode_ways.numDecodings("226"));
        System.out.println(decode_ways.numDecodings("0"));
        System.out.println(decode_ways.numDecodings("1"));
        System.out.println(decode_ways.numDecodings("01"));
    }
}
