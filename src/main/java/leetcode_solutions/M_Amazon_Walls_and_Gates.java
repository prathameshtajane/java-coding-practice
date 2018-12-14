package leetcode_solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 286. Walls and Gates
 * You are given a m x n 2D grid initialized with these three possible values.
 *
 * -1 - A wall or an obstacle.
 * 0 - A gate.
 *
 * INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume
 * that the distance to a gate is less than 2147483647.
 * Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate,
 * it should be filled with INF.
 *
 * Example:
 *
 * Given the 2D grid:
 *
 * INF  -1  0  INF
 * INF INF INF  -1
 * INF  -1 INF  -1
 *   0  -1 INF INF
 * After running your function, the 2D grid should be:
 *
 *   3  -1   0   1
 *   2   2   1  -1
 *   1  -1   2  -1
 *   0  -1   3   4
 *
 *  Algorithm : Breadth First Search
 */
public class M_Amazon_Walls_and_Gates {

    class Point{
        int x;
        int y;
        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    boolean isSafe(int[][] matrix,int row,int col,boolean[][]visited){
        if(row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || visited[row][col] || matrix[row][col]==2147483647 || matrix[row][col]==-1){
            return false;
        }else{
            return true;
        }
    }

    int getDistancetoClosestGate(int[][] matrix, int row, int col,boolean visited[][]){
        Deque<Point> deque = new ArrayDeque<>();
        deque.offer(new Point(row,col));
        visited[row][col]=true;
        int distance = 0;
        ++distance;
        int[][] dirs = {{0,-1},{-1,0},{0,1},{1,0}};
        while(!deque.isEmpty()){
            Point currPoint = deque.getFirst();
            visited[currPoint.x][currPoint.y]=true;
            if(matrix[row][col]==0){
                break;
            }else{
                for(int[] dir : dirs){
                    if(isSafe(matrix,row+dir[0],col+dir[1],visited)){
                        deque.addLast(new Point(row+dir[0],col+dir[1]));
                    }
                }
            }
        }
        return distance;
    }

    public void wallsAndGates(int[][] rooms) {
        boolean[][] visited = new boolean[rooms.length][rooms[0].length];
        for(int row = 0 ; row < rooms.length ; row++){
            for(int col = 0 ; col < rooms[0].length ; col++){
                if(rooms[row][col] == 1 || rooms[row][col] == 0 || rooms[row][col] == 2147483647){
                    continue;
                }else{
                    rooms[row][col]=getDistancetoClosestGate(rooms,row,col,visited);
                }
            }
        }
    }
}
