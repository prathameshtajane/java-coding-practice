package leetcode_solutions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by prathamesh on 10/1/18.
 */
public class MaxFrequency {

    public static void main(String args[]){
        int[] a = {12,13,12,25,34,12,25,23};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : a) {
            Integer count = map.get(i);
            map.put(i, count != null ? count+1 : 0);
        }

        Integer popular = Collections.max(map.entrySet(),
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }).getKey();

        System.out.println(popular);
    }
}
