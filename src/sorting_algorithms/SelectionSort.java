package sorting_algorithms;

import java.util.Arrays;

/**
 *  Selection Sort
 *
 *  Algorithm :
        1. Find the smallest card. Swap it with the first card.
        2. Find the second-smallest card. Swap it with the second card.
        3. Find the third-smallest card. Swap it with the third card.
        4. Repeat finding the next-smallest card, and swapping it into the correct position until the array is sorted.

    This algorithm is called selection sort because it repeatedly selects the next-smallest element and swaps it into place.
 *
 */
public class SelectionSort {

    public static int[] selection_sort(int[] inputArray){
        int array_len = inputArray.length;
        for(int i=0;i<array_len-1;i++){
            int min_index = i;
            for(int j=i+1;j<array_len;j++){
                if(inputArray[j] < inputArray[min_index]){
                    //replace element at min_index with element at j
                    int temp = inputArray[min_index];
                    inputArray[min_index]=inputArray[j];
                    inputArray[j]=temp;
                }
            }
        }
        return inputArray;
    }


    public static void main(String args[]){
        System.out.println("Selection Sort");
        int[] testInput = {9,8,7,6,5,4,3,2,1};
        long starttime = System.currentTimeMillis();
        SelectionSort.selection_sort(testInput);
        long endtime = System.currentTimeMillis();
        System.out.println(Arrays.toString(testInput));
        System.out.println("Time taken : "+(endtime-starttime)+"ms.");
    }
}
