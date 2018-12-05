package leetcode_solutions.google;

/*
    Given a integer array, contain unique number, represent the velocity of the car in the road
    (the position in the array represent the possition in the road, and there is only one road),
    the fast car will be block by the slow car, return a array, each number represent the number of car in that group.

    e.g. [4,2,3,1] return [1,2,1] because 4 the is faster and no one  can block it, but 3 will be block by 2,
     and previous cars are faster than 1, so 1 will not be in the same group with them.

    follow up, add a new car with a new speed into this array , return every possible answer.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M_Find_Car_Groups_Based_On_Velocity {

    public static List<Integer> findCarGroups(int[] inputArray){
        int count=1;
        List<Integer> opList = new ArrayList<>();
        for(int i=0;i<=inputArray.length-2;i++){
            if(inputArray[i+1]-inputArray[i] <= 0){
                opList.add(count);
                count=1;
            }else{
                count++;
            }
        }
        opList.add(count);
        return opList;
    }

    public static void main(String args[]){
        System.out.println("M_Find_Car_Groups_Based_On_Velocity");
        System.out.println(Arrays.toString(findCarGroups(new int[]{4, 2, 3, 1}).toArray()));
        System.out.println(Arrays.toString(findCarGroups(new int[]{4, 4,4,4}).toArray()));
        System.out.println(Arrays.toString(findCarGroups(new int[]{1,2,3,4}).toArray()));
        System.out.println(Arrays.toString(findCarGroups(new int[]{4,3,2,1}).toArray()));
    }
}
