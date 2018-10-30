package leetcode_solutions;

import java.util.Arrays;

/**
 * 66. Plus One
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 * Link : https://leetcode.com/problems/plus-one/description/
 *
 *
 * Algorithm :
 *
 *  public int[] plusOne(int[] digits) {
 *
 *     int n = digits.length;
 *     for(int i=n-1; i>=0; i--) {
 *         if(digits[i] < 9) {
 *             digits[i]++;
 *             return digits;
 *         }
 *
 *         digits[i] = 0;
 *     }
 *
 *     int[] newNumber = new int [n+1];
 *     newNumber[0] = 1;
 *
 *     return newNumber;
 * }
 *
 */
public class PlusOne {


    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1] > 0){
            digits[digits.length-1]=digits[digits.length-1]-1;
        }else{

        }
        return digits;
    }

    public static void main(String args[]){
        int[] arr = {3,2,0,0};
        int[] outputArr=PlusOne.plusOne(arr);
        System.out.println(Arrays.toString(outputArr));
    }
}
