package leetcode_solutions;

/**
 * 33. Search in Rotated Sorted Array
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */

public class M_Amazon_Search_in_Rotated_Sorted_Array {

    public int binarySearch(int[] arr , int minIndex , int maxIndex , int target){

        if(minIndex >  maxIndex){
            return -1;
        }


        if(arr[minIndex]==target){
            return minIndex;
        }

        if(arr[maxIndex]==target){
            return maxIndex;
        }

        int midIndex = (minIndex+maxIndex)/2;
        if(arr[midIndex]==target){
            return midIndex;
        }
        if(arr[midIndex] < target){
            return binarySearch(arr,midIndex+1,maxIndex,target);
        }else{
            return binarySearch(arr,minIndex,midIndex-1,target);
        }
    }

    //optimal way to find rotated index
    public int find_rotate_index(int[] nums,int left, int right) {
        if (nums[left] < nums[right])
            return 0;

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (nums[pivot] > nums[pivot + 1])
                return pivot + 1;
            else {
                if (nums[pivot] < nums[left])
                    right = pivot - 1;
                else
                    left = pivot + 1;
            }
        }
        return 0;
    }


    public int search(int[] nums, int target) {
        //step 1 : find the pivot element i.e. the element where the array is rotated
        int pivotIndex = -1;
        for(int i = 0 ;  i < nums.length-1 ; i++){
            if(nums[i]>nums[i+1]){
                pivotIndex=i;
            }
        }
        if(pivotIndex != -1){
            if(nums[0] > target){
                return binarySearch(nums,pivotIndex+1,nums.length-1,target);
            }else{
                return binarySearch(nums,0,pivotIndex,target);
            }
        }else{
            return binarySearch(nums,0,nums.length-1,target);
        }
    }

}
