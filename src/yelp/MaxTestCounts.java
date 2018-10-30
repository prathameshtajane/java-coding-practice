package yelp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class MaxTestCounts {

    public static int[] getMaxTestCounts(int[][] testcaseProj,int maxTime){

        // Step 1 : Creating TreeMap
        TreeMap<Integer,ArrayList<Integer>> projTime = new TreeMap<>();
        for(int[] each : testcaseProj){
            ArrayList<Integer> tempTimeList;
            if(projTime.get(each[0]) == null){
                tempTimeList = new ArrayList<>();
            }else{
                tempTimeList = projTime.get(each[0]);
            }
            tempTimeList.add(each[1]);
            projTime.put(each[0],tempTimeList);
        }

        int[] output = new int[projTime.size()];

        //Step 2 : Iterating TreeMap
        int currTime=0;

        while(maxTime > currTime){
            int[] tempCollector = new int[output.length];
            for(Integer eachKey : projTime.keySet()){
                tempCollector[eachKey-1]=projTime.get(eachKey).get(0);
            }

            //get index with minimum time from tempCollector
            int[] tempMinIndexTimePair = new int[2];
            int tempMinTime = Integer.MAX_VALUE;
            for(int i=0;i<tempCollector.length;i++){
                if(tempCollector[i] < tempMinTime && tempCollector[i] != 0){
                    tempMinTime = tempCollector[i];
                    tempMinIndexTimePair[0]=i;
                    tempMinIndexTimePair[1]=tempCollector[i];
                }
            }

            currTime = currTime+tempMinIndexTimePair[1];
            if(currTime <= maxTime){
                output[tempMinIndexTimePair[0]]+=1;
                ArrayList<Integer> tempTimes = projTime.get(tempMinIndexTimePair[0]+1);
                tempTimes.remove(0);
                if(tempTimes.size() > 0){
                    projTime.put(tempMinIndexTimePair[0]+1,tempTimes);
                }else {
                    projTime.remove(tempMinIndexTimePair[0]+1);
                }

            }
            //no need
            if(currTime >= maxTime){
                break;
            }
        }

    return output;
    }

    public static void main(String args[]){
        System.out.println("MaxTestCounts");
//        int[][] testcaseProj = {
//                {1,2},
//                {2,4},
//                {1,4},
//                {3,5},
//                {4,5},
//                {1,2},
//        };
        int[][] testcaseProj = {
                {1,2},
                {1,3},
                {2,5},
                {2,10},
                {2,17},
                {3,8},
                {3,14},
                {3,2},
                {4,12},
                {4,1},
                {5,2},
                {5,10},

        };
        int maxtime = 19;
        System.out.println(Arrays.toString(MaxTestCounts.getMaxTestCounts(testcaseProj,maxtime)));

    }
}
