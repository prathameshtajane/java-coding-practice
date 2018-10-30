package leetcode_solutions;


import java.util.HashSet;
import java.util.Set;

/**
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.

 Now given an M x N matrix, return True if and only if the matrix is Toeplitz.


 Example 1:

 Input:
 matrix = [
 [1,2,3,4],
 [5,1,2,3],
 [9,5,1,2]
 ]
 Output: True
 Explanation:
 In the above grid, the diagonals are:
 "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
 In each diagonal all elements are the same, so the answer is True.
 Example 2:

 Input:
 matrix = [
 [1,2],
 [2,2]
 ]
 Output: False
 Explanation:
 The diagonal "[1, 2]" has different elements.

 Note:

 matrix will be a 2D array of integers.
 matrix will have a number of rows and columns in range [1, 20].
 matrix[i][j] will be integers in range [0, 99].
 */

public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int c = 0 ;c < matrix[0].length;c++){
            int temp_r = 0;
            int temp_c = c;
            Set<Integer> testSet = new HashSet<>();
            while(temp_r < matrix.length && temp_c < matrix[0].length){
                testSet.add(matrix[temp_r][temp_c]);
                temp_r += 1;
                temp_c += 1;
                if(testSet.size() > 1){
                    return false;
                }
            }

        }

        for(int r = 0 ;r < matrix.length;r++){
            int temp_r = r;
            int temp_c = 0;
            Set<Integer> testSet = new HashSet<>();
            while(temp_r < matrix.length && temp_c < matrix[0].length){
                testSet.add(matrix[temp_r][temp_c]);
                temp_r += 1;
                temp_c += 1;
                if(testSet.size() > 1){
                    return false;
                }
            }

        }

        return true;
    }

    public static void main(String args[]){
        System.out.println("Toeplitz Matrix");
        int[][] inputMatrix = {{1,2},{2,2}};
        ToeplitzMatrix TM = new ToeplitzMatrix();
        System.out.println(TM.isToeplitzMatrix(inputMatrix));
    }
}
