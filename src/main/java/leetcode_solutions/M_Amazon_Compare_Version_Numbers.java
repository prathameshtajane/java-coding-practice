package leetcode_solutions;


/**
 *
 * Compare Version Numbers
 *
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.
 *
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level
 * revision of the second first-level revision.
 *
 * Example 1:
 *
 * Input: version1 = "0.1", version2 = "1.1"
 * Output: -1
 * Example 2:
 *
 * Input: version1 = "1.0.1", version2 = "1"
 * Output: 1
 * Example 3:
 *
 * Input: version1 = "7.5.2.4", version2 = "7.5.3"
 * Output: -1
 *
 * link : https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/502/
 */
public class M_Amazon_Compare_Version_Numbers {
    public int compareVersion(String version1, String version2) {
        String[] version1Array = version1.split("\\.");
        String[] version2Array = version2.split("\\.");

        int length = Math.max(version1Array.length,version2Array.length);

        if(version1Array.length == 0){
            version1Array=new String[]{version1};
        }

        if(version2Array.length == 0){
            version2Array=new String[]{version2};
        }


        for(int i = 0 ; i < length ; i++){
            Integer currV1 = (i < version1Array.length)?Integer.parseInt(version1Array[i]):0;
            Integer currV2 = (i < version2Array.length)?Integer.parseInt(version2Array[i]):0;
            int compare = currV1.compareTo(currV2);
            if(compare != 0){
                return compare;
            }
        }
        return 0;
    }
}
