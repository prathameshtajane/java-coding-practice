package leetcode_solutions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 350. Intersection of Two Arrays II
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk,
 * and the memory is limited such that you cannot load all elements into the memory at once?
 *
 * link : https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class E_Oracle_Intersection_Of_Two_Arrays_2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for(int num : nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                resultList.add(num);
                map.put(num,map.get(num)-1);
            }
        }

        int[] result = new int[resultList.size()];

        for(int i = 0 ; i < result.length ; i++){
            result[i]=resultList.get(i);
        }
        return result;
    }
}
