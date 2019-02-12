package leetcode_solutions;

/**
 * 242. Valid Anagram
 *
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 *
 * link : https://leetcode.com/problems/valid-anagram/
 */
public class E_Amazon_Valid_Anagram {


    boolean isSameIntArr(int[] arr1 , int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }else{
            for(int i = 0 ; i < arr1.length ; i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}

        int[] sArrayMapping = new int[256];
        int[] tArrayMapping = new int[256];

        for(char c : s.toCharArray()){
            sArrayMapping[(int)c]++;
        }

        for(char c : t.toCharArray()){
            tArrayMapping[(int)c]++;
        }

        return isSameIntArr(sArrayMapping,tArrayMapping);
    }
}
