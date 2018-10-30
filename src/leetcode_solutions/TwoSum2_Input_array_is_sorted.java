package leetcode_solutions;

import java.util.ArrayList;

/**
 *
 *
 */
public class TwoSum2_Input_array_is_sorted {

    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> numsList = new ArrayList();
        for(int num : numbers){
            numsList.add(num);
        }
        int output[]=new int[2];
        for(int i = 0 ;i< numbers.length;i++){
            int tempRemaining = target - numbers[i];
            if(numsList.subList(i+1,numsList.size()).contains(tempRemaining)){
                output[0]=i+1;
                output[1]=numsList.subList(i+1,numsList.size()).indexOf(tempRemaining)+i+1;
                return output;
            }
        }
        return output;
    }

    public static void main(String args[]){
        System.out.println("TwoSum2_Input_array_is_sorted");
        TwoSum2_Input_array_is_sorted tmp = new TwoSum2_Input_array_is_sorted();
        int[] input = {0,0,3,4};
        int target = 0;
        tmp.twoSum(input,target);
        System.out.println("End");
    }
}
