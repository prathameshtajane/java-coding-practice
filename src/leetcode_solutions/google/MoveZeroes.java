package leetcode_solutions.google;

import java.util.Arrays;

/**
     Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

     Example:

     Input: [0,1,0,3,12]
     Output: [1,3,12,0,0]
     Note:

     You must do this in-place without making a copy of the array.
     Minimize the total number of operations.
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int insertCount = 0;

        // Move all elements except 0 to the left most possible
        // of an array
        for(int eachNumber : nums){
            if(eachNumber != 0){
                nums[insertCount++]=eachNumber;
            }
        }

        //append 0 to the remaining index on the right side of the nums[]

        while(insertCount < nums.length){
            nums[insertCount++]=0;
        }

    }

   public static void main(String args[]){
       System.out.println("MoveZeroes");
       MoveZeroes mz = new MoveZeroes();

       int[] input1 = {0,1,0,3,12};
       int[] input2 = {0,1,0,0,0};
       int[] input3 = {0,0,0};

       mz.moveZeroes(input1);
       System.out.println(Arrays.toString(input1));

       mz.moveZeroes(input2);
       System.out.println(Arrays.toString(input2));

       mz.moveZeroes(input3);
       System.out.println(Arrays.toString(input3));

   }
}
