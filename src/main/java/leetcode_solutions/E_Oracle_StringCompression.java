package leetcode_solutions;

import java.util.ArrayDeque;
import java.util.Deque;

public class E_Oracle_StringCompression {
    String getCompressesdString(String input){

        if(input.length() < 2){
            return input;
        }

        if(input.length() == 2){
            if(input.charAt(0) == input.charAt(1)){
                return input.charAt(0)+"2";
            }else{
                return input.charAt(0)+""+input.charAt(1);
            }
        }

        Deque<Character> deque = new ArrayDeque<>();
        int count = 1;
        deque.addLast(input.charAt(0));

        for(int i = 1 ; i < input.length(); i++){
            char currChar = deque.peekLast();
            if(currChar == input.charAt(i)){
                ++count;
                continue;
            }else{
                if(count > 1){
                    deque.addLast(Character.forDigit(count,10));
                    count = 1;
                    deque.addLast(input.charAt(i));
                }else{
                    deque.addLast(input.charAt(i));
                }
            }
        }

        if(count>1){
            deque.addLast(Character.forDigit(count,10));
        }

        StringBuilder output = new StringBuilder();
        while(!deque.isEmpty()){
            output.append(deque.removeFirst());
        }
        return output.toString();
    }
}
