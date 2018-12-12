package leetcode_solutions;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 295. Find Median from Data Stream
 *
 * Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.
 *
 * For example,
 * [2,3,4], the median is 3
 *
 * [2,3], the median is (2 + 3) / 2 = 2.5
 *
 * Design a data structure that supports the following two operations:
 *
 * void addNum(int num) - Add a integer number from the data stream to the data structure.
 * double findMedian() - Return the median of all elements so far.
 *
 *
 * Example:
 *
 * addNum(1)
 * addNum(2)
 * findMedian() -> 1.5
 * addNum(3)
 * findMedian() -> 2
 *
 * Follow up:
 *
 * If all integer numbers from the stream are between 0 and 100, how would you optimize it?
 * If 99% of all integer numbers from the stream are between 0 and 100, how would you optimize it?
 *
 * link : https://leetcode.com/problems/find-median-from-data-stream/description/
 */

public class H_Oracle_Find_Median_from_Data_Stream {
    PriorityQueue<Integer> leftHeap;
    PriorityQueue<Integer> rightHeap;
    boolean isEven = true;

    /** initialize your data structure here. */
    public H_Oracle_Find_Median_from_Data_Stream() {
        leftHeap = new PriorityQueue(Collections.reverseOrder());
        rightHeap = new PriorityQueue();
    }

    public void addNum(int num) {
        if(isEven){
            leftHeap.offer(num);
            rightHeap.offer(leftHeap.poll());
        }else{
            rightHeap.offer(num);
            leftHeap.offer(rightHeap.poll());
        }
        isEven=!isEven;
    }

    public double findMedian() {
        if(isEven){
            return ((leftHeap.peek()+rightHeap.peek())/2.0);
        }else{
            return rightHeap.peek();
        }
    }
}
