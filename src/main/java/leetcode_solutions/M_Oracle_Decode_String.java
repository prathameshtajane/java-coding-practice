package leetcode_solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given an encoded string, return it's decoded string.

 The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

 You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

 Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

 Examples:

 s = "3[a]2[bc]", return "aaabcbc".
 s = "3[a2[c]]", return "accaccacc".
 s = "2[abc]3[cd]ef", return "abcabccdcdcdef".

 Link : https://leetcode.com/problems/decode-string/description/
 */
public class M_Oracle_Decode_String {
    public String decodeString(String s) {
        Deque<Character> deque = new ArrayDeque();
        StringBuffer outputBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']'){
                StringBuffer tempStringBuffer  = new StringBuffer();
                while (!Character.isDigit(deque.getLast())){
                    tempStringBuffer.append(deque.removeLast());
                }
                int tempCount = Integer.parseInt(deque.removeLast()+"");
                while(tempCount != 0){
                    for(int j = tempStringBuffer.length()-1 ; j >= 0 ; j--){
                        deque.addLast(tempStringBuffer.charAt(j));
                    }
                    --tempCount;
                }
            }else{
                deque.addLast(s.charAt(i));
            }
        }
        while(deque.size()!=0){
            if(deque.getFirst() != '[')
                outputBuffer.append(deque.removeFirst()) ;
            else
                deque.removeFirst();
        }
        return outputBuffer.toString();
    }

}
