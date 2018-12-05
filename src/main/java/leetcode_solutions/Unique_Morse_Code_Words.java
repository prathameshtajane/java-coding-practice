package leetcode_solutions;

import java.util.HashSet;

/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

 For convenience, the full table for the 26 letters of the English alphabet is given below:

 [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

 Return the number of different transformations among all words we have.

 Example:
 Input: words = ["gin", "zen", "gig", "msg"]
 Output: 2
 Explanation:
 The transformation of each word is:
 "gin" -> "--...-."
 "zen" -> "--...-."
 "gig" -> "--...--."
 "msg" -> "--...--."

 There are 2 different transformations, "--...-." and "--...--.".

 Link : https://leetcode.com/problems/unique-morse-code-words/description/
 *
 *
 */
public class Unique_Morse_Code_Words {

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> seen = new HashSet<>();
        for(int i=0;i < words.length;i++){
            StringBuffer tempCode = new StringBuffer();
            for(int j=0;j<words[i].length();j++){
                tempCode.append(morseCode[words[i].charAt(j) - 'a']);
            }
            seen.add(tempCode.toString());
        }
        return seen.size();
    }


    public static void main(String args[]){
        System.out.println("Unique_Morse_Code_Words");
        String[] testInput = {"gin", "zen", "gig", "msg"};
        Unique_Morse_Code_Words.uniqueMorseRepresentations(testInput);
    }
}
