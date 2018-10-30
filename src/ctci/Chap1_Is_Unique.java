package ctci;

/**
 * Implement an algorithm to determine if a String has allunique characters.
 * What if you cannot use additional data structure?
 *
 */

import java.util.HashMap;

public class Chap1_Is_Unique {


    public static void main(String args[]){
        String input_string="prathmes";
        char[] input_string_array=input_string.toCharArray();
        HashMap<Character,Integer> isUniqueHashMap=new HashMap<>();
        for(Character eachChar : input_string_array){
            if(isUniqueHashMap.containsKey(eachChar)){
                System.out.print("Not Unique");
                System.exit(0);
            }else{
                isUniqueHashMap.put(eachChar,1);
            }
        }
        System.out.println("Unique");
    }
}
