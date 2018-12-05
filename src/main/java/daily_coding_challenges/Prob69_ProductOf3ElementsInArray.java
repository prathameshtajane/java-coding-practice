package daily_coding_challenges;

import java.util.Arrays;

/**
 *  This problem was asked by Facebook.
    Given a list of integers, return the largest product that can be made by multiplying any three integers.
    For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.
 You can assume the list has at least three integers.
 */

public class Prob69_ProductOf3ElementsInArray {


    public static int findMaxProducts(int[] inputArray){
        Arrays.sort(inputArray);
        return Math.max(inputArray[0]*inputArray[1]*inputArray[inputArray.length-1],
                inputArray[inputArray.length-1]*inputArray[inputArray.length-2]*inputArray[inputArray.length-3]);
    }

    public static void main(String args[]){
        System.out.println("Prob69_ProductOf3ElementsInArray by Facebook");
        int[] inputArray = {1,2,3,4,5,6};
        System.out.println(Prob69_ProductOf3ElementsInArray.findMaxProducts(inputArray));
    }
}
