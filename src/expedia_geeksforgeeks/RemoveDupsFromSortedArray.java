package expedia_geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted array of integers,
 * write a function to remove any duplicates (e.g. 1,2,3,3,3,4,4,5 would go to 1,2,3,4,5).
 */
public class RemoveDupsFromSortedArray {
    public static void main(String args[]){
        int[] inputArray = {1,2,3,3,3,4,4,5};
        List<Integer> arrList = new ArrayList<Integer>();
        for (int i : inputArray)
        {
            arrList.add(i);
        }
        if(arrList.get(0) == arrList.get(1)){
            arrList.remove(0);
        }
        for(int i =inputArray.length-1;i>=1;i--){
            if(arrList.get(i) == arrList.get(i-1)){
                arrList.remove(i);
            }
        }
        System.out.println(arrList.toString());
    }
}
