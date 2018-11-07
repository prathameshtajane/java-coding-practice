package daily_coding_challenges;

/*
    This problem was asked by Facebook.

    Given a string and a set of delimiters, reverse the words in the string while maintaining the relative order of
    the delimiters. For example, given "hello/world:here", return "here/world:hello"

    Follow-up: Does your solution work for the following cases: "hello/world:here/", "hello//world:here"
 */


import java.util.ArrayList;
import java.util.List;

public class Prob114_ReverseSentenceWithoutDelimiters {


    private static void reversCharList(List<Character> input_char_list){
        for(int i = 0 ; i<(int) (Math.floor(input_char_list.size())/2.0) ; i++){
            Character temp_char = input_char_list.get(i);
            input_char_list.set(i,input_char_list.get(input_char_list.size()-1-i));
            input_char_list.set(input_char_list.size()-1-i,temp_char);
        }
    }

    private static String reverseSentenceWithoutDelimiters(String input_string){
        List<Character> temp_char_list = new ArrayList<>();

        for(int i = 0; i < input_string.length(); i++){
            if(input_string.charAt(i) >= 'a' && input_string.charAt(i) <= 'z' ||
                    input_string.charAt(i) >= 'A' && input_string.charAt(i) <= 'Z'){
                temp_char_list.add(input_string.charAt(i));
            }
        }
        reversCharList(temp_char_list);
        char[] input_string_char_arr = input_string.toCharArray();
        int temp_char_list_index = 0;

        for(int i = 0; i < input_string.length(); i++){
            if(input_string.charAt(i) >= 'a' && input_string.charAt(i) <= 'z' ||
                    input_string.charAt(i) >= 'A' && input_string.charAt(i) <= 'Z'){
                input_string_char_arr[i]=temp_char_list.get(temp_char_list_index++);
            }
        }

        return new String(input_string_char_arr);
    }

    public static void main(String[] args) {
        System.out.println("Prob114_ReverseSentenceWithoutDelimiters");
        System.out.println(reverseSentenceWithoutDelimiters("hello//world:here"));
    }
}
