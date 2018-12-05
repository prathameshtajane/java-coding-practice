package leetcode_solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *  In a string S of lowercase letters, these letters form consecutive groups of the same character.

 For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

 Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

 The final answer should be in lexicographic order.

     Example 1:

     Input: "abbxxxxzzy"
     Output: [[3,6]]
     Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
     Example 2:

     Input: "abc"
     Output: []
     Explanation: We have "a","b" and "c" but no large group.
     Example 3:

     Input: "abcdddeeeeaabbbcd"
     Output: [[3,5],[6,9],[12,14]]

 Link : https://leetcode.com/problems/positions-of-large-groups/description/

 */
public class PositionsOfLargeGroups {

    public List<List<Integer>> largeGroupPositions(String S) {
        if (S == null || S.length() == 0) {
            return new LinkedList<>();
        }

        List<List<Integer>> rst = new LinkedList<>();
        char[] str = S.toCharArray();

        for (int i = 0; i < str.length - 1; i++) {
            if (i + 1 < str.length && str[i] == str[i + 1]) {
                int start = i;
                while (i + 1 < str.length && str[i] == str[i + 1]) {
                    i++;
                }
                if (i - start >= 2) {
                    rst.add(Arrays.asList(new Integer[]{start, i}));
                }
            }
        }

        return rst;
    }

    public static void main(String args[]){
        System.out.println("Positions of Large Groups");
    }
}
