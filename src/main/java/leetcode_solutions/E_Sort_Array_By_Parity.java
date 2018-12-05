package leetcode_solutions;


import java.util.Arrays;
import java.util.LinkedList;

/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 *
 * Note:
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 *
 * Link : https://leetcode.com/problems/sort-array-by-parity/
 */

public class E_Sort_Array_By_Parity {

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    private static int[] sortArrayByParityInPlace(int[] A) {
        for (int i = 0, j = 0; j < A.length; j++)
            if (A[j] % 2 == 0) {
                int tmp = A[i];
                A[i++] = A[j];
                A[j] = tmp;;
            }
        return A;
    }

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     */
    private static int[] sortArrayByParity(int[] A) {
        LinkedList<Integer> sorted_parity_list = new LinkedList<Integer>();
        int[] op_arr=new int[A.length];
        for(int num : A){
            if(num % 2 == 0){
                sorted_parity_list.addFirst(num);
            }else{
                sorted_parity_list.addLast(num);
            }
        }
        for(int i = 0; i < op_arr.length ; i++){
            op_arr[i]=sorted_parity_list.get(i);
        }
        return op_arr;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(sortArrayByParityInPlace(input)));
    }
}
