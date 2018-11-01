package leetcode_solutions;

/*
    347. Top K Frequent Elements

    Given a non-empty array of integers, return the k most frequent elements.

    Example 1:

    Input: nums = [1,1,1,2,2,3], k = 2
    Output: [1,2]
    Example 2:

    Input: nums = [1], k = 1
    Output: [1]
    Note:

    You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
    Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

    link : https://leetcode.com/problems/top-k-frequent-elements/description/

    Algorithm :

    Brute Force :

    step 1 - Using HashMap with comparator storing values in descending order count
             Time Complexity : O(nlogn)

    Efficient Algorithm :

    step 1 - Modify bucket sort for this problem
             Time Complexity : O(n)


 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M_TopKFrequentElements {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>  countNumberMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];

        for(int num : nums){
            countNumberMap.put(num,countNumberMap.getOrDefault(num,0)+1) ;
        }

        for (int key : countNumberMap.keySet()) {
            int frequency = countNumberMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> res = new ArrayList<>();

        for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("M_TopKFrequentElements");
        System.out.println(topKFrequent(new int[]{1,1,1,2,2,3},2));
        System.out.println(topKFrequent(new int[]{1},1));
    }
}
