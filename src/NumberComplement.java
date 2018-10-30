/**
 Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

 Example 1:
 Input: 5
 Output: 2
 Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

 Example 2:
 Input: 1
 Output: 0
 Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 */


public class NumberComplement {

    public static int findComplement(int num) {
        String binaryString=Integer.toString(num,2);
        System.out.println(binaryString);
        double comNum=0;

        for(int i=binaryString.length()-1,exponent=0;i>=0;i--,exponent++){
            System.out.println(i);
            System.out.println(comNum);
            if(binaryString.charAt(i)!='1'){
                comNum=comNum+Math.pow(2,exponent);
                System.out.println(comNum);
            }
        }

        return (int)comNum;
    }

    public static void main(String args[]){
        System.out.println(findComplement(2));
    }
}
