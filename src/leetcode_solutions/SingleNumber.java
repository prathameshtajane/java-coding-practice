package leetcode_solutions;


/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
    Note:
    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

    Solution :
    For anyone who didn’t understood why this works here is an explanation.
    This XOR operation works because it’s like XORing all the numbers by itself.
    So if the array is {2,1,4,5,2,4,1} then it will be like we are performing this operation
    ((2^2)^(1^1)^(4^4)^(5)) => (0^0^0^5) => 5.
    Hence picking the odd one out ( 5 in this case).
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i<nums.length; i++)
        {
            result ^=nums[i];
        }
        return result;
    }

    public static void main(String args[]){
        int[] testArray = {2,2,1,1,5};
        System.out.println(SingleNumber.singleNumber(testArray));
    }
}
