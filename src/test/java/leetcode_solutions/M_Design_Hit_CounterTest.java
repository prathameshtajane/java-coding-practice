package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_Design_Hit_CounterTest {

    @Test
    void hit() {
        M_Design_Hit_Counter testObj = new M_Design_Hit_Counter();
        testObj.hit(1);
        testObj.hit(2);
        testObj.hit(3);
        Assert.assertEquals(testObj.getHits(4),3);
    }

    @Test
    void hit2() {
        M_Design_Hit_Counter testObj = new M_Design_Hit_Counter();
        testObj.hit(1);
        testObj.hit(301);
        testObj.hit(3);
        testObj.hit(3);
        Assert.assertEquals(3,testObj.getHits(4));
    }
}