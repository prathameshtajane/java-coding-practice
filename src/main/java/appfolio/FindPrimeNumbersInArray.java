package appfolio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Given an array of integer, find all the prime number in this array.
 *
 *  Algorithm :
 *
 *  Time complexity : O(n^2)
 */

public class FindPrimeNumbersInArray {

    private static boolean isPrimeNumberUtil(int num){
        if(num == 2){
            return true;
        }
        if(num % 2 == 0 )
            return false;

        for(int i = 2;i*i < num ;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    private static List<Integer> findAllPrimeNumber(List<Integer> input_list){
        List<Integer> op_list = new ArrayList<>();
        for(Integer num : input_list){
            if(isPrimeNumberUtil(num)){
                op_list.add(num);
            }
        }
        return op_list;
    }

    public static void main(String[] args) {
        System.out.println("Find all prime numbers from given array");
        Integer[] input_arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(findAllPrimeNumber(Arrays.asList(input_arr)).toArray()));
    }
}
