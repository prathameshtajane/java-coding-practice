package leetcode_solutions;


import java.util.*;

class ValueComparator implements Comparator<String>{

    Map<String,Integer> map;

    public ValueComparator(Map<String,Integer> map){
        this.map=map;
    }

    @Override
    public int compare(String o1, String o2) {
        if(map.get(o1) >= map.get(o2)){
            return -1;
        }else{
            return 1;
        }
    }
}

public class TreeMapTest {


    public static void main(String args[]) {
        Map<String, Integer> newMap = new HashMap<String,Integer>();
        ValueComparator testValueComparator = new ValueComparator(newMap);
        TreeMap<String,Integer> sorted_map = new TreeMap<String,Integer>(testValueComparator);
        newMap.put("ane", 0);
        newMap.put("bwo", 4);
        newMap.put("zhree", 3);
        newMap.put("dour", 2);
        System.out.println("unsorted map: " + newMap);
        sorted_map.putAll(newMap);
        System.out.print(sorted_map);
    }
}
