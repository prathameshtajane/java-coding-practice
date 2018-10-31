package daily_coding_challenges;

/*
    This problem was asked by Google.
    Given two strings A and B, return whether or not A can be shifted some number of times to get B.
    For example, if A is abcde and B is cdeab, return true. If A is abc and B is acb, return false.

    Algorithm :
    step 1 - concat source string with source string again
    step 2 - check whether target string contains in new concated source string

    Time complexity - O(n)
 */
public class Prob108_String_Shift {

    private static boolean substringShift(String str_src,String str_trgt){
        String temp_string = str_src+str_src;
        return temp_string.contains(str_trgt);
    }

    public static void main(String args[]){
        System.out.println("Prob108_String_Shift");
        System.out.println(substringShift("abcde","cdeab"));
        System.out.println(substringShift("abc","acb"));
        System.out.println(substringShift("abc","cab"));
    }
}
