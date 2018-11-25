package appfolio;


import java.util.HashSet;

/**
 *  Given a tic-tac-toe game , find a winner.
 */

public class ValidateTicTacToe {

    private static char findTicTacToeWinner(char[][] board){
        for(int row = 0 ; row < board.length ; row++){
            HashSet<Character> row_chars = new HashSet<>();
            HashSet<Character> col_chars = new HashSet<>();
            for(int col = 0; col < board[0].length ; col++){
                row_chars.add(board[row][col]);
                col_chars.add(board[col][row]);
            }
            if(row_chars.size() == 1){
                if(row_chars.contains('X')) return 'X';
                else return 'O';
            }

            if(col_chars.size() == 1){
                if(col_chars.contains('X')) return 'X';
                else return 'O';
            }
        }
        HashSet<Character> diag_chars = new HashSet<>();
        HashSet<Character> back_diag_chars = new HashSet<>();

        for(int i=0; i<board.length; i++){
            diag_chars.add(board[i][i]);
        }

        if(diag_chars.size() == 1){
            if(diag_chars.contains('X')) return 'X';
            else return 'O';
        }

        //check forward diagonal
        for(int i=0; i<board.length; i++){
            back_diag_chars.add(board[i][board.length-i-1]);
        }

        if(back_diag_chars.size() == 1){
            if(back_diag_chars.contains('X')) return 'X';
            else return 'O';
        }
        return 'N';
    }

    public static void main(String[] args) {
        System.out.println("ValidateTicTacToe");
        char[][] board = {{'X','X','O'},{'O','X','X'},{'X','X','O'}};
        System.out.println(findTicTacToeWinner(board));
    }
}
