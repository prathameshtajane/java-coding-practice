import java.util.ArrayList;

/**
 * Created by prathamesh on 5/20/17.
 *
 * Given a string, you need to reverse the order of characters in each word within a
 * sentence while still preserving whitespace and initial word order.
 *
 * Example:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 *
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 *
 * Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/#/description
 */
public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {

        String wordlist[]=s.split(" ");
        int numSpaces=wordlist.length-1;
        StringBuffer result=new StringBuffer();
        for(int i=0;i<wordlist.length;i++){
            wordlist[i]=new StringBuffer(wordlist[i]).reverse().toString();
            result.append(wordlist[i]);
            if(numSpaces>0){
                result.append(" ");
                numSpaces--;
            }
        }
        return String.valueOf(result);
    }
    public static void main(String args[]){
        String s="Let's take LeetCode contest";

        System.out.print(reverseWords(s));

    }
}
