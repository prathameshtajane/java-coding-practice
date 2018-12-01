package leetcode_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.
 *
 * Example 1:
 *
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 *
 *
 * Note:
 *
 * S string length is in [1, 10000].
 * C is a single character, and guaranteed to be in string S.
 * All letters in S and C are lowercase.
 *
 * Time complexity : O(n^2)
 */
public class E_Shortest_Distance_To_A_Character {


    private static int getShortedDist(int src, List<Integer> list){
        int min_dist = Integer.MAX_VALUE;
        for(Integer num : list){
            min_dist = Math.min(min_dist,Math.abs(src-num));
        }
        return min_dist;
    }

    private static int[] shortestToChar(String S, char C) {
        int[] shortest_dist_arr = new int[S.length()];
        List<Integer> char_index = new ArrayList<>();

        for(int i = 0 ; i < S.length() ; i++)
            if(S.charAt(i)==C)
                char_index.add(i);

        for(int i = 0 ; i < S.length(); i++){
            shortest_dist_arr[i]=getShortedDist(i,char_index);
        }
        return shortest_dist_arr;
     }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode",'e')));
    }
}
