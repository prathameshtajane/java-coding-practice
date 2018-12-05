import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by prathamesh on 5/20/17.
 *
 * Given a List of words,
 * return the words that can be typed using letters of alphabet on only one row's of
 * American keyboard like the image below.
 *
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 *
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 *
 *
 */
public class KeyboardRow {
    /*public static String[] findWords(String[] words) {

    }*/

    public static String[] findWords(String[] words) {

        final String firstLine="qwertyuiop";
        final String secondLine="asdfghjkl";
        final String thirdLine="zxcvbnm";
        List<String> resultWordArrayList=new ArrayList<>();
        String[] resultWordArray;
        Boolean useLineOne=false;
        Boolean useLineTwo=false;
        Boolean useLineThree=false;


        Set<Character> firstLinecharsSet = firstLine.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        Set<Character> secondLinecharsSet = secondLine.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        Set<Character> thirdLinecharsSet = thirdLine.chars().mapToObj(e->(char)e).collect(Collectors.toSet());

        for(String word:words){
            String wordString=word.toLowerCase();
            Set<Character> eachWordcharsSet;
            eachWordcharsSet = wordString.chars().mapToObj(e->(char)e).collect(Collectors.toSet());


            if(firstLinecharsSet.containsAll(eachWordcharsSet)){
                useLineOne=true;
            }else if(secondLinecharsSet.containsAll(eachWordcharsSet)){
                useLineTwo=true;
            }else if(thirdLinecharsSet.containsAll(eachWordcharsSet)){
                useLineThree=true;
            }

            if(useLineOne || useLineTwo || useLineThree){
                resultWordArrayList.add(word);

            }

            useLineOne=useLineTwo=useLineThree=false;

        }

        resultWordArray=new String[resultWordArrayList.size()];
        resultWordArray=resultWordArrayList.toArray(resultWordArray);

        return resultWordArray;
    }

    public static void main(String args[]){

        String[] input={"qwe", "ert", "asd", "assssssddddddd"};
        findWords(input);

    }

}
