package daily_coding_challenges;

/*
    This problem was asked by Pinterest.

    Given an integer list where each number represents the number of hops you can make,
    determine whether you can reach to the last index starting at index 0.

    For example, [2, 0, 1, 0] returns true while [1, 1, 0, 1] returns false.
*/

public class Prob106_ReachEndWithHop {

    public static boolean canReachArrayEnd(int[] input_array){

        int i = 0;
        while(i <= input_array.length-1 && input_array[i] != 0){
            i+=input_array[i];
        }
        return (i==(input_array.length-1));
    }

    public static void main(String args[]){
        System.out.println("Prob106_ReachEndWithHop");
        System.out.println(canReachArrayEnd(new int[]{2,0,1,0}));
        System.out.println(canReachArrayEnd(new int[]{1,1,0,1}));
        System.out.println(canReachArrayEnd(new int[]{0}));
        System.out.println(canReachArrayEnd(new int[]{1}));
        System.out.println(canReachArrayEnd(new int[]{1,2}));
        System.out.println(canReachArrayEnd(new int[]{1,2}));

//        System.out.println(canReachArrayEnd(new int[]{2,3,1,1,4}));
//        System.out.println(canReachArrayEnd(new int[]{3,2,1,0,4}));

    }
}
