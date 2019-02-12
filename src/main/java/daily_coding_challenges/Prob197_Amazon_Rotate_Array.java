package daily_coding_challenges;

import java.util.Arrays;

/**
 * This problem was asked by Amazon.
 *
 * Given an array and a number k that's smaller than the length of the array,
 * rotate the array to the right k elements in-place.
 */
//todo:Prob197_Amazon_Rotate_Array
public class Prob197_Amazon_Rotate_Array {
    static void reverseArray (int[] nums , int startIndex , int endIndex){
        while(startIndex < endIndex){
            int temp = nums[startIndex];
            nums[startIndex]=nums[endIndex];
            nums[endIndex]=temp;
            startIndex += 1;
            endIndex -= 1;
        }
    }

    /**
     * nums = "----->-->"; k =3
     * result = "-->----->";
     *
     * reverse "----->-->" we can get "<--<-----"
     * reverse "<--" we can get "--><-----"
     * reverse "<-----" we can get "-->----->"
     */

    public static int[] rotate(int[] nums, int k){
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
        return nums;
    }

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5};
        int k = 4;
        System.out.println(Arrays.toString(rotate(inputArray,k)));
    }
}
