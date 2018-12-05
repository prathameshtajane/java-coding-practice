package linkedIn;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationWithParity {

    /*
    * Complete the 'alternatingParityPermutations' function below.
    *
    * The function is expected to return a 2D_INTEGER_ARRAY.
    * The function accepts INTEGER n as parameter.
    */

    private static List<List<Integer>> perm = new ArrayList();

    public static List<List<Integer>> alternatingParityPermutations(int n) {
        Integer numbersArray[] = new Integer[n];

//        List<Integer> input = new ArrayList();

        for (int i = 0; i < n; i++) {
            numbersArray[i] = i + 1;
//            input.add(i+1);
        }
        List<Integer> emptyList = new ArrayList();

        calculateAllPermutation(emptyList, Arrays.asList(numbersArray));

        return perm;
    }

    public static void calculateAllPermutation(List<Integer> combination, List<Integer> nums) {
        if (nums.size() == 0) {
            perm.add(combination);
        } else {
            for (int i = 0; i < nums.size(); i++) {
                List<Integer> list1 = new ArrayList(combination);
                list1.add(nums.get(i));
                if (!validatePermutation(list1)) {
                    continue;
                }
                List<Integer> list2 = new ArrayList(nums.subList(0, i));
                list2.addAll(nums.subList(i + 1, nums.size()));
                calculateAllPermutation(list1, list2);
            }
        }
    }


    private static boolean validatePermutation(List<Integer> record) {
        for (int i = 0; i < record.size() - 1; i++) {
            if ((record.get(i) - record.get(i + 1)) % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println("PermutationWithParity");
        System.out.println(alternatingParityPermutations(3));
    }
}
