package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_Amazon_Integer_to_RomanTest {


    private M_Amazon_Integer_to_Roman testObj;

    @BeforeEach
    private void setter(){
        testObj=new M_Amazon_Integer_to_Roman();
    }

    @Test
    void intToRoman() {
        int inputNum = 5;
        String outputRomanNumberString = "V";
        Assert.assertEquals("Convert to roman 5",outputRomanNumberString,testObj.intToRoman(inputNum));
    }

    @Test
    void intToRoman2() {
        int inputNum = 3;
        String outputRomanNumberString = "III";
        Assert.assertEquals("Convert to roman 3",outputRomanNumberString,testObj.intToRoman(inputNum));
    }

    @Test
    void intToRoman3() {
        int inputNum = 9;
        String outputRomanNumberString = "IX";
        Assert.assertEquals("Convert to roman 9",outputRomanNumberString,testObj.intToRoman(inputNum));
    }

    @Test
    void intToRoman4() {
        int inputNum = 58;
        String outputRomanNumberString = "LVIII";
        Assert.assertEquals("Convert to roman 58",outputRomanNumberString,testObj.intToRoman(inputNum));
    }

    @Test
    void intToRoman5() {
        int inputNum = 1994;
        String outputRomanNumberString = "MCMXCIV";
        Assert.assertEquals("Convert to roman 1994",outputRomanNumberString,testObj.intToRoman(inputNum));
    }

}