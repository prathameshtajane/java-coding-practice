package leetcode_solutions.google;


/*

    66. Plus One

    Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

    The digits are stored such that the most significant digit is at the head of the list,
    and each element in the array contain a single digit.

    You may assume the integer does not contain any leading zero, except the number 0 itself.

    Example 1:

    Input: [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Example 2:

    Input: [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.


    Link : https://leetcode.com/problems/plus-one/description/


    different Solution :

    public int[] plusOne(int[] digits) {

    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }

        digits[i] = 0;
    }

    int[] newNumber = new int [n+1];
    newNumber[0] = 1;

    return newNumber;
    }


 */

import java.util.Arrays;

public class E_Plus_One {

    public int[] plusOne(int[] digits) {
        int carry = 0;
        if(digits[digits.length-1]+1 >= 10){
            digits[digits.length-1]=0;
            carry = 1;
        }else{
            digits[digits.length-1]=digits[digits.length-1]+1;
        }

        for(int i = digits.length-2;i >=0 ; i--){
            if(digits[i]+carry >= 10){
                digits[i] = (digits[i]+carry)%10;
                carry = 1;
            }else{
                digits[i] = digits[i]+carry;
                carry = 0; //resetting carry to 0 for next sum
            }
        }

        if(carry == 1 ){
            int[] finalArray = new int[digits.length+1];
            finalArray[0]=1;
            for(int i = 0 ; i<digits.length;i++){
                finalArray[i+1]=digits[i];
            }
            return finalArray;
        }else{
            return digits;
        }
    }

    public static void main(String args[]){
        System.out.println("E_Plus_One");
        E_Plus_One p1 = new E_Plus_One();
//        int[] input1 = {1,2,3};
//        int[] input1 = {9,9,9};
        int[] input1 = {9};
        System.out.println(Arrays.toString(p1.plusOne(input1)));
    }
}
