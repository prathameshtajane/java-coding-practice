package leetcode_solutions;

/**
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 * Link : https://leetcode.com/problems/palindrome-number/description/
 */
public class PalindromeNumber {

    public static boolean evenNumPalidrome(int x){
        int count = Integer.toString(x).length()%2;
        boolean isPalindrome = false;
        for(int i = 0;i<=Integer.toString(x).length()-1;i++){
            if(Integer.toString(x).charAt(i) == Integer.toString(x).charAt(Integer.toString(x).length()-1-i)){
                isPalindrome = true;
            }else{
                isPalindrome = false;
                return isPalindrome;
            }
        }
        return isPalindrome;
    }

    public static boolean oddNumPalidrome(int x){
        int count = Integer.toString(x).length()%2;
        boolean isPalindrome = false;
        for(int i = 0;i<=Integer.toString(x).length()-1;i++){
            if(Integer.toString(x).charAt(i) == Integer.toString(x).charAt(Integer.toString(x).length()-1-i)){
                isPalindrome = true;
            }else{
                isPalindrome = false;
                return isPalindrome;
            }
        }
        return isPalindrome;
    }

    public static boolean isPalindrome(int x) {

        if(Integer.toString(Math.abs(x)).length()%2==0){
            return evenNumPalidrome(Math.abs(x));
        }
        return oddNumPalidrome(Math.abs(x));
    }
    public static void main(String args[]){
        System.out.println(isPalindrome(-010));
    }
}
