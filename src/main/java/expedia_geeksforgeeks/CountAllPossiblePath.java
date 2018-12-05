package expedia_geeksforgeeks;

/**
 * Count all possible paths from top left to bottom right of a mXn matrix
 * The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints
 * that from each cell you can either move only to right or down
 * Link : https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/
 */
public class CountAllPossiblePath {

//    static int numberofPaths(int sx,int sy,int dx, int dy){
//        if(sx == dx || sy == dy){
//            return 1;
//        }
//        return numberofPaths(sx-1,sy,dx,dy)+numberofPaths(sx,sy-1,dx,dy);
//    }

    static int numberOfPaths(int m, int n)
    {
        // If either given row number is first or
        // given column number is first
        if (m == 5 || n == 5)
            return 1;

        // If diagonal movements are allowed then
        // the last addition is required.
        return numberOfPaths(m+1, n) + numberOfPaths(m, n+1);
        // + numberOfPaths(m-1,n-1);
    }

    public static void main(String args[]){
//        System.out.println(numberofPaths(1,1,5,5));
        System.out.println(numberOfPaths(1,1));
    }
}
