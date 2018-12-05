package leetcode_solutions;

/**
 Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 To flip an image horizontally means that each row of the image is reversed.
 For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 For example, inverting [0, 1, 1] results in [1, 0, 0].
 */
public class FlippingAnImage {

    public int[][] reverse(int[][] inpmat){
        for(int row=0;row < inpmat.length;row++){
            for(int col=0;col < Math.floor((inpmat[row].length)/2);col++){
                int temp = inpmat[row][col];
                inpmat[row][col]=inpmat[row][inpmat[row].length-1-col];
                inpmat[row][inpmat[row].length-1-col]=temp;
            }
            for(int col=0;col < inpmat[row].length;col++){
                inpmat[row][col] = (inpmat[row][col] == 1)?0:1;
            }
        }
        return inpmat;
    }

    public static void main(String args[]){
        System.out.println("Flipping An Image");
        FlippingAnImage FI = new FlippingAnImage();
        int[][] inputMatrix = {{1,1,0},{1,0,1},{0,0,0}};
        FI.reverse(inputMatrix);
    }
}
