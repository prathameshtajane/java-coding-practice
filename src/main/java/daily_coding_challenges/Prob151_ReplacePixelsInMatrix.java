package daily_coding_challenges;

import java.util.Arrays;

/**
 * Given a 2-D matrix representing an image, a location of a pixel in the screen and a color C, replace the color of the given pixel and all adjacent same colored pixels with C.
 *
 * For example, given the following matrix, and location pixel of (2, 2), and 'G' for green:
 *
 * B B W
 * W W W
 * W W W
 * B B B
 * Becomes
 *
 * B B G
 * G G G
 * G G G
 * B B B
 *
 * Algorithm : Variation of DFS
 */
public class Prob151_ReplacePixelsInMatrix {

    static int[][] dir_deltas = new int[][]{{0,-1},{-1,0},{0,1},{1,0},};
    static char originalColor;

    static boolean  isSafe(char[][] matrix,boolean[][] visited,char rcolor,int row,int col){
        // boundary condition
        //check color if different than rcolor return true else return false
        //check visited[row][col] != true -> true else false
        if(row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] == rcolor || visited[row][col] || matrix[row][col] != originalColor){
            return false;
        }else{
            return true;
        }
    }

    public static char[][] DFSUtil(char[][] matrix,boolean[][] visited,char rcolor,int row,int col){
        for(int[] delta : dir_deltas){
            if(isSafe(matrix,visited,rcolor,row+delta[0],col+delta[1])){
                visited[row+delta[0]][col+delta[1]]=true;
                matrix[row+delta[0]][col+delta[1]]=rcolor;
                return DFSUtil(matrix,visited,rcolor,row+delta[0],col+delta[1]);
            }
        }
        return matrix;
    }

    public static char[][] DFS(char[][] matrix, char rcolor,int pixel_r , int pixel_c){
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        originalColor = matrix[pixel_r][pixel_c];
        visited[pixel_r][pixel_c]=true;
        matrix[pixel_r][pixel_c]=rcolor;
        return DFSUtil(matrix,visited,rcolor,pixel_r,pixel_c);
    }

    public static void main(String[] args) {
        char[][] input = {{'B','B','W'},{'W','W','W'},{'W','W','W'},{'B','B','B'}};
        DFS(input,'G',2,2);
        Arrays.stream(input)
                .map(color -> String.join(" " ,new String(color)))
                .forEach(System.out::println);
    }
}
