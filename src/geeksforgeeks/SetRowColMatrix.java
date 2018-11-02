package geeksforgeeks;


/*
    Given a boolean matrix mat[M][N] of size M X N,
    modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.

    Example 1
    The matrix
    1 0
    0 0
    should be changed to following
    1 1
    1 0

    Example 2
    The matrix
    0 0 0
    0 0 1
    should be changed to following
    0 0 1
    1 1 1

    Example 3
    The matrix
    1 0 0 1
    0 0 1 0
    0 0 0 0
    should be changed to following
    1 1 1 1
    1 1 1 1
    1 0 1 1

    Algorithm :

    step 1 - maintain 2 arrays rowSetFlags and colSetFlags to be set as the row number and col number
             when we find set elements in matrix.
    step 2 - iterate over rowSetFlags and colSetFlags and set the whole corresponding row and col in the input_matrix.

    Time Complexity - O(row-size * col_size)
 */
public class SetRowColMatrix {


    private static void printMatrix(int[][] input_matrix){
        for(int r = 0; r < input_matrix.length ; r ++){
            for (int c = 0 ;c < input_matrix[0].length ; c++){
                System.out.print(input_matrix[r][c]+"  ");
            }
            System.out.println();
        }
    }

    private static void setRowColIfOneCellIsSet(int[][] input_matrix){
        int[] rowSetFlag = new int[input_matrix.length];
        int[] colSetFlag = new int[input_matrix[0].length];

        //populate rowSetFlag and colSetFlag
        for(int r=0 ; r<input_matrix.length ; r++){
            for(int c=0 ; c<input_matrix[0].length ; c++){
                if(input_matrix[r][c] == 1){
                    rowSetFlag[r]=1;
                    colSetFlag[c]=1;
                }
            }
        }

        //modifying input matrix rows
        for(int i=0;i<rowSetFlag.length;i++){
            if(rowSetFlag[i]==1){
                for(int r = 0 ; r < input_matrix[0].length ; r++ ){
                    if(input_matrix[i][r]!=1){
                        input_matrix[i][r]=1;
                    }
                }
            }

        }

        //modifying input matrix cols
        for(int i=0;i<colSetFlag.length;i++){
            if(colSetFlag[i]==1){
                for(int c = 0;c <input_matrix.length;c++){
                    if(input_matrix[c][i] != 1){
                        input_matrix[c][i]=1;
                    }
                }
            }
        }

        //print modified matrix
        printMatrix(input_matrix);

    }

    public static void main(String[] args) {
        System.out.println("SetRowColMatrix");

        System.out.println("\nExample 1");
        int[][] input_matrix = {{1,0,0,1},{0,0,1,0},{0,0,0,0}};

        System.out.println("Input Matrix");
        printMatrix(input_matrix);
        System.out.println("Output Matrix");
        setRowColIfOneCellIsSet(input_matrix);

        System.out.println("\nExample 2");
        int[][] input_matrix2 = {{1,0},{0,1}};

        System.out.println("Input Matrix");
        printMatrix(input_matrix2);
        System.out.println("Output Matrix");
        setRowColIfOneCellIsSet(input_matrix2);


    }
}
