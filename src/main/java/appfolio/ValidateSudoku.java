package appfolio;
import java.util.HashSet;

/**
 * 36. Valid Sudoku
 * Link : https://leetcode.com/problems/valid-sudoku/description/
 *
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *
 * A partially filled sudoku which is valid.
 *
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * Example 1:
 *
 * Input:
 * [
 *   ["5","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: true
 * Example 2:
 *
 * Input:
 * [
 *   ["8","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being
 *     modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * The given board contain only digits 1-9 and the character '.'.
 * The given board size is always 9x9.
 *
 */

public class ValidateSudoku {

    private static boolean validateSudoku(char[][] board){
        for(int row = 0 ; row < 9 ; row++){

            HashSet<Character> row_values = new HashSet<>();
            HashSet<Character> col_values = new HashSet<>();
            HashSet<Character> cube_values = new HashSet<>();

            for(int col = 0; col < 9 ;col++){
                //check for duplicates in current row
                if(board[row][col] != '.' && !row_values.add(board[row][col])){
                    return false;
                }
                //check for duplicates in current col
                if(board[col][row] != '.' && !col_values.add(board[col][row])){
                    return false;
                }
                //check for duplicates in current cube
                int rowIndex = 3 * (row / 3);
                int colIndex = 3 * (row % 3);
                if(board[rowIndex+col/3][colIndex+col%3]!='.' && !cube_values.add(board[rowIndex+col/3][colIndex+col%3])){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Validate Sudoku");
    }
}
