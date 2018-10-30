package careermonk.graph;


public class FindNumberOfIslands {

    static int MAX_ROW = 4;
    static int MAX_COL = 5;

    boolean isSafe(int[][] matrix, int row, int col, boolean[][] visited) {
        if (row < 0 || col < 0 || row >= MAX_ROW || col >= MAX_COL || visited[row][col]){
            return false;
        }
        return true;
    }

    void DFSutil(int[][] matrix, int row, int col, boolean[][] visited) {
        visited[row][col] = true;
        int[] valid_row_moves = {-1, 0, 1, 0};
        int[] valid_col_moves = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            if (isSafe(matrix, row + valid_row_moves[i], col + valid_col_moves[i], visited)){
                if(matrix[row + valid_row_moves[i]][col + valid_col_moves[i]]==1) {
                    DFSutil(matrix, row + valid_row_moves[i], col + valid_col_moves[i], visited);
                }
            }
        }
    }

    int CountNumberOfIslands(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int numberOfIsland = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (!visited[r][c] && matrix[r][c]==1) {
                    DFSutil(matrix, r, c, visited);
                    numberOfIsland += 1;
                }
            }
        }
        return numberOfIsland;
    }

    public static void main(String args[]) {
        System.out.println("FindNumberOfIslands");
        int[][] inputMatrix = {{0,0,1,1,0},{1,0,1,1,0},{0,1,0,0,0},{0,0,0,0,1}};
        FindNumberOfIslands t = new FindNumberOfIslands();
        System.out.println(t.CountNumberOfIslands(inputMatrix));
    }
}
