package leetcode_solutions;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
   For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

     Note:
     You must do this in-place without making a copy of the array.
     Minimize the total number of operations.

    Link : https://leetcode.com/problems/move-zeroes/description/

   Solution :
    Shift non-zero values as far forward as possible
    Fill remaining space with zeros
 */
public class Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int insetIndex = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[insetIndex++]=nums[i];
            }
        }
        while(insetIndex<nums.length){
            nums[insetIndex++]=0;
        }
    }
}
