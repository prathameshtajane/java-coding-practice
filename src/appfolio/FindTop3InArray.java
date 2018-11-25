package appfolio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find top 3 elements in array in Time complexity O(n) and Space Complexity as O(1)
 */

public class FindTop3InArray {


    private static List<Integer> getTop3ElementInArray(List<Integer> input_list){
        //base case
        if(input_list.size() < 3){
            return null;
        }
        int first= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int curr : input_list){
            if(curr > first){
                third = second;
                second = first;
                first=curr;
            }else if(curr > second){
                third=second;
                second = curr;
            }else if(curr > third){
                third = curr;
            }
        }
        List<Integer> op_list = new ArrayList<>();
        op_list.add(first);
        op_list.add(second);
        op_list.add(third);
        return op_list;
    }

    public static void main(String[] args) {
        System.out.println("Find top 3 elements in array in Time complexity O(n) and Space Complexity as O(1)");
        System.out.println(Arrays.toString(getTop3ElementInArray(Arrays.asList(new Integer[]{1,2,3,4,5,6,7})).toArray()));
    }
}
