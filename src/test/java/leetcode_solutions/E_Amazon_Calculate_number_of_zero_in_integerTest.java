package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E_Amazon_Calculate_number_of_zero_in_integerTest {

    private E_Amazon_Calculate_number_of_zero_in_integer testObj;

    @BeforeEach
    void setUp() {
        testObj = new E_Amazon_Calculate_number_of_zero_in_integer();
    }

    @Test
    void getNumberOfZerosInInteger() {
        int number = 100;
        int expectedZeroCount = 2;
        Assert.assertEquals(expectedZeroCount,testObj.getNumberOfZerosInInteger(number));
    }

    @Test
    void getNumberOfZerosInInteger2() {
        int number = -100;
        int expectedZeroCount = 2;
        Assert.assertEquals(expectedZeroCount,testObj.getNumberOfZerosInInteger(number));
    }

    @Test
    void getNumberOfZerosInInteger3() {
        int number = -100110;
        int expectedZeroCount = 3;
        Assert.assertEquals(expectedZeroCount,testObj.getNumberOfZerosInInteger(number));
    }

    @Test
    void getNumberOfZerosInInteger4() {
        int number = 1112;
        int expectedZeroCount = 0;
        Assert.assertEquals(expectedZeroCount,testObj.getNumberOfZerosInInteger(number));
    }
}