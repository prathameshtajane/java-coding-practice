package leetcode_solutions;

import java.util.PriorityQueue;

/**
 * 703. Kth Largest Element in a Stream
 *
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.
 *
 * Example:
 *
 * int k = 3;
 * int[] arr = [4,5,8,2];
 * KthLargest kthLargest = new KthLargest(3, arr);
 * kthLargest.add(3);   // returns 4
 * kthLargest.add(5);   // returns 5
 * kthLargest.add(10);  // returns 5
 * kthLargest.add(9);   // returns 8
 * kthLargest.add(4);   // returns 8
 * Note:
 * You may assume that nums' length ≥ k-1 and k ≥ 1.
 *
 * link : https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
 */


public class E_Amazon_Kth_Largest_Element_in_a_Stream {
    final PriorityQueue<Integer> priorityQueue;
    final int k;

    public E_Amazon_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue<>(k);
        for (int n : nums)
            add(n);
    }

    public int add(int val) {
        if (priorityQueue.size() < k)
            priorityQueue.offer(val);
        else if (priorityQueue.peek() < val) {
            priorityQueue.poll();
            priorityQueue.offer(val);
        }
        return priorityQueue.peek();
    }
}
