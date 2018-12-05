package daily_coding_challenges;

/**
 *
     This problem was asked by Google.

     Find the minimum number of coins required to make n cents.

     You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.

     For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a 1¢.
 */

public class Prob138_Min_Number_Of_Coins {

    private static int getMinNumberCoinsRequired(int n,int[] denominations){
        int row_count = denominations.length+1;
        int col_count = n+1;
        int[][] board = new int[row_count][col_count];
        for(int row = 1 ; row < row_count ; row++){
            for(int col = 1 ; col < col_count ; col++){
                if(denominations[row-1] <= col){
                    board[row][col] = 1 + board[row-1][col-denominations[row-1]];
                }else{
                    board[row][col] = board[row-1][col];
                }
            }
        }
        return board[row_count-1][col_count-1];
    }

    public static void main(String[] args) {
        System.out.println(getMinNumberCoinsRequired(16,new int[]{1,5,10,25}));
    }
}
