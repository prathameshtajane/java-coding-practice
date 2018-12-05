package linkedIn;


import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctPairs {

    static int numberOfPairs(int[] a , long k){
        Set<String> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();

        for(int each : a) {
            if (hashSet2.contains((int)(k - each))) {
                int first = each;
                int second = (int)(k - each);
                String res = (first > second) ? (""+second+","+first) : (""+first+","+second);
                hashSet1.add(res);
            }
            hashSet2.add(each);
        }
        return hashSet1.size();
    }


    public static void main(String args[]){
        System.out.println("NumberOfDistinctPairs");
    }
}
