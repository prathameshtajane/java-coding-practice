package expedia_geeksforgeeks;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum testObj = new TwoSum();
        int[] input = {2, 7, 11, 15};
        int[] output={0,1};
        int target = 9;
        Assert.assertEquals(output[0],testObj.twoSum(input,target)[0]);
        Assert.assertEquals(output[1],testObj.twoSum(input,target)[1]);
    }

    @Test
    void twoSum2() {
        TwoSum testObj = new TwoSum();
        int[] input = {3,2,95,4,-3};
        int[] output={2,4};
        int target = 92;
        Assert.assertEquals(output[0],testObj.twoSum(input,target)[0]);
        Assert.assertEquals(output[1],testObj.twoSum(input,target)[1]);
    }
}