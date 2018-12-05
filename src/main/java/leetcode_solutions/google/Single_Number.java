package leetcode_solutions.google;

/**
 *
     Given a non-empty array of integers, every element appears twice except for one. Find that single one.

     Note:

     Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

     Example 1:

     Input: [2,2,1]
     Output: 1
     Example 2:

     Input: [4,1,2,1,2]
     Output: 4
 */
public class Single_Number {

    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println("Single Number");
        Single_Number SN = new Single_Number();

        int[] inputArray1 = {2,2,1};
        int[] inputArray2 = {4,1,2,1,2};
        int[] inputArray3 = {1};
        int[] inputArray4 = {1,1};

        System.out.println(SN.singleNumber(inputArray1));
        System.out.println(SN.singleNumber(inputArray2));
        System.out.println(SN.singleNumber(inputArray3));
        System.out.println(SN.singleNumber(inputArray4));
    }
}
