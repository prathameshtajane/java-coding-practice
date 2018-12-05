package leetcode_solutions;

/**
 * You are given an n x n 2D matrix representing an image.
 * <p>
 * Rotate the image by 90 degrees (clockwise).
 * <p>
 * Note:
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * <p>
 * Example 1:
 * <p>
 * Given input matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * rotate the input matrix in-place such that it becomes:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * Example 2:
 * <p>
 * Given input matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 * <p>
 * rotate the input matrix in-place such that it becomes:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 * <p>
 * <p>
 * Link : https://leetcode.com/problems/rotate-image/description/
 */
public class Rotate_Image {
    void rotate(int[][] matrix) {
        for (int layer = 0; layer < (matrix.length / 2); layer++) {
            for (int pos = layer; pos < matrix.length - 1 - layer; pos++) {
                //value at co-ordinate 1
                int point1 = matrix[layer][pos];
                int point2 = matrix[pos][matrix.length - 1 - layer];
                int point3 = matrix[matrix.length - 1 - layer][matrix.length - 1 - pos];
                int point4 = matrix[matrix.length - 1 - pos][layer];

                //in-place changing
                matrix[layer][pos] = point4;
                matrix[pos][matrix.length - 1 - layer] = point1;
                matrix[matrix.length - 1 - layer][matrix.length - 1 - pos] = point2;
                matrix[matrix.length - 1 - pos][layer] = point3;

            }
        }
    }

    void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        System.out.println("Rotate_Image");
        Rotate_Image rotateImage = new Rotate_Image();
        int[][] testMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println("Before Rotation");
        rotateImage.printMatrix(testMatrix);
        rotateImage.rotate(testMatrix);
        System.out.println();
        System.out.println("After Rotation");
        rotateImage.printMatrix(testMatrix);
    }
}
