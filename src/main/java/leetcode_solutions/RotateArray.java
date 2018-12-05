package leetcode_solutions;

/**
 * Created by prathamesh on 7/14/18.
 */
public class RotateArray {


    public int[] rotateArray(int[] nums,int startIndex,int endIndex){
        while(startIndex < endIndex){
            int temp = nums[startIndex];
            nums[startIndex]=nums[endIndex];
            nums[endIndex]=temp;
            startIndex += 1;
            endIndex -= 1;
        }
        return nums;
    }

    public void rotate(int[] nums, int k) {
        if(nums.length != 0 && nums.length != 1){
            if(k > nums.length){
                k = k % nums.length;
            }
            nums=rotateArray(nums,nums.length-k,nums.length-1);
            nums=rotateArray(nums,0,nums.length-1-k);
            nums=rotateArray(nums,0,nums.length-1);
        }
    }

    public static void main(String args[]){
        System.out.println("Rotate Array");
        int[] input = {};
        RotateArray RA = new RotateArray();
        RA.rotate(input,3);
        System.out.println("END");
    }
}
