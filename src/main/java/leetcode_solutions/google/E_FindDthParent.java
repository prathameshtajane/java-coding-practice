package leetcode_solutions.google;

import java.util.Arrays;
import java.util.HashMap;

public class E_FindDthParent {

    public int[] solution(int D , int[] A){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] output = new int[A.length];

        for(int i=0; i<A.length;i++){
            map.put(i,A[i]);
        }

        for(int i=0; i<A.length;i++){
            int tempPointer = A[i];
            for(int j = 0;j<D-1;j++){
                try {
                    tempPointer = map.get(tempPointer);
                }catch(Exception e){
                    output[i]= -1;
                    break;
                }
            }
            output[i]=tempPointer;
        }
        return output;
    }

    public static void main(String args[]){
        System.out.println("E_FindDthParent");
        E_FindDthParent findDthParent = new E_FindDthParent();
        int D = 6;
        int[] input = {-1,0,4,2,1};
        //System.out.println(Arrays.toString(findDthParent.solution(D,input)));

        //System.out.println(Arrays.toString(findDthParent.solution(3, new int[]{-1, 0, 4, 2, 1})));
        //System.out.println(Arrays.toString(findDthParent.solution(2, new int[]{-1, 0, 1, 2, 3})));
        System.out.println(Arrays.toString(findDthParent.solution(3, new int[]{-1, 0, 5, 2, 1})));







    }
}
