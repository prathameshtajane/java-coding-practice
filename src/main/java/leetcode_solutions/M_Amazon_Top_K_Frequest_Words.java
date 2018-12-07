package leetcode_solutions;

import java.util.*;

/**
 * 692. Top K Frequent Words
 *
 * Given a non-empty list of words, return the k most frequent elements.
 *
 * Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.
 *
 * Example 1:
 * Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 * Output: ["i", "love"]
 * Explanation: "i" and "love" are the two most frequent words.
 *     Note that "i" comes before "love" due to a lower alphabetical order.
 * Example 2:
 * Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
 * Output: ["the", "is", "sunny", "day"]
 * Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
 *     with the number of occurrence being 4, 3, 2 and 1 respectively.
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Input words contain only lowercase letters.
 *
 * Follow up:
 * Try to solve it in O(n log k) time and O(n) extra space.
 *
 * link : https://leetcode.com/problems/top-k-frequent-words/description/
 */

public class M_Amazon_Top_K_Frequest_Words {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> op_list = new ArrayList<>();

        Map<String,Integer> word_count_map = new HashMap<>();

        for(String word : words){
            word_count_map.put(word,word_count_map.getOrDefault(word,0)+1);
        }

        Map<Integer, TreeSet<String>> count_wordsList_map=new TreeMap<>(Collections.reverseOrder());

        for(String word : word_count_map.keySet()){
            TreeSet<String> curr_set = count_wordsList_map.getOrDefault(word_count_map.get(word),new TreeSet<String>());
            curr_set.add(word);
            count_wordsList_map.put(word_count_map.get(word),curr_set);
        }

        for(Integer count:count_wordsList_map.keySet()){
            Set<String> temp_word_set = count_wordsList_map.get(count);
            for(String word : temp_word_set){
                if(op_list.size() < k){
                    op_list.add(word);
                }else{
                    return op_list;
                }
            }
        }
        return op_list;
    }
}
