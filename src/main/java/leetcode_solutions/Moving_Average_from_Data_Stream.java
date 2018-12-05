package leetcode_solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 *   Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

     Example:

     MovingAverage m = new MovingAverage(3);
     m.next(1) = 1
     m.next(10) = (1 + 10) / 2
     m.next(3) = (1 + 10 + 3) / 3
     m.next(5) = (10 + 3 + 5) / 3
 *
 */
public class Moving_Average_from_Data_Stream {

    Queue<Integer> collector;
    int max_queue_size;
    int current_queue_sum;

    /** Initialize your data structure here. */
    public  Moving_Average_from_Data_Stream(int size) {
        collector = new LinkedList<>();
        max_queue_size=size;
    }

    public double next(int val) {
        if(collector.size() == max_queue_size){
            current_queue_sum = current_queue_sum - collector.remove();
        }
        current_queue_sum=current_queue_sum+val;
        collector.add(val);
        return (current_queue_sum+0.0)/collector.size();
    }

    public static void main(String args[]){
        System.out.println("Moving_Average_from_Data_Stream");
        Moving_Average_from_Data_Stream test = new Moving_Average_from_Data_Stream(3);
        System.out.println(test.next(1));
        System.out.println(test.next(2));
        System.out.println(test.next(3));
        System.out.println(test.next(4));


    }


}
