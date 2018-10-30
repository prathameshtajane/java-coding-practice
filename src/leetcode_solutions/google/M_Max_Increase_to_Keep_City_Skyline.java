package leetcode_solutions.google;

/*

807. Max Increase to Keep City Skyline

In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). Height 0 is considered to be a building as well.

At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.

What is the maximum total sum that the height of the buildings can be increased?

Example:
Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
Output: 35
Explanation:
The grid is:
[ [3, 0, 8, 4],
  [2, 4, 5, 7],
  [9, 2, 6, 3],
  [0, 3, 1, 0] ]

The skyline viewed from top or bottom is: [9, 4, 8, 7]
The skyline viewed from left or right is: [8, 7, 9, 3]

The grid after increasing the height of buildings without affecting skylines is:

gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
            [3, 3, 3, 3] ]

Notes:

1 < grid.length = grid[0].length <= 50.
All heights grid[i][j] are in the range [0, 100].
All buildings in grid[i][j] occupy the entire grid cell: that is, they are a 1 x 1 x grid[i][j] rectangular prism.

Link : https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/


Algorithm :
			Top

		3, 0, 8, 4
Left	2, 4, 5, 7     Right
		9, 2, 6, 3
		0, 3, 1, 0

		  Bottom



gridNew
		8, 4, 8, 7
        7, 4, 7, 7
        9, 4, 8, 7
        3, 3, 3, 3

Top - Bottom  9 4 5 7
Left - Right  8 7 9 3


forEach r,c in mat[][]
	min(max(r),max(c)) for each mat[r][c]


min(8,9) 	min(8,4) 	8 	    	min(8,7)
min(7,9)    min(7,4)	min(7,8)	min(7,7)
9			min(9,4)    min(9,8)    min(9,7)
min(3,9)    min(3,4)    min(3,8)    min(3,7)


*/

import java.util.HashMap;


public class M_Max_Increase_to_Keep_City_Skyline {


    public HashMap<String,Integer> MaxRowMaxColmap = new HashMap<>();


    public void populateMap(int[][] matrix){
        //Max by Row
        for(int r = 0 ;r < matrix.length ;r ++){
            int maxInCurrRow = matrix[r][0];
            for(int i = 0 ;i<matrix[r].length;i++){
                if(maxInCurrRow < matrix[r][i]){
                    maxInCurrRow = matrix[r][i];
                }
            }
            MaxRowMaxColmap.put("row"+r,maxInCurrRow);
        }

        //Max by Col
        for(int c = 0 ;c < matrix[0].length ;c ++){
            int maxInCurrCol = matrix[0][c];
            for(int i = 0;i<matrix[0].length;i++){
                if(maxInCurrCol < matrix[i][c]){
                    maxInCurrCol = matrix[i][c];
                }
            }
            MaxRowMaxColmap.put("col"+c,maxInCurrCol);
        }
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int maxSum = 0;
        populateMap(grid);
        for(int r = 0 ; r < grid.length ; r++){
            for(int c = 0 ; c < grid[0].length;c++){
                maxSum += Math.min(MaxRowMaxColmap.get("row"+r),MaxRowMaxColmap.get("col"+c)) - grid[r][c];
            }
        }
        return maxSum;
    }

    public static void main(String args[]){
        System.out.println("M_Max_Increase_to_Keep_City_Skyline");
        M_Max_Increase_to_Keep_City_Skyline maxSkyLine = new M_Max_Increase_to_Keep_City_Skyline();
        int[][] inputGrid = {{3, 0, 8, 4},{2, 4, 5, 7},{9, 2, 6, 3},{0, 3, 1, 0}};
        System.out.println(maxSkyLine.maxIncreaseKeepingSkyline(inputGrid));
    }
}
