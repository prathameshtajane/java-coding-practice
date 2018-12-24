package daily_coding_challenges;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob161_ReverseBitsTest {

    @Test
    void getReversedBitsInteger1() {
        Prob161_ReverseBits testObj = new Prob161_ReverseBits();
        int input = 11;
        int expectedOutput = 13;
        Assert.assertEquals(expectedOutput,testObj.getReversedBitsInteger(input));
    }

    @Test
    void getReversedBitsInteger2() {
        Prob161_ReverseBits testObj = new Prob161_ReverseBits();
        int input = 10;
        int expectedOutput = 5;
        Assert.assertEquals(expectedOutput,testObj.getReversedBitsInteger(input));
    }
}