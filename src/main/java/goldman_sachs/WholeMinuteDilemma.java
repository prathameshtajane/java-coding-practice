package goldman_sachs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WholeMinuteDilemma {


    static long getPairsCount(int[] inputArray,int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inputArray.length;i++){
            if(!map.containsKey(inputArray[i])){
                map.put(inputArray[i],0);
            }
            map.put(inputArray[i],map.get(inputArray[i])+1);
        }

        long twiceCount = 0;

        for(int i=0;i<inputArray.length;i++){
            if(map.containsKey(sum-inputArray[i])){
                twiceCount=twiceCount+map.get(sum-inputArray[i]);
            }
            if(sum-inputArray[i]==inputArray[i]){
                twiceCount = twiceCount -1;
            }
        }
        return twiceCount/2;
    }

    static long playlist(List<Integer> songs){
        int[] inputArray = new int[songs.size()];
        for(int i=0;i<songs.size();i++){
            inputArray[i]=songs.get(i)%60;
        }
        return getPairsCount(inputArray,0)+getPairsCount(inputArray,60);
    }

    public static void main(String args[]){
        System.out.println("WholeMinuteDilemma");
        List<Integer> testInput = new ArrayList<>();
        testInput.add(30);
        testInput.add(20);
        testInput.add(150);
        testInput.add(100);
        testInput.add(40);
        System.out.println(WholeMinuteDilemma.playlist(testInput));

        List<Integer> testInput2 = new ArrayList<>();
        testInput2.add(10);
        testInput2.add(50);
        testInput2.add(90);
        testInput2.add(30);
        System.out.println(WholeMinuteDilemma.playlist(testInput2));

        List<Integer> testInput3 = new ArrayList<>();
        testInput3.add(3);
        testInput3.add(60);
        testInput3.add(60);
        testInput3.add(60);
        System.out.println(WholeMinuteDilemma.playlist(testInput3));

    }
}
