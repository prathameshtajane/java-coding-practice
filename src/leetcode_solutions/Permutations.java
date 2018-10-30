package leetcode_solutions;


//import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Given a collection of distinct integers, return all possible permutations.

 Example:

 Input: [1,2,3]
 Output:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]

 link : https://leetcode.com/problems/permutations/description/
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutationList = new ArrayList<>();
        List<Integer> prefix = new ArrayList<>();
        permuteUtil(prefix,nums,permutationList);
        return permutationList;
    }

    public void permuteUtil(List<Integer> prefix, int[] subarray, List<List<Integer>> permutationList){
        int count = subarray.length;
        if(count == 0){
            //base condition
            permutationList.add(prefix);
        }else{
            for(int i=0;i<subarray.length;i++){
                int[] new_subarray_past = Arrays.copyOfRange(subarray,0,i);
                int[] new_subarray_next = Arrays.copyOfRange(subarray,i+1,count);

//                int[] mergedArray = ArrayUtils.addAll(new_subarray_past, new_subarray_next);
                int[] mergedArray = new int[3];
                prefix.add(subarray[i]);
                permuteUtil(prefix,mergedArray,permutationList);
            }
        }
    }


    public static void main(String args[]){
        System.out.println("Permutations");
        Permutations p =new Permutations();
        int[] test = {1,2,3,4};
        p.permute(test);
    }

}
