package daily_coding_challenges;

/*
    This question was asked by google.

    Given an integer n and a list of integers l,
    write a function that randomly generates a number from 0 to n-1 that isn't in l (uniform).
 */

import java.util.ArrayList;
import java.util.List;

public class Prob90_RandNumberNotFromList {

    int randNumberNotFromListBruteForce(int n, List<Integer> list){
        for(int i = 0;i<n;i++){
            if(list.contains(i)){
                continue;
            }else{
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println("Prob90_RandNumberNotFromList");
        Prob90_RandNumberNotFromList RAND = new Prob90_RandNumberNotFromList();

        List<Integer> uniformList = new ArrayList<>();
        uniformList.add(1);
        uniformList.add(2);
        uniformList.add(4);
        uniformList.add(5);

        System.out.println(RAND.randNumberNotFromListBruteForce(5,uniformList));
    }
}
