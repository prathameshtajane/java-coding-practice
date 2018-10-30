package comparator_practice;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Sort Map collection by values
 */

class CompareByValues implements Comparator<String> {
    Map<String, String> testMap;

    public CompareByValues(Map<String, String> testMap){

        this.testMap=testMap;
    }

    @Override
    public int compare(String s1,String s2){

        return (testMap.get(s1)).compareTo(testMap.get(s2));
    }
}

class CompareByValues2 implements Comparator<Integer> {
    @Override
    public int compare(Integer s1,Integer s2){

        return s1.compareTo(s2);
    }
}

public class MapSortByValues {
    public static void main(String args[]) {
//        Map<String,String> testMap = new HashMap<String,String>();
//        CompareByValues compareValues = new CompareByValues(testMap);
//        testMap.put("1","z");
//        testMap.put("2","x");
//        testMap.put("3","y");
//        testMap.put("4","v");
//        System.out.println("Without");
//        System.out.println(testMap);
        TreeMap<Integer,Integer> testTreeMap = new TreeMap<>(new CompareByValues2());
        testTreeMap.put(1,4);
        testTreeMap.put(2,3);
        testTreeMap.put(3,2);
        testTreeMap.put(4,1);
//        testTreeMap.putAll(testMap);
//        System.out.println("Without");
//        System.out.println(testMap);

        System.out.println("With");
        System.out.println(testTreeMap);

    }
}
