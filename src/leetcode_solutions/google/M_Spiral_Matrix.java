package leetcode_solutions.google;

/*

    Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

    Example 1:

    Input:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Output: [1,2,3,6,9,8,7,4,5]


    Example 2:

    Input:
    [
      [1, 2, 3, 4],
      [5, 6, 7, 8],
      [9,10,11,12]
    ]
    Output: [1,2,3,4,8,12,11,10,9,5,6,7]

    Link : https://leetcode.com/problems/spiral-matrix/description/

    DFS approach : https://leetcode.com/problems/spiral-matrix/discuss/187750/dfs-solution-beats-100

 */

import java.util.ArrayList;
import java.util.List;

public class M_Spiral_Matrix {

    private static List<Integer> getSpriralTraversalOfMatrix(int[][] input_matrix){
        List<Integer> spiral_traversal_accum_list = new ArrayList<>();

        if (input_matrix.length == 0) return spiral_traversal_accum_list;

        int start_row = 0;
        int end_row = input_matrix.length-1;
        int start_col = 0;
        int end_col = input_matrix[0].length-1;

        while(start_row <= end_row && start_col < end_col){
            // iterate from left to right
            for(int col = start_col ; col <= end_col ; col++)
                spiral_traversal_accum_list.add(input_matrix[start_row][col]);

            start_row++;

            //iterate up to down
            for(int row = start_row; row <= end_row; row++){
                spiral_traversal_accum_list.add(input_matrix[row][end_col]);
            }
            end_col--;

            //iterate from right to left
            for(int col = end_col ; col >= start_col ; col--)
                spiral_traversal_accum_list.add(input_matrix[end_row][col]);

            end_row--;

            //iterate from down to up
            for(int row = end_row; row >= start_row; row--){
                spiral_traversal_accum_list.add(input_matrix[row][start_col]);
            }
            start_col++;
        }

        return spiral_traversal_accum_list;
    }

    public static void main(String args[]){
        System.out.println("M_Spiral_Matrix");
        int[][] input_matrix = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
        getSpriralTraversalOfMatrix(input_matrix).stream().forEachOrdered(System.out::println);
    }
}
