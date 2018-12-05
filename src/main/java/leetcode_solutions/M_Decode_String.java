package leetcode_solutions;

/*
    394. Decode String

    Given an encoded string, return it's decoded string.

    The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being
    repeated exactly k times. Note that k is guaranteed to be a positive integer.

    You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

    Furthermore, you may assume that the original data does not contain any digits and that digits are only for
    those repeat numbers, k. For example, there won't be input like 3a or 2[4].

    Examples:

    s = "3[a]2[bc]", return "aaabcbc".
    s = "3[a2[c]]", return "accaccacc".
    s = "2[abc]3[cd]ef", return "abcabccdcdcdef".

    link : https://leetcode.com/problems/decode-string/description/

    todo : Decode String

 */
public class M_Decode_String {

    public String decodeString(String s) {
        //Incorrect Logic
        StringBuffer decoded_string = new StringBuffer();

        for(char eachChar : s.toCharArray()){
            if(Character.isDigit(eachChar)){
                for(int i = 0;i<(int)eachChar;i++){
                    decoded_string.append(decoded_string);
                }
            }else{
                if(eachChar != '[' && eachChar != ']'){
                    decoded_string.insert(0,eachChar);
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println("M_Decode_String");
    }
}
