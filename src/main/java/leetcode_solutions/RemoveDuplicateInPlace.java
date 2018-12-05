package leetcode_solutions;

import java.util.Arrays;

/**
 * 26. Remove Duplicates from Sorted Array
 *
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example :
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 *
 * Algorithm
 * Since the array is already sorted, we can keep two pointers i and j, where i is the slow-runner while j is the fast runner
 * As long as nums[i]=nums[j],we increment j to skip duplicates.
 * When we encounter nums[j]!=nums[i],the duplicate run has ended so we must copy its value to nums[i+1].i is then
 * incremented and we repeat  the same process until j reaches the end of array.
 */
public class RemoveDuplicateInPlace {
    public static int removeDuplicates(int arr[]){
        if(arr.length==0){
            return 0;
        }
        int slow_runner = 0;
        for(int fast_runner = 1;fast_runner<arr.length;fast_runner++){
            if(arr[slow_runner]!=arr[fast_runner]){
                slow_runner++;
                arr[slow_runner]=arr[fast_runner];
            }
        }
        return slow_runner+1;
    }

    public static void main(String args[]){
        int []arr={1,2,2,3,3,3,3,3,5};
        System.out.println(Arrays.toString(arr));
        int output=RemoveDuplicateInPlace.removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(output);
    }
}
