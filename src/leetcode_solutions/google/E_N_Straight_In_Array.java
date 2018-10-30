package leetcode_solutions.google;

public class E_N_Straight_In_Array {

    public static boolean nStraightInArray(int[] inputArray,int n ){
        if(inputArray.length < n || inputArray.length%n != 0){
            return false;
        }

        for(int i=0;i<inputArray.length-1;i++){
            if(inputArray[i+1]-inputArray[i]==1){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println("E_N_Straight_In_Array");
        System.out.println(nStraightInArray(new int[]{1,2,3},3));
        System.out.println(nStraightInArray(new int[]{1,2,4},3));
        System.out.println(nStraightInArray(new int[]{1,2,3,4,5,6},3));

    }
}
