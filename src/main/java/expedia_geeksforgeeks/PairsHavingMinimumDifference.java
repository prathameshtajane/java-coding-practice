package expedia_geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Given an array of integers,
 * print all (i,j) pairs (in ascending order) having minimum difference.
 */
public class PairsHavingMinimumDifference {
    public static void main(String args[]){

        int []inputArray = {4,9,1,32,13};
        HashMap<Integer,Integer[]> diffPairsMap= new HashMap<>();
        for(int i = 1;i<inputArray.length;i++){
            Integer[] currentPair ={inputArray[i-1],inputArray[i]};
            diffPairsMap.put(Math.abs(inputArray[i]-inputArray[i-1]),currentPair);
        }

        ArrayList<Integer> sortedArrayList = new ArrayList(diffPairsMap.keySet());
        Collections.sort(sortedArrayList);

        for(Integer eachNumber : sortedArrayList){
            Integer[] opPairs=diffPairsMap.get(eachNumber);
            System.out.println(Arrays.toString(opPairs));
        }
    }
}
