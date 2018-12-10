package leetcode_solutions;

/**
 * 41. First Missing Positive
 *
 *Given an unsorted integer array, find the smallest missing positive integer.
 *
 * Example 1:
 *
 * Input: [1,2,0]
 * Output: 3
 * Example 2:
 *
 * Input: [3,4,-1,1]
 * Output: 2
 * Example 3:
 *
 * Input: [7,8,9,11,12]
 * Output: 1
 * Note:
 *
 * Your algorithm should run in O(n) time and uses constant extra space.
 *
 * link : https://leetcode.com/problems/first-missing-positive/description/
 *
 * Algorithm :
 * Put each number in its right place.
 *
 * For example:
 *
 * When we find 5, then swap it with A[4].
 *
 * At last, the first place where its number is not right, return the place + 1.
 */

public class H_Amazon_First_Missing_Positive {
    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public int firstMissingPositive(int[] nums) {

        if(nums.length == 0){
            return 1;
        }

        for(int i = 0 ; i < nums.length ; i++){
            while(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]){
                swap(i,nums[i]-1,nums);
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]-1 != i){
                return (i+1);
            }
        }

        return nums.length+1;
    }
}
