package leetcode_solutions;

/**
 *  59. Spiral Matrix II
 *
 *  Given a positive integer n, generate a square matrix filled with elements from 1 to n^2 in spiral order.
 *
 * Example:
 *
 * Input: 3
 * Output:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 *
 * link : https://leetcode.com/problems/spiral-matrix-ii/description/
 */

public class M_Amazon_Spiral_Matrix_II {

    public static int[][] generateMatrix(int n) {
        int[][] op_matrix = new int[n][n];
        int begin_row = 0;
        int end_row = op_matrix.length-1;
        int begin_col = 0;
        int end_col = op_matrix[0].length-1;

        int count = 1;
        while (begin_row <= end_row && begin_col <= end_col) {
            //left to right traversal
            for (int col = begin_row; col <= end_row; col++) {
                op_matrix[begin_row][col] = count++;
            }
            ++begin_row;
            //up to down traversal
            for (int row = begin_row ; row <= end_row ; row++){
                op_matrix[row][end_col]=count++;
            }
            --end_col;
            //right to left traversal
            for(int col=end_col ; col >= begin_col ; col--){
                op_matrix[end_row][col]=count++;
            }
            --end_row;
            //down to up traversal
            for(int row = end_row ; row >= begin_row ; row--){
                op_matrix[row][begin_col]=count++;
            }
            ++begin_col;
        }
        return op_matrix;
    }

    public static void main(String[] args) {
        generateMatrix(3);
    }
}
