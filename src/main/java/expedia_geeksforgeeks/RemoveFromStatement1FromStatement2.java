package expedia_geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */

public class RemoveFromStatement1FromStatement2 {
    public static void main(String args[]){
        String statment1="A Statement is a Statement";
        String statment2="a Statement";
        String[] state1Array = statment1.split(" ");
        String[] state2Array = statment2.split(" ");

        /**
         * Logic to convert Array into ArrayList
         */
        List<String> state1ArrayList = new ArrayList<String>(Arrays.asList(state1Array));

        for(int i = 0;i<state2Array.length;i++){
            if(state1ArrayList.contains(state2Array[i])){
                state1ArrayList.remove(state2Array[i]);
            }
        }

        StringBuffer opString = new StringBuffer();
        for(String eachString : state1ArrayList){
            opString.append(eachString);
            opString.append(" ");

        }
        opString.deleteCharAt(opString.lastIndexOf(" "));
        System.out.println(opString);
    }
}
