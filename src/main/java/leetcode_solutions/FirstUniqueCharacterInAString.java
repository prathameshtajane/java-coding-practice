package leetcode_solutions;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 Note: You may assume the string contain only lowercase letters.

 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        int returnIndex = -1;
        int[] alphaCount = new int[26];
        int[] locationCount = new int[26];

        for(int i=0;i<s.length();i++){
            alphaCount[s.charAt(i)-'a']++;
            locationCount[s.charAt(i)-'a']=i;
        }

        for(int j=0;j<  26;j++){
            if(alphaCount[j] == 1){
                returnIndex = returnIndex == -1 ? locationCount[j] : Math.min(returnIndex, locationCount[j]);
            }
        }
        return returnIndex;
    }

    public int firstUniqCharOptimal(String s){
        int[] charCountArray = new int[256];
        for(char character : s.toCharArray()){
            ++charCountArray[(int)Character.toLowerCase(character)];
        }

        for(int i = 0 ; i < s.toCharArray().length ; i++){
            if(charCountArray[(int)Character.toLowerCase(s.charAt(i))]==1){
                return i;
            }
        }

        return -1;
    }


    public static void main(String args[]){
        System.out.println("FirstUniqueCharacterInAString");
    }
}
