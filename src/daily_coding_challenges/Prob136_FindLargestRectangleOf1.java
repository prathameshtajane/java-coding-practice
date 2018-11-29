package daily_coding_challenges;

import java.util.Arrays;

/**
 * This question was asked by Google.
 *
 * Given an N by M matrix consisting only of 1's and 0's, find the largest rectangle containing only 1's and return its area.
 *
 * For example, given the following matrix:
 *
 * [[1, 0, 0, 0],
 *  [1, 0, 1, 1],
 *  [1, 0, 1, 1],
 *  [0, 1, 0, 0]]
 *
 *  Return 4.
 *
 */
public class Prob136_FindLargestRectangleOf1 {


    private static int getLargestSquare(Integer [][] input_matrix){
        int max_square_size = 0;
        int[][] temp_matrix = new int[input_matrix.length][input_matrix[0].length];

        //copying row 1
        for(int col = 0; col < input_matrix[0].length; col++)
            temp_matrix[0][col]=input_matrix[0][col];

        //copying col 1
        for(int row = 0; row < input_matrix.length ; row++)
            temp_matrix[row][0]=input_matrix[row][0];

        for(int row=1 ; row < input_matrix.length ; row++ )
            for(int col = 1 ; col < input_matrix[0].length ; col++){
                if(input_matrix[row][col]==1){
                    temp_matrix[row][col]=Math.min(temp_matrix[row][col-1],Math.min(temp_matrix[row-1][col],temp_matrix[row-1][col-1]))+1;
                    max_square_size = max_square_size>temp_matrix[row][col] ? max_square_size : temp_matrix[row][col];
                }
            }

        return max_square_size*max_square_size;
    }

    //todo : incorrect logic
    private static int getLatgestRectangleInMatrix(Integer[][] input_matrix){
        int max_rectangle_size = 0;

        //find max_rectangle_size for only first row
        max_rectangle_size = Arrays.asList(input_matrix[0]).stream().reduce(0,(x,y)->x+y);

        for(int row = 1 ; row < input_matrix.length ; row++){
            for(int col = 0 ; col < input_matrix[0].length ; col++){
                if(input_matrix[row][col] == 1){
                    input_matrix[row][col] += input_matrix[row-1][col];
                }
            }
            int curr_row_sum = Arrays.asList(input_matrix[row]).stream().reduce(0,(x,y)->x+y);
            max_rectangle_size = max_rectangle_size > curr_row_sum ? max_rectangle_size : curr_row_sum;
        }
        return max_rectangle_size;
    }

    public static void main(String[] args) {
        Integer[][] input_matrix = {{1, 0, 0, 0},{1, 1, 1, 1},{1, 1, 1, 1},{0, 1, 1, 1}};
//        System.out.println("Largest Rectangle with 1");
//        System.out.println(getLatgestRectangleInMatrix(input_matrix));
        System.out.println("Largest Square with 1");
        System.out.println(getLargestSquare(input_matrix));
    }
}
