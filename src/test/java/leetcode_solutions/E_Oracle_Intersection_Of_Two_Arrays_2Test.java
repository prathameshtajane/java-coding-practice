package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E_Oracle_Intersection_Of_Two_Arrays_2Test {

    @Test
    void intersect() {
        E_Oracle_Intersection_Of_Two_Arrays_2 testObj = new E_Oracle_Intersection_Of_Two_Arrays_2();
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] expectedOutput = {2,2};
        Assert.assertArrayEquals(expectedOutput,testObj.intersect(num1,num2));
    }


    @Test
    void intersect2() {
        E_Oracle_Intersection_Of_Two_Arrays_2 testObj = new E_Oracle_Intersection_Of_Two_Arrays_2();
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        int[] expectedOutput = {9,4};
        Assert.assertArrayEquals(expectedOutput,testObj.intersect(num1,num2));
    }
}