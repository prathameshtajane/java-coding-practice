package daily_coding_challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* This problem was asked by Uber.
    Given an array of integers, return a new array such that each element at index i of the new array is the product
    of all the numbers in the original array except the one at i.

    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
    If our input was [3, 2, 1], the expected output would be [2, 3, 6].

    Follow-up: what if you can't use division?

    Algo:https://stackoverflow.com/questions/2680548/given-an-array-of-numbers-return-array-of-products-of-all-other-numbers-no-div
*
* */
public class Prob2_Uber {

    public List<Integer> productExceptCurrentPosition(List<Integer> inputList){
        List<Integer> fromFrontIndex= new ArrayList<>();
        int [] fromBackIndex= new int[inputList.size()];
        List<Integer> outputList= new ArrayList<>();

        int initialiser = 1;
        for(int i=0;i<inputList.size();++i){
            fromFrontIndex.add(i,initialiser);
            initialiser *= inputList.get(i);
        }

        initialiser = 1;
        for(int i=inputList.size()-1;i>=0;--i){
            fromBackIndex[i]=initialiser;
            initialiser *= inputList.get(i);
        }

        for(int i=0;i<fromFrontIndex.size();i++){
            outputList.add(i,(fromFrontIndex.get(i)*fromBackIndex[i]));
        }

        return outputList;
    }

    public static void main(String args[]){
        System.out.println("Problem Number 2");
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);

        Prob2_Uber pb2=new Prob2_Uber();
        System.out.println(Arrays.toString(pb2.productExceptCurrentPosition(testList).toArray()));


    }
}
