package expedia_geeksforgeeks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 Given a string of a's b's and c's which can come in any order any number of times,
 reduce the string to a string in which every combination of two different characters will be replaced by
 the third one (ab will become c, bc a, cb a, ...).
 Keep on doing this tip possible. Mind the fact that in place and new string will give separate answers,
 you can choose any approach.
 e.g. aabbcc becomes bb ( aabbcc -> acac -> bb)

 TODO
 Complete this logic !
 */
public class SmartStringManipulation {

    public static  boolean isUnique(ArrayList<Character> checkIsUnique){
        Set<Character> tempHashSet = new HashSet<Character>(checkIsUnique);
        if(tempHashSet.size() == 1){
            return true;
        }else{
            return false;
        }
    }

    public static ArrayList<Character> recursiveStringMaipulation(ArrayList<Character> manipulatedString){
        if(manipulatedString.size()==1 || isUnique(manipulatedString)){
            return manipulatedString;
        }

        return manipulatedString;
    }

    public static void main(String args[]){
        ArrayList<Character> inputCharList = new ArrayList<Character>();
        inputCharList.add('a');
        inputCharList.add('a');
        inputCharList.add('b');
        inputCharList.add('b');
        inputCharList.add('c');
        inputCharList.add('c');
    }
}
