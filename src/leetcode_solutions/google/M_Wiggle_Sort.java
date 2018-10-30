package leetcode_solutions.google;

import java.util.Arrays;

/*
    280. Wiggle Sort

    Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

    Example:

    Input: nums = [3,5,2,1,6,4]
    Output: One possible answer is [3,5,1,6,2,4]

    Link : https://leetcode.com/problems/wiggle-sort/description/

 */
public class M_Wiggle_Sort {

    public static void rearrangeAsPerCaseOne(int[] nums,int startIndex){
        //case 1 : nums[0] <= nums[1] >= nums[2]
        if(nums[startIndex+1] < nums[startIndex+2]){
            int temp = nums[startIndex+1];
            nums[startIndex+1]=nums[startIndex+2];
            nums[startIndex+2]=temp;
        }

    }

    public static void rearrangeAsPerCaseTwo(int[] nums,int startIndex){
        //case 1 : nums[0] >= nums[1] <= nums[2]
        if(nums[startIndex+1] > nums[startIndex+2]){
            int temp = nums[startIndex+1];
            nums[startIndex+1]=nums[startIndex+2];
            nums[startIndex+2]=temp;
        }
    }

    public static void wiggleSort(int[] nums) {

        if(nums.length == 2){
            rearrangeAsPerCaseTwo(nums,-1);
        }else {

            boolean isCase1 = true;
            //case 1 : nums[0] <= nums[1] >= nums[2]
            //case 2 : nums[0] >= nums[1] <= nums[2]
            for (int i = 0; i < nums.length - 2; i++) {
                if(i==0){
                    int maxIndex = 0;
                    int max = nums[0];
                    for(int j = 0 ;j<= 2;j++){
                        if(nums[j] > max){
                            max = nums[j];
                            maxIndex = j;
                        }
                    }
                    int temp = nums[1];
                    nums[1]=max;
                    nums[maxIndex]=temp;
                }
                if (isCase1) {
                    rearrangeAsPerCaseOne(nums, i);
                } else {
                    rearrangeAsPerCaseTwo(nums, i);
                }
                isCase1 = !isCase1;
            }
        }
    }

    public static void main(String args[]){
        System.out.println("M_Wiggle_Sort");
//        int[] input1 = {3,5,2,1,6,4};
//        int[] input1 = {1,2,3,4,5,6};
//        int[] input1 = {3,1,2};
//        int[] input1 = {1,2,3};
        int[] input1 = {3,1,2,4};
        wiggleSort(input1);
        System.out.println(Arrays.toString(input1));
    }
}
