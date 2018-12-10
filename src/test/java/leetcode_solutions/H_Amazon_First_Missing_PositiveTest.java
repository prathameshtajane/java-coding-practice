package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class H_Amazon_First_Missing_PositiveTest {

    @Test
    @Tag("default test case 1")
    void firstMissingPositive1() {
        int[] input = {1,2,0};
        int expected_output = 3;
        H_Amazon_First_Missing_Positive testObj = new H_Amazon_First_Missing_Positive();
        Assert.assertEquals(expected_output,testObj.firstMissingPositive(input));
    }

    @Test
    @Tag("default test case 2")
    void firstMissingPositive2() {
        int[] input = {3,4,-1,1};
        int expected_output = 2;
        H_Amazon_First_Missing_Positive testObj = new H_Amazon_First_Missing_Positive();
        Assert.assertEquals(expected_output,testObj.firstMissingPositive(input));
    }

    @Test
    @Tag("default test case 3")
    void firstMissingPositive3() {
        int[] input = {7,8,9,11,12};
        int expected_output = 1;
        H_Amazon_First_Missing_Positive testObj = new H_Amazon_First_Missing_Positive();
        Assert.assertEquals(expected_output,testObj.firstMissingPositive(input));
    }

    @Test
    @Tag("default test case 4")
    void firstMissingPositive4() {
        int[] input = {};
        int expected_output = 1;
        H_Amazon_First_Missing_Positive testObj = new H_Amazon_First_Missing_Positive();
        Assert.assertEquals(expected_output,testObj.firstMissingPositive(input));
    }

    @Test
    @Tag("default test case 5")
    void firstMissingPositive5() {
        int[] input = {1};
        int expected_output = 2;
        H_Amazon_First_Missing_Positive testObj = new H_Amazon_First_Missing_Positive();
        Assert.assertEquals(expected_output,testObj.firstMissingPositive(input));
    }
}