package leetcode_solutions;


import java.util.HashMap;
import java.util.Map;

/**
 *
 Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

 Your algorithm should run in O(n) complexity.

 Example:

 Input: [100, 4, 200, 1, 3, 2]
 Output: 4
 Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

 link : https://leetcode.com/problems/longest-consecutive-sequence/description/
 */
public class H_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        //adding nums in set
        int maxConsecutiveSubCount = Integer.MIN_VALUE;
        Map<Integer,Boolean> map = new HashMap<>();
        for(int num : nums){
            map.put(num,true);
        }

        for(int num : nums){
            if(map.get(num)){
               int temp = num;
               while(map.containsKey(temp-1)){
                   temp=temp-1;
               }
               map.put(temp,false);
               int tempMaxConsecutiveSubCount=1;
               while(map.containsKey(temp+1)){
                   map.put(temp+1,false);
                   ++tempMaxConsecutiveSubCount;
                   ++temp;
               }
               maxConsecutiveSubCount=Math.max(maxConsecutiveSubCount,tempMaxConsecutiveSubCount);
            }
        }
        return maxConsecutiveSubCount;
    }
}
