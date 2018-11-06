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


*/


import java.util.Arrays;
import java.util.List;

public class Prob113_ReverseWordInString {



    /*

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
        System.out.println(reverseWordsInString("hello world here"));
    }
}
