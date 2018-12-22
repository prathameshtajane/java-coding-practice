package daily_coding_challenges;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * This problem was asked by Amazon.
 *
 * Given a string, determine whether any permutation of it is a palindrome.
 *
 * For example, carrace should return true, since it can be rearranged to form racecar,
 * which is a palindrome. daily should return false, since there's no rearrangement that can form a palindrome.
 */
public class Prob157_DeterminPermutationOfPalindrome {
    boolean isPermutationOfPalidrome(String input){

        if(input.length() < 1){
            return false;
        }

        int oddCountChars = 0;

        Map<Character,Integer> map = new HashMap<>();
        for(Character c : input.toCharArray()){
            Integer temp = (map.get(c) == null)? 0 : map.get(c);
            map.put(c,++temp);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2!=0){
                ++oddCountChars;
            }
        }

        if(input.length()%2==0){
            if(oddCountChars != 0){
                return false;
            }
        }else{
            if(oddCountChars == 0 || oddCountChars > (input.length()/2+1)){
                return false;
            }
        }
        return true;
    }
}
