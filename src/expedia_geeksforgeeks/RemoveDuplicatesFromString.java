package expedia_geeksforgeeks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String args[]){

        String inputString = "Prathamesh";
        char[] inputStringArray = inputString.toCharArray();
        ArrayList<Character> inputStringArrayList = new ArrayList<>();
        for(char eachChar : inputStringArray){
            inputStringArrayList.add((Character) eachChar);
        }
        Set<Character> noDupsSet = new HashSet<Character>(inputStringArrayList);
        StringBuffer opString = new StringBuffer();
        for(Character eachChar : noDupsSet){
            opString.append(eachChar);
        }
        System.out.println(opString);
    }
}
