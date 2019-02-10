package leetcode_solutions;

/**
 * Remove spaces from a given string
 * Given a string, remove all spaces from the string and return it.
 *
 * Input:  "g  eeks   for ge  eeks  "
 * Output: "geeksforgeeks"
 * Expected time complexity is O(n) and only one traversal of string.
 */

public class M_Amazon_Remove_Special_Charater_From_Stream {

    String getStreamWithoutTargetChar(String inputStream, char targetChar){
        StringBuilder outputStream = new StringBuilder();
        int index = 0;
        for(char c : inputStream.toCharArray()){
            if(c != targetChar){
                outputStream.insert(index,c);
                index++;
            }
        }
        return new String(outputStream);
    }
}
