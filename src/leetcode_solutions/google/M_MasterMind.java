package leetcode_solutions.google;

/* The Game of Master Mind is played as follows:
 *
 * The computer has four slots, and each slot will contain a ball that is red
 * (R), yellow (Y), green (G) or blue (B). For example, the computer might
 * have RGGB (Slot #1 is red, Slots #2 and #3 are green, Slot #4 is blue).
 *
 * You, the user, are trying to guess the solution. You might, for example,
 * guess YRGB.
 *
 * When you guess the correct color for the correct slot, you get a "hit". If
 * you guess a color that exists but is in the wrong slot, you get a
 * "pseudo-hit". Note that a slot that is a hit can never count as a
 * pseudo-hit.
 *
 * For example, if the actual solution is RGBY and you guess GGRR, you have
 * one hit and one pseudo-hit.
 *
 * Write a method that, given a guess and a solution, returns the number of
 * hits and pseudo-hits and no-hits.
 *
   Algorithm :

   step 1
    -Find hits and remove it from both Guess and Answers
   step 2
    -Find pseudo-hit and remove it from both Guess and Answers
   step 3
    -Add all remaining in Guess as no-hits

    Time Complexity : O(n^2)

 */

import java.util.HashMap;
import java.util.Map;

public class M_MasterMind {

    static Map<String,Integer> checkMasterMindResult(String guess,String ans){
        char[] guess_arr = guess.toCharArray();
        char[] ans_arr = ans.toCharArray();

        //sanitise input
        if(guess_arr.length != ans_arr.length){
            System.out.println("GUESS and ANS size does not match");
            System.exit(1);
        }

        //initialise outputMap
        Map<String,Integer> output_map = new HashMap<>();
        output_map.put("HITS",0);
        output_map.put("PSUEDO-HITS",0);
        output_map.put("NO-HITS",0);

        //step 1 - Find hits and remove it from both Guess and Answers
        // Time Complexity : O(n)
        for(int i = 0;i<guess_arr.length;i++){
            if(guess_arr[i]==ans_arr[i]){
                int temp_hit_count = output_map.get("HITS");
                output_map.put("HITS",++temp_hit_count);
                // mark both of them as visited
                guess_arr[i] = ans_arr[i] = 'X';
            }
        }

        //step 2 - Find psuedo-hits and remove it from both Guess and Answers]
        // Time Complexity : O(n^2)
        for(int i = 0;i<guess_arr.length;i++){
            if(guess_arr[i] != 'X'){
                for(int j = 0;j<ans_arr.length;j++){
                    if(guess_arr[i] == ans_arr[j]){
                        int temp_psuedo_hit_count = output_map.get("PSUEDO-HITS");
                        output_map.put("PSUEDO-HITS",++temp_psuedo_hit_count);
                        // mark guess_arr[i] and ans_arr[j] as visited
                        guess_arr[i] = ans_arr[j] = 'X';
                        break;
                    }
                }
            }
        }

        //step 3 - Find no-hits from Answers
        // Time Complexity : O(n)
        for(int i = 0;i<ans_arr.length;i++){
            if(ans_arr[i] != 'X'){
                int temp_no_hit_count = output_map.get("NO-HITS");
                output_map.put("NO-HITS",++temp_no_hit_count);
            }
        }

        return output_map;

    }

    public static void main(String args[]){
        System.out.println("MasterMind Game");
        String guess = "RRGYB";
        String ans = "RBYGB";
//        String guess = "RRG";
//        String ans = "RBY";
        //Printing output on the console
        Map<String,Integer> resultMap = checkMasterMindResult(guess,ans);
        for(String key : resultMap.keySet()){
            System.out.println(key+" : "+resultMap.get(key));
        }
    }
}
