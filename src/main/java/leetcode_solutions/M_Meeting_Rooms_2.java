package leetcode_solutions;

/**
 * 253. Meeting Rooms II
 *
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.
 *
 * Example 1:
 *
 * Input: [[0, 30],[5, 10],[15, 20]]
 * Output: 2
 * Example 2:
 *
 * Input: [[7,10],[2,4]]
 * Output: 1
 *
 * link : https://leetcode.com/problems/meeting-rooms-ii/description/
 */

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */


class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}


public class M_Meeting_Rooms_2 {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;

        //step 1 :
        //sort intervals in ascending order based on the start time
        Arrays.sort(intervals,(Interval i1,Interval i2) ->{
            if(i1.start >= i2.start){
                return 1;
            }else{
                return -1;
            }
        });

        //this min heap will return the meeting which is ending first
        PriorityQueue<Interval> min_heap = new PriorityQueue<>(intervals.length,(Interval i1,Interval i2)->{
            if(i1.end >= i2.end){
                return 1;
            }else{
                return -1;
            }
        });

        //adding first meeting in min_heap
        min_heap.offer(intervals[0]);

        for(int i = 1; i < intervals.length ; i++){
            //getting the ongoing meeting
            Interval ongoing_meeting = min_heap.poll();
            //check whether new room is required or not
            if(ongoing_meeting.end <= intervals[i].start){
                ongoing_meeting.end = intervals[i].end;
            }else{
                min_heap.offer(intervals[i]);
            }
            min_heap.offer(ongoing_meeting);
        }

        return min_heap.size();
    }
}
