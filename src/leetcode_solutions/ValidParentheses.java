package leetcode_solutions;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * Link : https://leetcode.com/problems/valid-parentheses/description/
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> parathesisStack = new Stack<>();
        char[] charArray = s.toCharArray();
        for(char eachChar : charArray){
            if(eachChar == '{' || eachChar == '(' || eachChar == '['){
                parathesisStack.push(eachChar);
            }
            if(eachChar == '}' || eachChar == ')' || eachChar == ']'){
                if(!parathesisStack.empty()){
                char tempChar = parathesisStack.pop();
                if(eachChar == '}' && tempChar != '{'){
                    return false;
                }
                if(eachChar == ')' && tempChar != '('){
                    return false;
                }
                if(eachChar == ']' && tempChar != '['){
                    return false;
                }
                }else{
                    return false;
                }
            }
        }
        return parathesisStack.empty();
    }

    public static void main(String args[]){
        System.out.println(isValid("["));
    }
}
