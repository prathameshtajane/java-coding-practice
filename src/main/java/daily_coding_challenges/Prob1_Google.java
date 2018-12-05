package daily_coding_challenges;


/*
This problem was recently asked by google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
*/

import java.util.Arrays;

public class Prob1_Google {

    static boolean isPossible(int[] inputArray,int result){
        if(inputArray.length == 1 && inputArray[0]==result){
            return true;
        }else if(inputArray.length == 1 && inputArray[0]!=result){
            return false;
        }
        Arrays.sort(inputArray);
        for(int i=0,j=inputArray.length-1;i<j;){
            if(inputArray[i]+inputArray[j]==result){
                return true;
            }else if(inputArray[i]+inputArray[j]>result){
                j=j-1;
            }else if(inputArray[i]+inputArray[j]<result){
                i=i+1;
            }
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println("Prob1_Google");
        int[] inputArray = {10,15,3,7};
        int result = 19;
        Prob1_Google pb1 = new Prob1_Google();
        System.out.println(pb1.isPossible(inputArray,result));
    }
}
