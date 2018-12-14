package leetcode_solutions;

import java.util.Arrays;

/**
 *  503. Next Greater Element II
 *
 Given a circular array (the next element of the last element is the first element of the array),
 print the Next Greater Number for every element. The Next Greater Number of a number x is the first greater number
 to its traversing-order next in the array, which means you could search circularly to find its next greater number.
 If it doesn't exist, output -1 for this number.

 Example 1:
 Input: [1,2,1]
 Output: [2,-1,2]
 Explanation: The first 1's next greater number is 2;
 The number 2 can't find next greater number;
 The second 1's next greater number needs to search circularly, which is also 2.
 Note: The length of given array won't exceed 10000.

 link : https://leetcode.com/problems/next-greater-element-ii/description/
 */

//todo : implement logic to get the next greater element
public class M_Amazon_Next_Greater_Element_2 {
    public int[] nextGreaterElements(int[] nums) {
        int[] op_array = new int[nums.length];
        int[] newNums = new int[nums.length*2];
        for(int i = 0 ; i < newNums.length ; i++){
            newNums[i]=nums[i%nums.length];
        }
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < (newNums.length) ; j++){
                if(newNums[j]>newNums[i]){
                    op_array[i]=newNums[j];
                    break;
                }else {
                    op_array[i]=-1;
                }
            }
        }
        return op_array;
    }

    public static void main(String[] args) {
        M_Amazon_Next_Greater_Element_2 testObj = new M_Amazon_Next_Greater_Element_2();
        int[] input = {1,2,1};
        System.out.println(Arrays.toString(testObj.nextGreaterElements(input)));
    }
}