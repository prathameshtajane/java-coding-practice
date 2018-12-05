package daily_coding_challenges;

/*
    This problem was asked by Microsoft.

    Given a number in the form of a list of digits, return all possible permutations.

    For example, given [1,2,3], return [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]].

    Algorithm :
    Recursive solution
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob96_PossiblePermutationsOfElements {

    private static void swap(int[] inputArray,int i,int j){
        int temp_buff = inputArray[i];
        inputArray[i]=inputArray[j];
        inputArray[j]=temp_buff;
    }

    private static void calculatePermutations(int[] inputArray, int l, int r, List<int[]> collector_list){
        //base case
        if(l > r){
//            System.out.println(Arrays.toString(inputArray));
            collector_list.add(inputArray.clone());
        }

        for(int i = l;i<=r;i++){
            swap(inputArray,l,i);
            calculatePermutations(inputArray,l+1,r,collector_list);
            swap(inputArray,l,i); //backtrack
        }
    }

    public static void main(String args[]){
        System.out.println("Prob96_PossiblePermutationsOfElements");
        List<int[]> collector_list = new ArrayList<>();
        calculatePermutations(new int[]{1,2,3},0,2,collector_list);

        //printing Collector list as per requirement.
        for(int[] each : collector_list){
            System.out.println(Arrays.toString(each));
        }
    }
}
