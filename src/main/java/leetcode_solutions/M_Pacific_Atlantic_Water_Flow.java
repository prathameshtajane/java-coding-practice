package leetcode_solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 417. Pacific Atlantic Water Flow
 *
 * Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent,
 * the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and
 * bottom edges.
 *
 * Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.
 *
 * Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.
 *
 * Note:
 * The order of returned grid coordinates does not matter.
 * Both m and n are less than 150.
 * Example:
 *
 * Given the following 5x5 matrix:
 *
 *   Pacific ~   ~   ~   ~   ~
 *        ~  1   2   2   3  (5) *
 *        ~  3   2   3  (4) (4) *
 *        ~  2   4  (5)  3   1  *
 *        ~ (6) (7)  1   4   5  *
 *        ~ (5)  1   1   2   4  *
 *           *   *   *   *   * Atlantic
 *
 * Return:
 *
 * [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).
 *
 * link : https://leetcode.com/problems/pacific-atlantic-water-flow/description/
 *
 * Algorithm : variation of matrix DFS
 */
public class M_Pacific_Atlantic_Water_Flow {


    public List<int[]> pacificAtlantic(int[][] matrix) {

        List<int[]> resultPoints = new ArrayList<>();

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return resultPoints;
        }

        //create a visited boolean arrays for both atlantic and pacific
        boolean[][] pacificVisited = new boolean[matrix.length][matrix[0].length];
        boolean[][] atlanticVisited = new boolean[matrix.length][matrix[0].length];

        //dfs for top and right edges of given matrix
        for(int r = 0 ; r < matrix.length ; r++){
            dfs(matrix,pacificVisited,Integer.MIN_VALUE,r,0);
            dfs(matrix,atlanticVisited,Integer.MIN_VALUE,r,matrix[0].length-1);
        }

        //dfs for left and bottom edges of given matrix
        for(int c = 0 ; c < matrix[0].length ; c++){
            dfs(matrix,pacificVisited,Integer.MIN_VALUE,0,c);
            dfs(matrix,atlanticVisited,Integer.MIN_VALUE,matrix.length-1,c);
        }

        //finding the common visited points from both pacific and atlantic
        for(int r = 0 ; r < matrix.length ; r++){
            for(int c = 0 ; c < matrix[0].length ; c++){
                if(pacificVisited[r][c] && atlanticVisited[r][c]){
                    resultPoints.add(new int[]{r,c});
                }
            }
        }
        return resultPoints;
    }
    int[][] validDirections = new int[][]{{0,-1},{-1,0},{0,1},{1,0}};
    public void dfs(int[][] matrix, boolean[][] visited, int height,int row,int col){
        //edge cases
        if(row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] < height || visited[row][col]){
            return;
        }
        visited[row][col]=true;
        for(int dir = 0 ; dir < validDirections.length ; dir++){
            dfs(matrix,visited,matrix[row][col],row+validDirections[dir][0],col+validDirections[dir][1]);
        }
    }

    public static void main(String[] args) {
        int[][] inputMatrix = new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        M_Pacific_Atlantic_Water_Flow testObj = new M_Pacific_Atlantic_Water_Flow();
        testObj.pacificAtlantic(inputMatrix).forEach((int[] x) -> {
            System.out.println(x[0]+","+x[1]+"\n");
        });
    }
}
