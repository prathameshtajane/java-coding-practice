package leetcode_solutions;
import java.util.Arrays;

public class PermutationOfArrayElements {

    public static void swap(String[] inpArray, int sourceIndex, int destinationIndex) {
        String tempValue = inpArray[sourceIndex];
        inpArray[sourceIndex] = inpArray[destinationIndex];
        inpArray[destinationIndex] = tempValue;
    }

    public static void permute(String[] inputArray, int l, int r) {

        //base condition
        if (l >= r) {
            System.out.println(Arrays.toString(inputArray));
        }
        for (int i = l; i <= r; i++) {
            swap(inputArray, l, i);
            permute(inputArray, l + 1, r);
            swap(inputArray, l, i);//back tracking
        }

    }
    public static void main(String args[]) {
        String[] testInputArray = {"the", "quick", "brown", "fox"};
        PermutationOfArrayElements pb22 = new PermutationOfArrayElements();
        pb22.permute(testInputArray, 0, testInputArray.length-1);
    }

}
