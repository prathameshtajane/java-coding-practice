package linkedIn;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationWithParityPrathamesh {

    public List<List<Integer>> permute(Integer[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        permute(result, num, 0);
        return result;
    }

    private void permute(List<List<Integer>> result, Integer[] array, int start) {
        if (start >= array.length) {
            List<Integer> current = new ArrayList<Integer>();
            for (int a : array) {
                current.add(a);
            }
            if (validatePermutation(Arrays.asList(array))) {
                result.add(current);
            }
//            result.add(current);
        } else {
            for (int i = start; i < array.length; i++) {
                swap(array, start, i);
                if (!validatePermutation(Arrays.asList(array))) {
                    continue;
                }
                permute(result, array, start + 1);
                swap(array, start, i);
            }
        }
    }

    private void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    private boolean validatePermutation(List<Integer> record) {
        for (int i = 0; i < record.size() - 1; i++) {
            if (record.get(i) % 2 == 0 && record.get(i + 1) % 2 == 0
                    || record.get(i) % 2 != 0 && record.get(i + 1) % 2 != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]) {
        System.out.println("PermutationWithParityPrathamesh");
        PermutationWithParityPrathamesh p = new PermutationWithParityPrathamesh();
        Integer[] input1 = {1, 2, 3, 4, 5};
        System.out.println(p.permute(input1));
    }

}
