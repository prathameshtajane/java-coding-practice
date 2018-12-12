package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class H_Oracle_Find_Median_from_Data_StreamTest {

    @Test
    //single value
    void findMedian1() {
        H_Oracle_Find_Median_from_Data_Stream testObj = new H_Oracle_Find_Median_from_Data_Stream();
        testObj.addNum(1);
        Assert.assertEquals(1.0d,testObj.findMedian(),0.0);
    }

    @Test
    void findMedian2() {
        H_Oracle_Find_Median_from_Data_Stream testObj = new H_Oracle_Find_Median_from_Data_Stream();
        testObj.addNum(1);
        testObj.addNum(2);
        Assert.assertEquals(1.5,testObj.findMedian(),0.0);
    }

    @Test
    void findMedian3() {
        H_Oracle_Find_Median_from_Data_Stream testObj = new H_Oracle_Find_Median_from_Data_Stream();
        testObj.addNum(1);
        testObj.addNum(2);
        testObj.addNum(3);
        testObj.addNum(4);
        Assert.assertEquals(2.5,testObj.findMedian(),0.0);
    }
}