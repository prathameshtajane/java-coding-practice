package leetcode_solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 *
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 * link : https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class E_Intersection_Of_Two_Arrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1_set = new HashSet<>();
        Set<Integer> nums2_set = new HashSet<>();
        for(int num : nums1){
            nums1_set.add(num);
        }
        for(int num : nums2){
            nums2_set.add(num);
        }
        nums1_set.retainAll(nums2_set);
        int[] intersection_arr = new int[nums1_set.size()];
        int i = 0;
        for(Integer num : nums1_set){
            intersection_arr[i++]=num;
        }
        return intersection_arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1},new int[]{2,2})));
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5},new int[]{9,4,9,8,4})));
    }
}
