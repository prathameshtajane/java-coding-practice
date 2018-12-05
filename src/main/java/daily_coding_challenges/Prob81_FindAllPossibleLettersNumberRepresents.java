package daily_coding_challenges;

import java.util.*;

/**
 This problem was asked by Yelp.

 Given a mapping of digits to letters (as in a phone number), and a digit string,
 return all possible letters the number could represent.
 You can assume each valid number in the mapping is a single digit.

 For example if {“2”: [“a”, “b”, “c”], 3: [“d”, “e”, “f”], …}
            then “23” should return [“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"].
 */
public class Prob81_FindAllPossibleLettersNumberRepresents {

    Map<Character,ArrayList<String>> NumCharMap=new HashMap<>();

    ArrayList<String> combineCharMaps(List<String> currArray,char next){
        if(currArray.size() == 0){
            return NumCharMap.get(next);
        }
        ArrayList<String> tempList = new ArrayList<>();

        for(String each_outer : currArray){
            for(String each_inner : NumCharMap.get(next)){
                tempList.add(each_outer.concat(each_inner));
            }
        }
        return tempList;
    }

    List<String> createCombination(String inputNumber){
        List<String> outPutList = new ArrayList<>();
        for(int i = 0 ; i<inputNumber.length()-1;i++){
            outPutList.addAll(combineCharMaps(outPutList,inputNumber.charAt(i)));
        }
        return outPutList;
    }


    public static void main(String args[]){
        System.out.println("Prob81_FindAllPossibleLettersNumberRepresents");
        //Todo : Test the code
    }
}
