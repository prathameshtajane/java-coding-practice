package leetcode_solutions;

import java.util.HashMap;

/**
 * Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.

 Examples:
 Input  :  arr[] = {1, 5, 7, -1},
 sum = 6
 Output :  2
 Pairs with sum 6 are (1, 5) and (7, -1)

 Input  :  arr[] = {1, 5, 7, -1, 5},
 sum = 6
 Output :  3
 Pairs with sum 6 are (1, 5), (7, -1) &
 (1, 5)

 Input  :  arr[] = {1, 1, 1, 1},
 sum = 2
 Output :  6
 There are 3! pairs with sum 2.

 Input  :  arr[] = {10, 12, 10, 15, -1, 7, 6,
 5, 4, 2, 1, 1, 1},
 sum = 11
 Output :  9
 Expected time complexity O(n)

 Below is the Algorithm.

 1. Create a map to store frequency of each number in the array. (Single traversal is required)
 2. In the next traversal, for every element check if it can be combined with any other element (other than itself!)
 to give the desired sum.Increment the counter accordingly.
 3. After completion of second traversal, we’d have twice the required value stored in counter because every pair is
 counted two times.
 Hence divide count by 2 and return.
 */
public class PairsInUnsortedArray {

    static int getPairsCount(int[] inputArray, int sum){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<inputArray.length;i++){
            if(!map.containsKey(inputArray[i])){
                map.put(inputArray[i],0);
            }
            map.put(inputArray[i],map.get(inputArray[i])+1);
        }
        int twice_count = 0;

        for(int i=0;i<inputArray.length;i++){
            if(map.get(sum-inputArray[i]) != null){
                twice_count = twice_count + map.get(sum-inputArray[i]);
            }
            if(sum-inputArray[i]==inputArray[i]){
                twice_count--;
            }
        }

        return twice_count/2;

    }

    public static void main(String args[]){
        System.out.println("PairsInUnsortedArray");
        int[] testInput = {30,20,30,40,40};
        int sum = 60;
        System.out.println(PairsInUnsortedArray.getPairsCount(testInput,sum));
    }

}
