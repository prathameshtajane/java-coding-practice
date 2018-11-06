package daily_coding_challenges;

/*

    This problem was asked by Google.

    Given a string of words delimited by spaces, reverse the words in string. For example, given "hello world here",
    return "here world hello"

    Follow-up: given a mutable string representation, can you perform this operation in-place?

    Algorithm :

    Time Complexity : O(n)
    Space Complexity : O(n)

    step 1 - split string into list of String with delimiter as " "
    step 2 - reverse the list
    step 3 = join the list of string into single string with delimiter as " "

    In-place
    Time complexity - O(largest word length * n)
    Space complexity - O(1)

    step 1 - reverse each word of the string buffer
    step 2 - reverse the whole string buffer generated after step 1

*/


import java.util.Arrays;
import java.util.List;

public class Prob113_ReverseWordInString {

    static void  reverseString(StringBuffer input_string,int start_index,int end_index){
        int temp_end_index = end_index;
        for(int i = start_index ; i < (int) Math.ceil((start_index+end_index)/2.0) ; i++){
            char temp_char = input_string.charAt(i);
            input_string.setCharAt(i,input_string.charAt(temp_end_index));
            input_string.setCharAt(temp_end_index,temp_char);
            --temp_end_index;
        }
    }

    /*
        In-place
        Time complexity - O(largest word length * n)
        Space complexity - O(1)

        step 1 - reverse each word in sentence
        step 2 - reverse the sentence create inn step 1
    */
    static String reverseWordsInStringInPlace(StringBuffer input_string){
        int j = -1;
        for(int i = 0; i <input_string.length() ;i++ ){
         if(' ' == input_string.charAt(i)){
             reverseString(input_string,j+1,i-1);
             j=i;
         }
         //for last word
         if(i == input_string.length()-1){
             reverseString(input_string,j+1,i);
         }
        }
        reverseString(input_string,0,input_string.length()-1);
        return input_string.toString();

    }

    /*
        Time complexity - O(n)
        Space complexity - O(n)
     */
    static String reverseWordsInString(String input_string){
        List<String> input_string_list = Arrays.asList(input_string.split("\\s+"));

        for(int i = 0 ; i < input_string_list.size()/2 ; i++){
            String temp_string = input_string_list.get(i);
            input_string_list.set(i,input_string_list.get(input_string_list.size()-1-i));
            input_string_list.set(input_string_list.size()-1-i,temp_string);
        }

        return String.join(" ",input_string_list);
    }

    public static void main(String[] args) {
        StringBuffer input_buffer = new StringBuffer("hello world here");
        System.out.println(reverseWordsInStringInPlace(input_buffer));
    }
}
