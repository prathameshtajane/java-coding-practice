package leetcode_solutions;


/*
    191. Number of 1 Bits

    Write a function that takes an unsigned integer and returns the number of '1' bits
    it has (also known as the Hamming weight).

    Example 1:

    Input: 11
    Output: 3
    Explanation: Integer 11 has binary representation 00000000000000000000000000001011
    Example 2:

    Input: 128
    Output: 1
    Explanation: Integer 128 has binary representation 00000000000000000000000010000000

    Link : https://leetcode.com/problems/number-of-1-bits/description/

    Algorithm :
    Iterate over input 'n' and use right shift ( >> ) bitwise operation to increment count of 1.
 */

public class E_Number_of_1_Bits {

    // you need to treat n as an unsigned value
    private static int hammingWeight(int n) {
        int bitCount = 0;
        for(int i = 0;i<32;i++){
            bitCount += (n >> i)&1;
        }
        return bitCount;
    }

    public static void main(String args[]){
        System.out.println("191. Number of 1 Bits");
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(128));
    }
}
