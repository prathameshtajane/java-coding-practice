package goldman_sachs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prathamesh on 9/9/18.
 */
public class WorstPerformingStock {

    static int worstPerformingStock(List<List<Integer>> prices) {
        int worstPerformer = 0;
        float lowestROI = Float.MAX_VALUE;

        for(List<Integer> eachList : prices) {
            float diff = (eachList.get(2) - eachList.get(1))/(eachList.get(1)+0.0f);
            worstPerformer = (diff<lowestROI) ? eachList.get(0) : worstPerformer;
            lowestROI = (diff<lowestROI) ? diff : lowestROI;
        }
        return worstPerformer;
    }

    public static void main(String args[]){
        List<List<Integer>> testInput = new ArrayList<>();
        List<Integer> test1 =  new ArrayList<>();
        test1.add(1);
        test1.add(100);
        test1.add(110);
        testInput.add(test1);

        List<Integer> test2 =  new ArrayList<>();
        test2.add(2);
        test2.add(50);
        test2.add(60);
        testInput.add(test2);


        List<Integer> test3 =  new ArrayList<>();
        test3.add(3);
        test3.add(100);
        test3.add(90);
        testInput.add(test3);

        List<Integer> test4 =  new ArrayList<>();
        test4.add(4);
        test4.add(50);
        test4.add(40);
        testInput.add(test4);

        System.out.println(WorstPerformingStock.worstPerformingStock(testInput));
//        int[] test1 = {1,100,110};
//        int[] test2 = {2,50,60};
//        int[] test3 = {3,100,90};
//        int[] test4 = {4,50,40};
    }
}
