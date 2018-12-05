package leetcode_solutions;

/**
 * Implement strStr().
   Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

     Example 1:

     Input: haystack = "hello", needle = "ll"
     Output: 2
     Example 2:

     Input: haystack = "aaaaa", needle = "bba"
     Output: -1

    Link : https://leetcode.com/problems/implement-strstr/description/
 */
public class ImplementstrStr {

    public static int strStr(String haystack, String needle) {
        int firstIndexOfNeedle = -1;

        if(haystack.toLowerCase().contains(needle.toLowerCase())){
            return haystack.toLowerCase().indexOf(needle.toLowerCase());
        }
        return firstIndexOfNeedle;
    }
    public static void main(String args[]){
        System.out.println(strStr("hello",""));
    }

}
