package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_House_Robber_2Test {

    @Test
    void maxSubsequence() {
        M_House_Robber_2 testObj = new M_House_Robber_2();
        int[] nums = new int[]{2,3,2};
        int expectedOutput = 4;
        Assert.assertEquals(expectedOutput,testObj.maxSubsequence(nums,0,nums.length-1));
    }

    @Test
    void rob() {
        M_House_Robber_2 testObj = new M_House_Robber_2();
        int[] nums = new int[]{2,3,2};
        int expectedOutput = 3;
        Assert.assertEquals(expectedOutput,testObj.rob(nums));
    }

    @Test
    void rob1() {
        M_House_Robber_2 testObj = new M_House_Robber_2();
        int[] nums = new int[]{1,2,3,1};
        int expectedOutput = 4;
        Assert.assertEquals(expectedOutput,testObj.rob(nums));
    }

    @Test
    void rob3() {
        M_House_Robber_2 testObj = new M_House_Robber_2();
        int[] nums = new int[]{2,3};
        int expectedOutput = 3;
        Assert.assertEquals(expectedOutput,testObj.rob(nums));
    }
}