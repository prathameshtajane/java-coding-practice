package leetcode_solutions;

/**
 * 72. Edit Distance
 *
 * Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.
 *
 * You have the following 3 operations permitted on a word:
 *
 * Insert a character
 * Delete a character
 * Replace a character
 * Example 1:
 *
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Explanation:
 * horse -> rorse (replace 'h' with 'r')
 * rorse -> rose (remove 'r')
 * rose -> ros (remove 'e')
 * Example 2:
 *
 * Input: word1 = "intention", word2 = "execution"
 * Output: 5
 * Explanation:
 * intention -> inention (remove 't')
 * inention -> enention (replace 'i' with 'e')
 * enention -> exention (replace 'n' with 'x')
 * exention -> exection (replace 'n' with 'c')
 * exection -> execution (insert 'u')
 *
 * link : https://leetcode.com/problems/edit-distance/description/
 */
public class H_Amazon_Edit_Distance {
    public int minDistance(String word1, String word2) {
        int rowCount = word1.length()+1;
        int colCount = word2.length()+1;


        int[][] matrix = new int[rowCount][colCount];


        for(int row = 0 ; row < rowCount ; row++)
            matrix[row][0]=row;

        for (int col = 0; col < colCount ; col++){
            matrix[0][col]=col;
        }

        for(int row = 1 ; row <= word1.length() ; row++)
            for (int col = 1; col <= word2.length() ; col++){
                if(word1.charAt(row-1) == word2.charAt(col-1)){
                    matrix[row][col]=matrix[row-1][col-1];
                }else{
                    matrix[row][col]=Math.min(matrix[row][col-1],
                            Math.min(matrix[row-1][col-1],matrix[row-1][col]))+1;
                }
            }

        return matrix[rowCount-1][colCount-1];
    }
}
