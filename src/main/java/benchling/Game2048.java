package benchling;

import java.util.Arrays;

public class Game2048 {

    static boolean is2048Found = false;

    static void moveRight(int[][] grid) {
        for (int r = grid.length - 1; r >= 0; r--) {
            for (int c = grid.length - 1; c >= 0; c--) {
                if (c > 0 && grid[r][c] == grid[r][c - 1]) {
                    grid[r][c] = grid[r][c] * 2;
                    if(grid[r][c]==2048){
                        is2048Found=true;
                    }
                    grid[r][c - 1] = 0;
                }
            }
            int index = grid.length;
            for (int c = grid.length - 1; c >= 0; c--) {
                if (grid[r][c] != 0 && index != grid.length) {
                    grid[r][index] = grid[r][c];
                    grid[r][c] = 0;
                    index--;
                }
                if (grid[r][c] == 0) {
                    index = c;
                }
            }
        }
    }

    static void moveLeft(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (j < grid.length - 1 && grid[i][j] == grid[i][j + 1]) {
                    grid[i][j] = grid[i][j] * 2;
                    if(grid[i][j]==2048){
                        is2048Found=true;
                    }
                    grid[i][j + 1] = 0;
                }
            }
            int index = -1;
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] != 0 && index != -1) {
                    grid[i][index] = grid[i][j];
                    grid[i][j] = 0;
                    index++;
                }
                if (grid[i][j] == 0) {
                    index = j;
                }
            }
        }
    }

    static void moveDown(int[][] grid) {
        for (int j = grid.length - 1; j >= 0; j--) {
            for (int i = grid.length - 1; i >= 0; i--) {
                if (i > 0 && grid[i][j] == grid[i - 1][j]) {
                    grid[i][j] = grid[i][j] * 2;
                    if(grid[i][j]==2048){
                        is2048Found=true;
                    }
                    grid[i - 1][j] = 0;
                }
            }
            int index = grid.length;
            for (int i = grid.length - 1; i >= 0; i--) {
                if (grid[i][j] != 0 && index != grid.length) {
                    grid[index][j] = grid[i][j];
                    grid[i][j] = 0;
                    index--;
                }
                if (grid[i][j] == 0) {
                    index = i;
                }
            }
        }

    }

    static void moveUp(int[][] grid) {
        for (int j = 0; j < grid.length; j++) {
            for (int i = 0; i < grid.length; i++) {
                if (i < grid.length - 1 && grid[i][j] == grid[i + 1][j]) {
                    grid[i][j] = grid[i][j] * 2;
                    if(grid[i][j]==2048){
                        is2048Found=true;
                    }
                    grid[i + 1][j] = 0;
                }
            }
            int index = -1;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] != 0 && index != grid.length) {
                    grid[index][j] = grid[i][j];
                    grid[i][j] = 0;
                    index++;
                }
                if (grid[i][j] == 0) {
                    index = i;
                }
            }
        }
    }

    static int[][] game2048(int[][] grid, String path) {
        int[][] res = new int[grid.length][grid[0].length];

        for (int k = 0; k < path.length(); k++) {
            if (!is2048Found) {
                char c = path.charAt(k);
                if (c == 'R') {
                    moveRight(grid);
                }
                if (c == 'L') {
                    moveLeft(grid);
                }
                if (c == 'D') {
                    moveDown(grid);
                }
                if (c == 'U') {
                    moveUp(grid);
                }
            }else{
                return grid;
            }
        }
        return grid;
    }

    public static void main(String[] args) {

        int[][] grid = new int[4][4];
        grid[0][0] = 0;
        grid[0][1] = 0;
        grid[0][2] = 0;
        grid[0][3] = 0;

        grid[1][0] = 0;
        grid[1][1] = 0;
        grid[1][2] = 2;
        grid[1][3] = 2;

        grid[2][0] = 0;
        grid[2][1] = 0;
        grid[2][2] = 2;
        grid[2][3] = 1024;

        grid[3][0] = 2;
        grid[3][1] = 2;
        grid[3][2] = 4;
        grid[3][3] = 1024;

        for (int r = 0; r < 4; r++) {
            System.out.println(Arrays.toString(grid[r]));
        }

        game2048(grid, "R");

        System.out.println("R Output :");
        for (int r = 0; r < 4; r++) {
            System.out.println(Arrays.toString(grid[r]));
        }

        game2048(grid, "U");

        System.out.println("U Output :");
        for (int r = 0; r < 4; r++) {
            System.out.println(Arrays.toString(grid[r]));
        }

        game2048(grid, "U");

        System.out.println("U Output :");
        for (int r = 0; r < 4; r++) {
            System.out.println(Arrays.toString(grid[r]));
        }

    }
}
