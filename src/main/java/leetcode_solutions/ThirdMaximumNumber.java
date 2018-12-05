package leetcode_solutions;

import java.util.*;

/**
 * Created by prathamesh on 7/13/18.
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> sortedSet = new HashSet<>();
        for(int num : nums){
            sortedSet.add(num);
        }
        List<Integer> sortedList = new ArrayList<>(sortedSet);
        if(sortedList.size() <= 2){
            return sortedList.get(sortedList.size()-1);
        }else{
            return sortedList.get(sortedList.size()-3);
        }
    }

    public static void main(String args[]){
        System.out.println("Third Maximum Number");
        ThirdMaximumNumber TMAX = new ThirdMaximumNumber();
        int[] inputArray = {};
        System.out.println(TMAX.thirdMax(inputArray));

    }
}
