package leetcode_solutions.google;

/*
    On-Site interview Question

    Given a contiguous sequence of numbers in which each number repeats thrice,
    there is exactly one missing number. Find the missing number.

    eg: 11122333 : Missing number 2
    11122233344455666 Missing number 5

    Link : https://leetcode.com/discuss/interview-experience/124626/Google-onsite-interview-questions/

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E_Find_Missing_Element {


    public int findMissingElementUsingSet(Integer[] inputArray) {
        Set<Integer> uniqueElementSet = new HashSet<>();
        uniqueElementSet.addAll(Arrays.asList(inputArray));
        int expectedSum = 0;
        int observedSum = 0;

        for (int each : uniqueElementSet) {
            expectedSum += each;
        }


        for(int each : inputArray){
            observedSum += each;
        }

        return (expectedSum*3 - observedSum);
    }


    public static void main(String args[]) {
        System.out.println("E_Find_Missing_Element");
        E_Find_Missing_Element FMissElement = new E_Find_Missing_Element();
        Integer[] input1 = {1,1,1,2,2,2,3,3,3,4,4,5,5,5};
        System.out.println(FMissElement.findMissingElementUsingSet(input1));

    }
}
