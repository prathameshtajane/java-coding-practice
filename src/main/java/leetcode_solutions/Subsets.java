package leetcode_solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).

 Note: The solution set must not contain duplicate subsets.

 Example:

 Input: nums = [1,2,3]
 Output:
 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        int counter = (int) Math.pow(2,nums.length);
        List<List<Integer>> outputList = new ArrayList<>();
        List<Integer> tempList;
        for(int i=0;i<counter;i++){
            tempList = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1 << j)) > 0){
                    tempList.add(nums[j]);
                }
            }
            outputList.add(tempList);
        }
        return outputList;
    }

    public static void main(String args[]){
        System.out.println("Subsets");
        Subsets s = new Subsets();
        int[] testInput = {1,2,3};
        s.subsets(testInput);
        System.out.println("Subsets End !");
    }
}
