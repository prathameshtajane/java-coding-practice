package leetcode_solutions.google;


/*
    Given two string. one has exactly one more letter than the other, find this letter, the input must be valid.
    e.g. s1:'abbc', s2:'bcbad' return d
 */

public class M_Find_One_Extra_Character_In_A_String {

    static char findExtraCharcter(String strA, String strB){
        // result store the result
        int res = 0, i;

        // traverse string A till
        // end and xor with res
        for (i = 0; i < strA.length(); i++)
        {
            // xor with res
            res ^= strA.charAt(i);
        }

        // traverse string B till end and
        // xor with res
        for (i = 0; i < strB.length(); i++){
            // xor with res
            res ^= strB.charAt(i);
        }

        // print result at the end
        return ((char)(res));
    }

    public static void main(String args[]){
        System.out.println("M_Find_One_Extra_Character_In_A_String");
        String str1 = "ab";
        String str2 = "abc";

        System.out.println(findExtraCharcter(str1,str2));

    }
}
