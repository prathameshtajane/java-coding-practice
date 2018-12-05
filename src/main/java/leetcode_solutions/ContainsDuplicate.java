package leetcode_solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
   Your function should return true if any value appears at least twice in the array,
   and it should return false if every element is distinct.

     Example 1:

     Input: [1,2,3,1]
     Output: true
     Example 2:

     Input: [1,2,3,4]
     Output: false
     Example 3:

     Input: [1,1,1,3,3,4,3,2,4,2]
     Output: true
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set uniqueElementsSet = new HashSet();
        for(int num : nums){
            uniqueElementsSet.add(num);
        }
        return !(uniqueElementsSet.size() == nums.length);
    }

    public static void main(String args[]){
        int[] input = {1,2,3,1};
        ContainsDuplicate CD = new ContainsDuplicate();
        System.out.println("ContainsDuplicate");
        System.out.println(CD.containsDuplicate(input));
    }
}
