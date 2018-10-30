package leetcode_solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Link : https://leetcode.com/problems/majority-element/description/
 */
public class MajorityElement {
    int majElement;
    int majCount;

    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Map<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
        majCount=(nums.length)/2+1;

        for(int each : nums){
            if(numsMap.containsKey(each)){
                int tempInt = numsMap.get(each);
                tempInt+=1;
                numsMap.put(each,tempInt);
                if(tempInt>=majCount){
                    majElement=each;
                    return each;
                }
            }else{
                numsMap.put(each,1);
            }
        }
        return majElement;
    }

    public static void main(String args[]){
        int[] testArray = {8,8};
        MajorityElement test = new MajorityElement();
        System.out.println(test.majorityElement(testArray));
    }
}
