package daily_coding_challenges;

/*
    This problem was asked by Google.

    Given a word W and a string S, find all starting indices in S which are anagrams of W.

    For example, given that W is "ab", and S is "abxaba", return 0, 3, and 4.

    Algorithm :

    Time Complexity : O(n)
    Space complexity : O(1)

    Ref : https://www.geeksforgeeks.org/anagram-substring-search-search-permutations/

    We can achieve O(n) time complexity under the assumption that alphabet size is fixed which is typically true as
    we have maximum 256 possible characters in ASCII. The idea is to use two count arrays:

    1) The first count array store frequencies of characters in pattern.
    2) The second count array stores frequencies of characters in current window of text.

    The important thing to note is, time complexity to compare two count arrays is O(1) as the number of elements in
     them are fixed (independent of pattern and text sizes). Following are steps of this algorithm.
    1) Store counts of frequencies of pattern in first count array countP[]. Also store counts of frequencies of
        characters in first window of text in array countTW[].

    2) Now run a loop from i = M to N-1. Do following in loop.
        …..a) If the two count arrays are identical, we found an occurrence.
        …..b) Increment count of current character of text in countTW[]
        …..c) Decrement count of first character in previous window in countWT[]

    3) The last window is not checked by above loop, so explicitly check it.

 */

import java.util.ArrayList;
import java.util.List;

public class Prob111_StartingIndexOfAnagram {
    static int MAX = 256;

    // Time Complexity of this compare method is O(1)
    private static boolean compare(int[] arr_src, int[] arr_dest){
        for(int i = 0 ; i < MAX ; i++){
            if(arr_src[i] != arr_dest[i]){
                return false;
            }
        }
        return true;
    }

    private static List<Integer> findAnagramIndex(String text, String pattern){

        List<Integer> output_list = new ArrayList<>();

        //edge conditions
        if(text.length() == 0 || pattern.length() == 0 || pattern.length() > text.length()){
            return output_list;
        }

        int[] window_count_array = new int[MAX];
        int[] pattern_count_array = new int[MAX];



        //initialise pattern array and window array
        for(int i = 0 ; i<pattern.length() ; i++){
            pattern_count_array[pattern.charAt(i)]++;
            window_count_array[text.charAt(i)]++;
        }

        for(int i = pattern.length(); i < text.length() ; i++){
            if(compare(pattern_count_array,window_count_array)){
                output_list.add(i-pattern.length());
            }
            window_count_array[text.charAt(i)]++;
            window_count_array[text.charAt(i-pattern.length())]--;
        }

        //compare last block separately because the above for loop will only add last block elements into window
        // but will not verify their matching

        if(compare(pattern_count_array,window_count_array)){
            output_list.add(text.length()-pattern.length());
        }

        return  output_list;
    }

    public static void main(String[] args) {
        System.out.println("Return Starting Index of Anagram");
        List<Integer> op_list = findAnagramIndex("abxaba","ab");
        if(!op_list.isEmpty()){
            for(int i:op_list){
                System.out.println(i);
            }
        }

    }
}
