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

 */

public class Prob109_SwapEvenOddBits {

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
    }
}
