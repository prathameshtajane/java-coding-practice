package daily_coding_challenges;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This problem was asked by Facebook.
 *
 * Given an array of integers in which two elements appear exactly once and all other elements appear exactly twice, find the two elements that appear only once.
 *
 * For example, given the array [2, 4, 6, 8, 10, 2, 6, 10], return 4 and 8. The order does not matter.
 *
 * Follow-up: Can you do this in linear time and constant space?
 */
public class Prob140_Find_Non_Duplicate_In_Array {

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     */
    private static Set<Integer> getNonDuplicatesFromArray(int[] input){
        Set<Integer> op_set = new HashSet<>();
        Set<Integer> input_set = new HashSet<>();

        for(int i=0; i<input.length; i++){
            if(input_set.add(input[i])){
                input_set.add(input[i]);
                op_set.add(input[i]);
            }else{
                op_set.remove(input[i]);
            }
        }
        return op_set;
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(getNonDuplicatesFromArray(new int[]{2, 4, 6, 8, 10, 2, 6, 10}).toArray()));
            System.out.println(Arrays.toString(getNonDuplicatesFromArray(new int[]{2, 4, 6, 8, 10, 2, 6, 10,4,8}).toArray()));
    }
}
