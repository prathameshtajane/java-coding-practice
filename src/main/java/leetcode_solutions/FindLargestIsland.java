package leetcode_solutions;

/**
 *Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

 Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

 Example 1:
 [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
 Example 2:
 [[0,0,0,0,0,0,0,0]]
 Given the above grid, return 0.
 Note: The length of each dimension in the given grid does not exceed 50.


 Link : https://leetcode.com/problems/max-area-of-island/description/
 */
public class FindLargestIsland {


    static int MAX_ROW;
    static int MAX_COL;


    static class Count{
        int count;
        Count(int count){
            this.count=count;
        }
    }

    static boolean isSafe(int[][] matrix,int row,int col,boolean[][] visited){
        if(row >= 0 && col >= 0 && row < MAX_ROW && col < MAX_COL){
            if(!visited[row][col] && matrix[row][col]==1){
                return true;
            }
        }
        return false;
    }

    static void DFSutil(int[][] matrix,int row,int col,boolean[][] visited,Count count){
        visited[row][col]=true;

        //Since we are only considering 4 borders and not 8
        int[] valid_rows={-1,0,1,0};
        int[] valid_cols={0,1,0,-1};
        for(int i=0;i<4;i++){
            if(isSafe(matrix,row+valid_rows[i],col+valid_cols[i],visited)){
                count.count+=1;
                DFSutil(matrix,row+valid_rows[i],col+valid_cols[i],visited,count);
            }
        }
    }

    static int maxAreaOfIsland(int[][] matrix){
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        Count maxCount = new Count(0);
        MAX_ROW=matrix.length;
        MAX_COL=matrix[0].length;

        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[0].length;c++){
                if(!visited[r][c] && matrix[r][c]==1){
                    Count currCount = new Count(1);
                    DFSutil(matrix,r,c,visited,currCount);
                    if(currCount.count > maxCount.count){
                        maxCount.count = currCount.count;
                    }
                }
            }
        }
        return maxCount.count;
    }


    public static void main(String args[]){
        System.out.println("FindLargestIsland");
//        int[][] inputMatrix = {{0,0,1,1,0},{1,0,1,1,0},{0,1,0,0,0},{0,0,0,0,1}};
        int[][] inputMatrix = {{0,0,0,0,0}};
        FindLargestIsland f = new FindLargestIsland();
        System.out.println(f.maxAreaOfIsland(inputMatrix));
    }
}
