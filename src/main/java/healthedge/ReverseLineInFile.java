package healthedge;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In Eclipse environment, write and execute program which:
 1.	Creates a test text file with a number of lines. Each line should be a simple sentence comprised of few words separated by spaces.
 2.	Reads the file created in step 1 as input
 3.	Writes a new file, each line of the new file should list words from the input line in reverse order. For instance, if the line in  the input file contained text "I had a dream" the corresponding output file line should be "dream a had I".
 */
public class ReverseLineInFile {

    static int[] DuplicatesInArray(int[] randomIntegers) {
        ArrayList<Integer> duplicatesInArray = new ArrayList<Integer>();
        for(int i =0;i<randomIntegers.length;i++) {
            if(randomIntegers[Math.abs(randomIntegers[i])] >= 0) {
                randomIntegers[Math.abs(randomIntegers[i])] = -randomIntegers[Math.abs(randomIntegers[i])];
            }else {
                duplicatesInArray.add(Math.abs(randomIntegers[i]));
            }
        }
        int[] returnArray = new int[duplicatesInArray.size()];
        for(int i =0;i<duplicatesInArray.size();i++) {
            returnArray[i]=duplicatesInArray.get(i);
        }
        System.out.println(Arrays.toString(returnArray));
        return returnArray;
    }

    static public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<nums1.length; i++){
            if(i==0 || (i>0 && nums1[i]!=nums1[i-1])){
                if(Arrays.binarySearch(nums2, nums1[i])>-1){
                    list.add(nums1[i]);
                }
            }
        }
        int[] result = new int[list.size()];
        int k=0;
        for(int i: list){
            result[k++] = i;
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println("ReverseLineInFile");
        int[] testInput = {1,2,3,4,5};
        int[] testInput2 = {3,4,5};
        int[] testExpected = {3,4,5};
    }
}
