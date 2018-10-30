package leetcode_solutions;

/**
 *
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.



 Example 1:

 Input: "Hello"
 Output: "hello"
 Example 2:

 Input: "here"
 Output: "here"
 Example 3:

 Input: "LOVELY"
 Output: "lovely"

 Link : https://leetcode.com/problems/to-lower-case/description/
 */

public class To_Lower_Case {

    static String toLowerCase(String str) {
        StringBuilder opString = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90){
                opString.append((char) ((int)str.charAt(i)+32));
            }else{
                opString.append(str.charAt(i));
            }
        }
        return opString.toString();
    }

    public static void main(String args[]){
        System.out.println("To_Lower_Case");
        System.out.println(To_Lower_Case.toLowerCase(""));
    }
}
