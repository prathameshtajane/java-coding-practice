package appfolio;

/**
 dabAcCaCBAcCcaDA  The first 'cC' is removed.
 dabAaCBAcCcaDA    This creates 'Aa', which is removed.
 dabCBAcCcaDA      Either 'cC' or 'Cc' are removed (the result is the same).
 dabCBAcaDA        No further actions can be taken.
 **/

import java.util.ArrayDeque;
import java.util.Deque;

public class ReactionResidue {
    public  String alchemicalReduction(String start){
        char[] inputCharArr = start.toCharArray();
        Deque<Character> accumalotor = new ArrayDeque<>();
        StringBuffer output = new StringBuffer();

        for(char character : inputCharArr){
            if(accumalotor.size() == 0){
                accumalotor.addLast(character);
            }else{
                if(Math.abs((int)character - (int)accumalotor.getLast())==32){
                    accumalotor.removeLast();
                }else{
                    accumalotor.addLast(character);
                }
            }
        }
        while(accumalotor.size() != 0){
            output.append(accumalotor.removeFirst());
        }
        return output.toString();
    }
}
