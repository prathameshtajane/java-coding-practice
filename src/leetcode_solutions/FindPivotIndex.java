package leetcode_solutions;

/**
 * Find Pivot Index
 *
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.

 We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

 If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

 */
public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int total = 0, sum = 0;
        for (int num : nums) total += num;
        for (int i = 0; i < nums.length; sum += nums[i++])
            if (sum * 2 == total - nums[i]) return i;
        return -1;
    }

    public static void main(String args[]){
        System.out.println("Find Pivot Index");
        FindPivotIndex FP = new FindPivotIndex();
        int[] input = {1, 7, 3, 6, 5, 6};
        System.out.println(FP.pivotIndex(input));
    }
}
