package leetcode_solutions;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * Example 1:
     Input: [1,1,0,1,1,1]
     Output: 3
     Explanation: The first two digits or the last three digits are consecutive 1s.
     The maximum number of consecutive 1s is 3.
 *
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int numMaxOnes = 0;
        int maxSoFar = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                numMaxOnes += 1;
                maxSoFar = Math.max(numMaxOnes,maxSoFar);
            }else if(nums[i]==0){
                numMaxOnes=0;
            }
        }
        return maxSoFar;
    }

    public static void main(String args[]){
        System.out.println("MaxConsecutiveOnes");
        MaxConsecutiveOnes MaxOne = new MaxConsecutiveOnes();
        int[] inputArray = {1,1,0,1,1,1};
        System.out.println(MaxOne.findMaxConsecutiveOnes(inputArray));
    }
}
