import java.util.Arrays;

/**
 * This problem was asked by Uber.

 Given an array of integers, return a new array such that each element at index i of the new array is the product of
 all the numbers in the original array except the one at i.

 For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 If our input was [3, 2, 1], the expected output would be [2, 3, 6].

 Follow-up: what if you can't use division?
 */
public class DCP2 {

    int multiplication(int[] inputArray, int index){
        int tempMultiplication = 1;
        for(int i=0;i<inputArray.length;i++){
            if(i != index){
                tempMultiplication *= inputArray[i];
            }
        }
        return tempMultiplication;
    }

    public static void main(String args[]){
        System.out.println("Daily Conding Problem");
//        int[] inputArray ={1,2,3,4,5};
        int[] inputArray ={3,2,1};
        int[] newInputArray = new int[inputArray.length];
        DCP2 test = new DCP2();

        for(int i=0;i<inputArray.length;i++){
            newInputArray[i]=test.multiplication(inputArray,i);
        }
        System.out.println(Arrays.toString(newInputArray));

    }
}
