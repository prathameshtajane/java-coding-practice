package leetcode_solutions.google;

import java.util.HashMap;

/**
 *
    Given an array of size n, find the majority element.
    The majority element is the element that appears more than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always exist in the array.

    Example 1:

    Input: [3,2,3]
    Output: 3
    Example 2:

    Input: [2,2,1,1,1,2,2]
    Output: 2

    Link : https://leetcode.com/problems/majority-element/description/
 */
public class Majority_Element {

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                int temp = map.get(num);
                temp+=1;
                map.put(num,temp);
                if(map.get(num) > (Math.floor(nums.length/2))){
                    return num;
                }
            }else{
                map.put(num,1);
            }
        }
        return 0;
    }

    public static void main(String args[]){
        System.out.println("Majority_Element");
        Majority_Element ME = new Majority_Element();
        int[] input1 = {3,2,3};
        int[] input2 = {1};
        System.out.println(ME.majorityElement(input1));
        System.out.println(ME.majorityElement(input2));
    }
}
