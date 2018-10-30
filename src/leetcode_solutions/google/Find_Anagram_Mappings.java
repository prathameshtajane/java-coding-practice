package leetcode_solutions.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
    Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the
    order of the elements in A.

    We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.
    These lists A and B may contain duplicates. If there are multiple answers, output any of them.

     For example, given

     A = [12, 28, 46, 32, 50]
     B = [50, 12, 32, 46, 28]
     We should return
     [1, 4, 3, 2, 0]
     as P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4 because the 1st element of A appears at B[4], and so on.
     Note:

     A, B have equal lengths in range [1, 100].
     A[i], B[i] are integers in range [0, 10^5].

     Link : https://leetcode.com/problems/find-anagram-mappings/description/
 */
public class Find_Anagram_Mappings {

    public int[] anagramMappings(int[] A, int[] B) {
        int[] array_locations = new int[A.length];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        //Populating HashMap : O(n)
        for(int i=0;i<A.length;i++){
            map.computeIfAbsent(B[i],k -> new ArrayList<Integer>()).add(i);
        }


        for(int i=0;i<A.length;i++){
            array_locations[i] = map.get(A[i]).remove(map.get(A[i]).size()-1);
        }


        return array_locations;
    }

    public static void main(String args[]){
        System.out.println("Find_Anagram_Mappings");
        Find_Anagram_Mappings  test = new Find_Anagram_Mappings();
        int A[] = {12, 28, 46, 32, 50};
        int B[] = {50, 12, 32, 46, 28};
        System.out.println(Arrays.toString(test.anagramMappings(A,B)));
    }
}
