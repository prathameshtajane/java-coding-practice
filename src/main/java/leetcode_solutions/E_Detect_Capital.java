package leetcode_solutions;

/**
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

 We define the usage of capitals in a word to be right when one of the following cases holds:

 All letters in this word are capitals, like "USA".
 All letters in this word are not capitals, like "leetcode".
 Only the first letter in this word is capital if it has more than one letter, like "google".
 Otherwise, we define that this word doesn't use capitals in a right way.

 Example 1:
 Input: "USA"
 Output: True
 Example 2:
 Input: "FlaG"
 Output: False

 Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.

 Link : https://leetcode.com/problems/detect-capital/description/
 */
public class E_Detect_Capital {

    static boolean detectCapitalUse(String word) {
        return word.matches("[A-Z][a-z]*|[A-Z]*|[a-z]*");
        }

    static boolean detectCapitalUse2(String word) {
        int cnt = 0;
        for(char c: word.toCharArray()) if('Z' - c >= 0) cnt++;
        return ((cnt==0 || cnt==word.length()) || (cnt==1 && 'Z' - word.charAt(0)>=0));
    }

    public static void main(String args[]){
        System.out.println("E_Detect_Capital");
        System.out.println(E_Detect_Capital.detectCapitalUse("USA"));
        System.out.println(E_Detect_Capital.detectCapitalUse("Flag"));
        System.out.println(E_Detect_Capital.detectCapitalUse("FlaG"));
        System.out.println("------");
        System.out.println(E_Detect_Capital.detectCapitalUse2("USA"));
        System.out.println(E_Detect_Capital.detectCapitalUse2("Flag"));
        System.out.println(E_Detect_Capital.detectCapitalUse2("FlaG"));
    }
}
