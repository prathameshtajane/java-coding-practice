package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class H_Longest_Consecutive_SequenceTest {

    @Test
    void longestConsecutive() {
        H_Longest_Consecutive_Sequence testObj = new H_Longest_Consecutive_Sequence();
        int[] input = {100, 4, 200, 1, 3, 2};
        int expected_output = 4;
        Assert.assertEquals(expected_output,testObj.longestConsecutive(input));
    }

    @Test
    void longestConsecutive2() {
        H_Longest_Consecutive_Sequence testObj = new H_Longest_Consecutive_Sequence();
        int[] input = {};
        int expected_output = 0;
        Assert.assertEquals(expected_output,testObj.longestConsecutive(input));
    }

    @Test
    void longestConsecutive3() {
        H_Longest_Consecutive_Sequence testObj = new H_Longest_Consecutive_Sequence();
        int[] input = {100,1000};
        int expected_output = 1;
        Assert.assertEquals(expected_output,testObj.longestConsecutive(input));
    }

    @Test
    void longestConsecutive4() {
        H_Longest_Consecutive_Sequence testObj = new H_Longest_Consecutive_Sequence();
        int[] input = {2,1,6,9,4,3};
        int expected_output = 4;
        Assert.assertEquals(expected_output,testObj.longestConsecutive(input));
    }
}