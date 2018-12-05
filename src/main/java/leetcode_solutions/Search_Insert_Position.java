package leetcode_solutions;

/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 *
 * Example 1:
     Input: [1,3,5,6], 5
     Output: 2
   Example 2:
     Input: [1,3,5,6], 2
     Output: 1
   Example 3:
     Input: [1,3,5,6], 7
     Output: 4
   Example 1:
     Input: [1,3,5,6], 0
     Output: 0
 */
public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int outputValue = 0;
        if(nums.length == 0){
            return outputValue;
        }
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==target || nums[i]>target){
                return i;
            }
            outputValue=i;
        }
        return ++outputValue;
    }
    public static void main(String args[]){
        int[] input = {1,3,5,6};
        System.out.println(searchInsert(input,0));
    }
}
