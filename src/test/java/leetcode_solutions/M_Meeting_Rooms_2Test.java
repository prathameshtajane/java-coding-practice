package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_Meeting_Rooms_2Test {


    @Test
    void minMeetingRooms() {
        Interval i1 = new Interval(0,30);
        Interval i2 = new Interval(5,10);
        Interval i3 = new Interval(15,20);
        Interval[] intervals = {i1,i2,i3};
        int expected_min_required_meeting_rooms = 2;
        M_Meeting_Rooms_2 testObj= new M_Meeting_Rooms_2();
        Assert.assertEquals(expected_min_required_meeting_rooms,testObj.minMeetingRooms(intervals));
    }

    @Test
    void minMeetingRooms2() {
        Interval i1 = new Interval(7,10);
        Interval i2 = new Interval(2,4);
        Interval[] intervals = {i1,i2};
        int expected_min_required_meeting_rooms = 1;
        M_Meeting_Rooms_2 testObj= new M_Meeting_Rooms_2();
        Assert.assertEquals(expected_min_required_meeting_rooms,testObj.minMeetingRooms(intervals));
    }
}