package linkedIn;

import java.util.*;

/**
 * Created by prathamesh on 9/29/18.
 */

class CompareByValues implements Comparator<Integer> {
    Map<Integer, Integer> testMap;
    public CompareByValues(Map<Integer, Integer> testMap){
        this.testMap=testMap;
    }
    public int compare(Integer s1,Integer s2){
        return (testMap.get(s1)).compareTo(testMap.get(s2));
    }
}

public class CustomSorted {


//    public void solution(List<Integer> inp){
//        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
//        for(int each : inp){
//            if(treeMap.containsKey(each)){
//                int temp = treeMap.get(each)+1;
//                treeMap.put(each,temp);
//            }else {
//                treeMap.put(each,1);
//            }
//        }
//
//        TreeMap<Integer,Integer> testMap = new TreeMap<>();
//        for(int each : inp){
//            if(testMap.containsKey(each)){
//                int temp = testMap.get(each)+1;
//                testMap.put(each,temp);
//            }else {
//                testMap.put(each,1);
//            }
//        }
//        CompareByValues compareValues = new CompareByValues(testMap);
//        TreeMap<Integer,Integer> testTreeMap = new TreeMap<>(compareValues);
//        testTreeMap.putAll(testMap);
//
////        CompareByValues c = new CompareByValues(treeMap);
////        Map<Integer,Integer> map = c.getMap();
//        System.out.println("end");
//
//    }

    public static void main(String args[]){
        System.out.println("CustomSorted");
        CustomSorted cs = new CustomSorted();
        Integer[] input1 = {4,5,6,5,4,3};
//        cs.solution(Arrays.asList(input1));

        Map<Integer,Integer> testMap = new TreeMap<>();
        CompareByValues compareValues = new CompareByValues(testMap);
        //        for(int each : inp){
//            if(testMap.containsKey(each)){
//                int temp = testMap.get(each)+1;
//                testMap.put(each,temp);
//            }else {
//                testMap.put(each,1);
//            }
//        }


    }
}
