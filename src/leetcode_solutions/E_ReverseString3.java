package leetcode_solutions;

/**
 *
 * 557. Reverse Words in a String III
 *
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 *
 * Link : https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *
 * Algorithm :
 *
 * Time Complexity : O(n)
 * Space Complexity :O(1)
 *
 */
public class E_ReverseString3 {

    private static void reverseWord(StringBuffer input_string,int start_index,int end_index){
        int temp_end_index = end_index;
        for(int i = start_index ; i < (start_index+end_index+1)/2 ; i++){
            char temp_char = input_string.charAt(i);
            input_string.setCharAt(i,input_string.charAt(temp_end_index));
            input_string.setCharAt(temp_end_index,temp_char);
            --temp_end_index;
        }
    }

    private static String getReverseString(String input_string){
        StringBuffer sb = new StringBuffer();
        sb.append(input_string);
        int curr_word_start_index = 0;
        for(int i = 0 ; i < input_string.length() ; i++){
            if(input_string.charAt(i)==' '){
                reverseWord(sb,curr_word_start_index,i-1);
                curr_word_start_index=i+1;
            }
            if(i == sb.length()-1){
                reverseWord(sb,curr_word_start_index,i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("557. Reverse Words in a String III");
        System.out.println(getReverseString("Let's take LeetCode contest"));
        System.out.println(getReverseString("Let's"));
    }
}
