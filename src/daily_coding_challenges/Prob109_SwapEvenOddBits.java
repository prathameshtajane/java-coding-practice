package daily_coding_challenges;

/*
    This problem was asked by Cisco.

    Given an unsigned 8-bit integer, swap its even and odd bits. The 1st and 2nd bit should be swapped,
    the 3rd and 4th bit should be swapped, and so on.

    For example, 10101010 should be 01010101. 11100010 should be 11010001.

    Bonus: Can you do this in one line?

    Algorithm :

    Time Complexity : O(n)
    step 1 - Iterate over given char array and swap even and odd bits

    Efficient Algorithm :

    Using Bit operations(reference : https://www.geeksforgeeks.org/swap-all-odd-and-even-bits/)

    If we take a closer look at the example, we can observe that we basically need to right shift (>>) all even bits (In the above example, even bits of 23 are highlighted) by 1 so that they become odd bits (highlighted in 43), and left shift (<<) all odd bits by 1 so that they become even bits. The following solution is based on this observation. The solution assumes that input number is stored using 32 bits.

    Let the input number be x
    1) Get all even bits of x by doing bitwise and of x with 0xAAAAAAAA. The number 0xAAAAAAAA is a 32 bit number with all even bits set as 1 and all odd bits as 0.
    2) Get all odd bits of x by doing bitwise and of x with 0x55555555. The number 0x55555555 is a 32 bit number with all odd bits set as 1 and all even bits as 0.
    3) Right shift all even bits.
    4) Left shift all odd bits.
    5) Combine new even and odd bits and return.

 */

public class Prob109_SwapEvenOddBits {

    private static int swapEvenOddBitUsingBitOperations(int num){
        // Get all even bits of x
        int even_bits = num & 0xAAAAAAAA;

        // Get all odd bits of x
        int odd_bits = num & 0x55555555;

        // Right shift even bits
        even_bits >>= 1;

        // Left shift even bits
        odd_bits <<= 1;

        // Combine even and odd bits
        return (even_bits | odd_bits);
    }

    private static void swap(char[] bits,int i,int j){
        char temp = bits[i];
        bits[i]=bits[j];
        bits[j]=temp;
    }

    private static String swapEvenOddBits(String inputBits){
        char[] bits = inputBits.toCharArray();
        for(int i = 0 ;i<bits.length-1;i+=2){
            swap(bits,i,i+1);
        }
        return new String(bits);
    }

    public static void main(String[] args) {
        System.out.println("Prob109_SwapEvenOddBits");
        System.out.println(swapEvenOddBits("10101010"));
        System.out.println(swapEvenOddBits("11100010"));
        System.out.println(swapEvenOddBitUsingBitOperations(43));
    }
}
