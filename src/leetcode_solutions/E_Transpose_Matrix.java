package leetcode_solutions;


/**
 *  867. Transpose Matrix
 *  Given a matrix A, return the transpose of A.
 *
 * The transpose of a matrix is the matrix flipped over it's main diagonal,
 * switching the row and column indices of the matrix.
 *
 * Example 1:
 *
 * Input: [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * Example 2:
 *
 * Input: [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 *
 * Note:
 *
 * 1 <= A.length <= 1000
 * 1 <= A[0].length <= 1000
 *
 * link : https://leetcode.com/problems/transpose-matrix/
 */

public class E_Transpose_Matrix {

    /**
     *
     * Time Complexity : O(n^2)
     * Space Complexity = O(n^2)
     * */
    private static int[][] transpose(int[][] A) {
        int[][] new_matrix = new int[A[0].length][A.length];
        for (int new_row = 0; new_row < A[0].length; new_row++) {
            for (int new_col = 0; new_col < A.length; new_col++) {
                new_matrix[new_row][new_col] = A[new_col][new_row];
            }
        }
    return new_matrix;

    }

    public static void main(String[] args) {
        System.out.println("867. Transpose Matrix");
    }
}
