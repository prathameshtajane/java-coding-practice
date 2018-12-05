package leetcode_solutions.google;


/*
    228. Summary Ranges

    Given a sorted integer array without duplicates, return the summary of its ranges.

    Example 1:

    Input:  [0,1,2,4,5,7]
    Output: ["0->2","4->5","7"]
    Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
    Example 2:

    Input:  [0,2,3,4,6,8,9]
    Output: ["0","2->4","6","8->9"]
    Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.

    Link : https://leetcode.com/problems/summary-ranges/description/

 */

import java.util.ArrayList;
import java.util.List;

public class M_Summary_Ranges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> opList = new ArrayList<>();

        if(nums.length < 1){
            return null;
        }
        if(nums.length == 1){
            opList.add(Integer.toString(nums[0]));
            return opList;
        }

        int first = nums[0];
        int last = nums[0];

        for(int i=0;i<=nums.length-2;i++){
            if(nums[i+1]-nums[i] == 1){
                last = nums[i+1];
                continue;
            }
            if(first != last){
            opList.add(first+"->"+last);
            }else{
                opList.add(Integer.toString(last));
            }
            last=first=nums[i+1];
        }

        if(nums[nums.length-1]-nums[nums.length-2]!=1){
            opList.add(Integer.toString(nums[nums.length-1]));
        }else{
            opList.add(first+"->"+last);
        }

        if(opList.size() == 0){
            opList.add(nums[0]+"->"+nums[nums.length-1]);
        }
        return opList;
    }

    public static void main(String args[]){
        System.out.println("M_Summary_Ranges");
//        int[] input1 = {0,1,2,4,5,6,8};
//          int[] input1 = {0,1,2};
//        int[] input1 = {0};
//        int[] input1 = {0,3,5};
//        int[] input1 = {0,3};
//        int[] input1 = {11,12,34,555555,55555,55556,10000000};
        int[] input1 = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(input1).toString());

    }
}
