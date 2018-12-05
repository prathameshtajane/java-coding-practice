package ctci;

import java.util.HashMap;

/**
 *  Palindrome Permutation
 *  Given a string ,write a function to check if it is a permutation of palindrome.
 */

public class Palindrome_Permutation {
    public static void main(String args[]) {
        String inputString = "Tact Coa";
        HashMap<Character, Integer> inputStringHashMap = new HashMap<Character, Integer>();
        char[] inputStringArray = inputString.toLowerCase().toCharArray();
        for(char eachChar : inputStringArray){
            if(inputStringHashMap.containsKey(eachChar)){
                int count = inputStringHashMap.get(eachChar);
                inputStringHashMap.put(eachChar,count++);
                }else{
                inputStringHashMap.put(eachChar,1);
            }
        }
        if (inputString.length() % 2 == 0) {
            for (Character character : inputStringHashMap.keySet()) {
                if(inputStringHashMap.get(character)%2 != 0){
                    System.out.println("False");
                    System.exit(0);
                }
            }
            System.out.println("True");
        } else {
            int oddCharCount=0;
            for (Character character : inputStringHashMap.keySet()) {
                if(inputStringHashMap.get(character)%2 != 0){
                    oddCharCount++;
                }
            }
            if(oddCharCount > 1){
                System.out.println("False");
                System.exit(0);
            }else{
                System.out.println("True");
                System.exit(0);
            }
        }
    }
}
