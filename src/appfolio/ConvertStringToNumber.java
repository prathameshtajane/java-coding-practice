package appfolio;

/*
   Convert String to a number without using parseInt function in Java

   Algorithm :

   Time Complexity = O(length of input string)

   step 1 :
   Make us of type casting from ASCII to Integers
   ASCII value of 0 is 48
*/

public class ConvertStringToNumber {

    private static final int ASCII_ZERO_VALUE = 48;

    private static int convertStringToInt(String input_string){
        char[] input_char_array = input_string.toCharArray();
        int power = 0;
        int op_number = 0;
        boolean isNeg = false;
        for(int i = input_char_array.length-1; i>=0; i--){
            if(input_char_array[i]== '-'){
                isNeg = true;
                continue;
            }
            op_number += (int)Math.pow(10,power++)*((int)input_char_array[i]-ASCII_ZERO_VALUE);
        }

        if(isNeg){
            return 0-op_number;
        }
        return op_number;
    }

    public static void main(String[] args) {
        System.out.println("Convert String to a number without using parseInt function in Java");
        System.out.println(convertStringToInt("12345678"));
        System.out.println(convertStringToInt("1000"));
        System.out.println(convertStringToInt("-1000"));
    }
}
