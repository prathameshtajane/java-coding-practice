package leetcode_solutions.google;

/**

 Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

 A region is captured by flipping all 'O's into 'X's in that surrounded region.

 Example:

 X X X X
 X O O X
 X X O X
 X O X X

 After running your function, the board should be:

 X X X X
 X X X X
 X X X X
 X O X X

 Explanation:

 Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are not flipped to 'X'.
 Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'.
 Two cells are connected if they are adjacent cells connected horizontally or vertically.

 */
public class M_Surrounded_Regions {

    char[][] board;

    M_Surrounded_Regions(char[][] board){
        this.board=board;
    }

    public boolean isOnBorder(int r,int c){
        if( r < 1 || r >= board.length-1){
            return true;
        }else if(c < 1 || c >= board[0].length-1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isConnectedZeroOnBorder(int r, int c){
        int[][] borderIndex = {{-1,0},{0,1},{1,0},{0,-1}};
        int[][] checkBorderIndex= new int[4][2];

        for(int i=0; i< borderIndex.length;i++){
            checkBorderIndex[i][0]=r+borderIndex[i][0];
            checkBorderIndex[i][1]=c+borderIndex[i][1];
        }

        boolean isConnectedZeroOnBorder = false;

        for(int i=0; i< borderIndex.length;i++){
            if(isOnBorder(checkBorderIndex[i][0],checkBorderIndex[i][1])){
                if(board[checkBorderIndex[i][0]][checkBorderIndex[i][1]] == '0'){
                    isConnectedZeroOnBorder = isConnectedZeroOnBorder || true;
                    return isConnectedZeroOnBorder;
                }
            }
        }

        return isConnectedZeroOnBorder;
    }

    public void solve(char[][] board) {
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='0'){
                if(isOnBorder(r,c)){
                    continue;
                }else{
                    if(!isConnectedZeroOnBorder(r,c)){
                        board[r][c]='X';
                    }
                }
                }
            }
        }
    }

    public static void main(String args[]){
        System.out.println("Surrounded Regions");
        char[][] board = {
                {'X', '0'},
                {'X', '0'}
        };
        M_Surrounded_Regions msurReg = new M_Surrounded_Regions(board);
        msurReg.solve(board);

    }
}
