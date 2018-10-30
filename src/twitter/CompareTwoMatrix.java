package twitter;

import java.util.Arrays;

/**
 * Created by prathamesh on 8/23/18.
 */
public class CompareTwoMatrix {

    boolean isSameMatrix(int[][] src,int[][] dest){
        if(src == null){
            return (dest == null);
        }
        if(dest == null){
            return (src == null);
        }

        if(src.length != dest.length || src[0].length != dest[0].length){
            return false;
        }

        for(int i=0;i<src.length;i++){
            if(!Arrays.equals(src[i],dest[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println("CompareTwoMatrix");
        int[][] a1 = {{1, 2}, {5, 19}, {289, 100}};
        int[][] a2 = {{1, 2, 3}, {5, 19, 56}, {289, 100, 30}};
        CompareTwoMatrix m= new CompareTwoMatrix();
        System.out.println(m.isSameMatrix(a1,a2));
    }
}
