import java.util.Arrays;

/*
In MATLAB, there is a very useful function called 'reshape',
which can reshape a matrix into a new one with different size but keep its original data.
You're given a matrix represented by a two-dimensional array,
and two positive integers r and c representing the row number and column number of the
wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original
matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal,
output the new reshaped matrix; Otherwise, output the original matrix.

Example:

Input:
nums =
[[1,2],
 [3,4]]
r = 1, c = 4
Output:
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix,
fill it row by row by using the previous list.

Example:

Input:
nums =
[[1,2],
 [3,4]]
r = 2, c = 4
Output:
[[1,2],
 [3,4]]
Explanation:
There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.

Note:
The height and width of the given matrix is in range [1, 100].
The given r and c are all positive.


*/
public class ReshapeTheMatrix {

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows=nums.length;
        int cols=nums[0].length;
        int count=0;

        if((rows*cols)!=(r*c)){
            return nums;
        }

        //creating new matrix of size rows*cols
        int reShapedMatrix[][]=new int[r][c];

        int allNums[]=new int[rows*cols];

        for(int[] row:nums){
            for(int num:row){
                allNums[count++]=num;
            }
        }

        //re initaliasing count variable for reuse
        count=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                reShapedMatrix[i][j]=allNums[count++];
            }
        }

        System.out.println("Reshade Matrix : ");
        System.out.println(Arrays.deepToString(reShapedMatrix));
        return reShapedMatrix;
    }

    public static void main(String args[]){
        int[][] testMatrix=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                testMatrix[i][j]=3;
            }
        }
        matrixReshape(testMatrix,8,2);
    }


}
