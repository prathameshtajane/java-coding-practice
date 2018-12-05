package leetcode_solutions;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * Example:
 * For example:
     {“a”,“a”,“b”} should give “” as there is nothing common in all the 3 strings.
     {“a”, “a”} should give “a” as a is longest common prefix in all the strings.
     {“abca”, “abc”} as abc
     {“ac”, “ac”, “a”, “a”} as a.
 */
public class LongestCommonPrefix {
    public static String getLongestCommonPrefix(String[] inputArr){
        if(inputArr.length == 0 || inputArr.length == 1){
            return "";
        }
        String firstString = inputArr[0];
        for(int i = 0;i<=firstString.length()-1;i++){
            for(int j = 1;j<=inputArr.length-1;j++){
                if(i>inputArr[j].length()-1 || firstString.toCharArray()[i] != inputArr[j].toCharArray()[i]){
                    return firstString.substring(0,i);
                }
            }
        }
        return firstString;
    }
    public static void main(String args[]){
        String[] inputStringArray={"a","abca","abcad","ab"};
        System.out.println(LongestCommonPrefix.getLongestCommonPrefix(inputStringArray));
    }
}
