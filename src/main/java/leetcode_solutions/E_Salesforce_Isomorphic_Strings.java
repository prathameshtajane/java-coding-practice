package leetcode_solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. Isomorphic Strings
 *Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 * Note:
 * You may assume both s and t have the same length.
 */
public class E_Salesforce_Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1){
            return true;
        }
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(map.containsKey(sChar)){
                if(map.get(sChar).equals(tChar)){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(!map.containsValue(tChar)){
                    map.put(sChar,tChar);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
