package leetcode_solutions;


/**
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Example 1:
 *
 * Input: "hello"
 * Output: "olleh"
 * Example 2:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: "amanaP :lanac a ,nalp a ,nam A"
 */
public class E_Amazon_Reverse_String {

    public void swap(char[] s,int sourceIndex , int destinationIndex){
        char tempChar=s[sourceIndex];
        s[sourceIndex]=s[destinationIndex];
        s[destinationIndex]=tempChar;
    }

    public String reverseString(String s) {
        char[] characterArray = s.toCharArray();
        for(int i = 0 ; i < characterArray.length/2 ; i++)
            swap(characterArray,i,characterArray.length-1-i);
        return new String(characterArray);
    }
}
