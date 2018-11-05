package amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
    Given an input string and distance k return all the substrings withing distance k
    which are having all unique characters.

    Example :

    Input : "aabcdd"
    Output : ["bcd","abc"]

    Algorithm :

    Time complexity : O(n * k)

    step 1 : Sliding window technique with complexity O(n * k)
    step 2 : verify if the sliding window has all unique characters.
             time complexity O(1)
 */




public class SubStringSearch {

    static boolean compareUniqueString(String inputStr,int startIndex,int endIndex ){
        //edge case:
        if(endIndex > inputStr.length()){
            return false;
        }
        int[] alpha = new int[256];
        for(int i =startIndex ; i< endIndex;i++){
            //System.out.println(alpha[inputStr.charAt(i)]);
            if(alpha[inputStr.charAt(i)] > 0){
                return false;
            }else{
                alpha[inputStr.charAt(i)]++;
            }
        }
        return true;
    }

    static List<String> subStringsKDist(String inputStr, int num)
    {

        //edge case
        if(num <= 0 || num > inputStr.length()){
            return new ArrayList<>();
        }

        Set<String> op_set = new HashSet<>();
        //compare first window
        if(compareUniqueString(inputStr,0,num)){
            op_set.add(inputStr.substring(0,num));
        }

        //compare remaining window
        for(int i = 1 ; i < inputStr.length()-num+1 ;i++){
            if(compareUniqueString(inputStr,i,i+num)){
                // substring complexity - O(k)
                // k -> num
                op_set.add(inputStr.substring(i,i+num));
            }
        }
        return new ArrayList<>(op_set);
    }

    public static void main(String[] args) {
        System.out.println("SubStringSearch");
        for(String each : subStringsKDist("aabcdd",3)){
            System.out.println(each);
        }
    }
}
