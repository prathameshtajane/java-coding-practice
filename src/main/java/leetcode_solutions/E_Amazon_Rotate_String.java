package leetcode_solutions;

/**
 * 796. Rotate String
 * We are given two strings, A and B.
 *
 * A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.
 *
 * Example 1:
 * Input: A = 'abcde', B = 'cdeab'
 * Output: true
 *
 * Example 2:
 * Input: A = 'abcde', B = 'abced'
 * Output: false
 * Note:
 *
 * A and B will have length at most 100.
 *
 * link : https://leetcode.com/problems/rotate-string/description/
 */

public class E_Amazon_Rotate_String {
    private static boolean rotateString(String A, String B) {
        if(A.length() == B.length())
            return (A+A).contains(B);
        return false;
    };

    public static void main(String[] args) {
        System.out.println("796. Rotate String");
        System.out.println(rotateString("abcde","cdeab"));
        System.out.println(rotateString("abcde","abced"));
    }
}
