package leetcode_solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

 Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

 The order of output does not matter.

 Example 1:

 Input:
 s: "cbaebabacd" p: "abc"

 Output:
 [0, 6]

 Explanation:
 The substring with start index = 0 is "cba", which is an anagram of "abc".
 The substring with start index = 6 is "bac", which is an anagram of "abc".
 Example 2:

 Input:
 s: "abab" p: "ab"

 Output:
 [0, 1, 2]

 Explanation:
 The substring with start index = 0 is "ab", which is an anagram of "ab".
 The substring with start index = 1 is "ba", which is an anagram of "ab".
 The substring with start index = 2 is "ab", which is an anagram of "ab".


 Link : https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 */
public class Find_All_Anagrams_in_a_String {

//    public List<Integer> findAnagrams(String s, String p) {
//
//    }


    List<String> permutation(String str) {
        List<String> permutationList = new ArrayList<>();
        permutation("", str,permutationList);
        return permutationList;
    }

    void permutation(String prefix, String str,List<String> permutationList) {
        int n = str.length();
        if (n == 0){
//            System.out.println(prefix);
            permutationList.add(prefix);

        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),permutationList);
        }
    }

    public static void main(String args[]){
        System.out.println("Find_All_Anagrams_in_a_String");
        Find_All_Anagrams_in_a_String t = new Find_All_Anagrams_in_a_String();
        String test = "abbbbcabb";
        String input = "abc";
//        char[] testChar = test.toCharArray();
//        Arrays.sort(testChar);
//        System.out.println(Arrays.toString(testChar));
        List<String> permutationList=t.permutation(test);
        List<Integer> opList = new ArrayList<>();
        int i=0;
        while(i<=input.length()-test.length()){
            String sub = input.substring(i,i+test.length());
            System.out.println(sub);
            if(permutationList.contains(sub)){
                opList.add(i);
            }
            i+=1;
        }
    }
}
