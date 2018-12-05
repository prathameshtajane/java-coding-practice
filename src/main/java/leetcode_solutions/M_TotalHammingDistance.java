package leetcode_solutions;

import java.util.ArrayList;
import java.util.List;

/*
    477. Total Hamming Distance

    The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

    Now your job is to find the total Hamming distance between all pairs of the given numbers.

    Example:
    Input: 4, 14, 2

    Output: 6

    Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
    showing the four bits relevant in this case). So the answer will be:
    HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
    Note:
    Elements of the given array are in the range of 0 to 10^9
    Length of the array will not exceed 10^4.

    Link : https://leetcode.com/problems/total-hamming-distance/description/

    Algorithm :
    step 1 - find all possible combination to 2 elements from given input array
    step 2 - define a global collector for bit difference
    step 3 - calculate hamming distance for each pair and add it to the global collector
    step 4 - return global collector

    todo : Total hamming distance
 */
public class M_TotalHammingDistance {
    static List<ArrayList<Integer>> combinationList = new ArrayList<>();
    /*
   arr[]  ---> Input Array
   data[] ---> Temporary array to store current combination
   start & end ---> Staring and Ending indexes in arr[]
   index  ---> Current index in data[]
   r ---> Size of a combination to be printed
   */
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            ArrayList<Integer> temp_collection = new ArrayList<Integer>();

            for (int j=0; j<r; j++)
                temp_collection.add(data[j]);
//              System.out.print(data[j]+" ");
              combinationList.add(temp_collection);
//            System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    public static int totalHammingDistance(int[] nums) {
        int[] data = new int[2];
        combinationUtil(nums,data,0,nums.length,0,2);
        System.out.println(combinationList.toString());
        return 0;
    }

    public static void main(String args[]){
        System.out.println("M_TotalHammingDistance");
        totalHammingDistance(new int[]{1,2,3,4});
    }
}


