package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_Salesforce_Basic_Calculator_2Test {

    @Test
    void calculate1() {
        M_Salesforce_Basic_Calculator_2 testObj = new M_Salesforce_Basic_Calculator_2();
        String input = "3+2*2";
        int expectedOutput = 7;
        Assert.assertEquals(expectedOutput,testObj.calculate(input));
    }

    @Test
    void calculate2() {
        M_Salesforce_Basic_Calculator_2 testObj = new M_Salesforce_Basic_Calculator_2();
        String input = "3+2";
        int expectedOutput = 5;
        Assert.assertEquals(expectedOutput,testObj.calculate(input));
    }
}