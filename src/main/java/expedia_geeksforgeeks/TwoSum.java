package expedia_geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] outputArray = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(target-nums[i])){
                outputArray[1]=i;
                outputArray[0]=map.get(target-nums[i]);
                return outputArray;
            }
            map.put(nums[i],i);
        }

        return outputArray;
    }

//    public static void main(String arg[]){
//        int [] inputArray = {1,2,3,4,5,6,7,8,9};
//        int target = 16;
//        Map<Integer,Integer> convertedINputHashMap = new HashMap();
//        for(int eachNum : inputArray){
//            convertedINputHashMap.put(eachNum,eachNum);
//        }
//        for(Integer eachKey : convertedINputHashMap.keySet()){
//            if(convertedINputHashMap.containsKey(target - eachKey) && eachKey*2 != target){
//                System.out.println("Two sum present !");
//                System.exit(0);
//            }
//        }
//        System.out.println("Two sum absent !");
//    }
}
