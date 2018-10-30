package leetcode_solutions.google;

/*

    Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
    determine if s can be segmented into a space-separated sequence of one or more dictionary words.

    Note:

    The same word in the dictionary may be reused multiple times in the segmentation.
    You may assume the dictionary does not contain duplicate words.
    Example 1:

    Input: s = "leetcode", wordDict = ["leet", "code"]
    Output: true
    Explanation: Return true because "leetcode" can be segmented as "leet code".
    Example 2:

    Input: s = "applepenapple", wordDict = ["apple", "pen"]
    Output: true
    Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
                 Note that you are allowed to reuse a dictionary word.
    Example 3:

    Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
    Output: false

    Link : https://leetcode.com/problems/word-break/description/

 */

//todo : word split dynamic programming

import java.util.ArrayList;
import java.util.List;

public class M_Word_Break {

    public static boolean wordBreak(String s, List<String> wordDict) {
        String interim = s;
        for(String word : wordDict){
            interim = interim.replaceAll(word,"");
            if(wordDict.contains(interim) || interim.length() == 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println("M_Word_Break");
        List<String> dict = new ArrayList<>();



        System.out.println();
    }
}
