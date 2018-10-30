package leetcode_solutions;

/**
 * Reverse bits of a given 32 bits unsigned integer.

 Example:

 Input: 43261596
 Output: 964176192
 Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
 return 964176192 represented in binary as 00111001011110000010100101000000.

 Follow up:
 If this function is called many times, how would you optimize it?

 Link :  https://leetcode.com/problems/reverse-bits/description/
 */
public class Reverse_Bits {

    static String convertDecimalToInvertedBinary(int n){
        char[] binaryValue = new char[32];
        int i=0;
        while(n>0){
            binaryValue[i]= (char) (n%2+'0');
            n=n/2;
            i+=1;
        }
        while(i<32){
            binaryValue[i]='0';
            i++;
        }
        return new String(binaryValue);

    }

    static int reverseBits(int n) {
        return Integer.parseInt(convertDecimalToInvertedBinary(n),2);
    }

    public static void main(String args[]){
        System.out.println("Reverse_Bits");
        System.out.println(Reverse_Bits.reverseBits(43261596));
    }
}
