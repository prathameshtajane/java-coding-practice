package daily_coding_challenges;

/**
 * This problem was asked by Google.
 *
 * Given a string, return the first recurring character in it, or null if there is no recurring chracter.
 *
 * For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
 */
public class Prob159_FirstRecurringCharacter {

    int[] charCount = new int[256];

    Character getFirstRecurringCharFromString(String input){
        for(char c : input.toCharArray()){
            if(charCount[(int)c] == 0){
                ++charCount[(int)c];
            }else{
                return c;
            }
        }
        return null;
    }
}
