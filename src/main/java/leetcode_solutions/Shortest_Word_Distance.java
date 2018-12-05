package leetcode_solutions;

/**
 * 243. Shortest Word Distance
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
 *
 * Example:
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 *
 * Input: word1 = “coding”, word2 = “practice”
 * Output: 3
 * Input: word1 = "makes", word2 = "coding"
 * Output: 1
 * Note:
 * You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 *
 * link : https://leetcode.com/problems/shortest-word-distance/
 */
public class Shortest_Word_Distance {
    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    private static int shortestDistance(String[] words, String word1, String word2) {
        int min_dist = Integer.MAX_VALUE;
        int word1_index = -1;
        int word2_index = -1;
        for(int i = 0 ; i < words.length ; i++){
            if(words[i].equals(word1)){
                word1_index=i;
            }
            if(words[i].equals(word2)){
                word2_index=i;
            }
            if(word1_index != -1 && word2_index != -1){
                min_dist = Math.min(min_dist,Math.abs(word1_index-word2_index));
            }
        }
        return min_dist;
    }

    public static void main(String[] args) {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(shortestDistance(words,"makes","coding"));
    }

}
