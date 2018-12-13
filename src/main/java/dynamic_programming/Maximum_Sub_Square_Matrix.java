package dynamic_programming;

/**
 * 'Maximum Sub Square Matrix'
 *
 * Given a matrix of 0s and 1s, find the biggest sub-square matrix entirely of 1s
 */
public class Maximum_Sub_Square_Matrix {

    public int getMin(int a,int b, int c){
        return Math.min(a,Math.min(b,c));
    }

    public int getMaximumSubSquareMtrix(int matrix[][]){
        int[][] outputMatrix = new int[matrix.length][matrix[0].length];
        // copy first row in matrix
        for(int col = 0 ; col < matrix[0].length ; col++){
            outputMatrix[0][col]=matrix[0][col];
        }
        // copy first col in matrix
        for(int row = 0 ; row < matrix.length ; row++){
            outputMatrix[row][0]=matrix[0][0];
        }

        for(int row = 1 ; row < matrix.length ; row++){
            for(int col = 1 ; col < matrix[0].length ; col++){
                if(matrix[row][col]==1){
                    outputMatrix[row][col]=getMin(outputMatrix[row-1][col],outputMatrix[row][col-1],outputMatrix[row-1][col-1])+1;
                }
            }
        }

        int maxSquareSize = 0;
        for(int row = 0 ; row < matrix.length ; row++){
            for(int col = 0 ; col < matrix[0].length ; col++){
                if(outputMatrix[row][col] > maxSquareSize){
                    maxSquareSize=outputMatrix[row][col];
                    }
                }
            }

        return maxSquareSize*maxSquareSize;
        }
}
