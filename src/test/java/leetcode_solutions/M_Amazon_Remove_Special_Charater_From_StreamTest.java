package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_Amazon_Remove_Special_Charater_From_StreamTest {

    private M_Amazon_Remove_Special_Charater_From_Stream testObj;

    @BeforeEach
    void setUp() {
        testObj = new M_Amazon_Remove_Special_Charater_From_Stream();
    }

    @Test
    void getStreamWithoutTargetChar() {
        String inputStream = "g  eeks   for ge  eeks  ";
        char target = ' ';
        String expectedOutputString = "geeksforgeeeks";
        Assert.assertEquals("remove spaces from string",
                            expectedOutputString,
                            testObj.getStreamWithoutTargetChar(inputStream,target));
    }

    @Test
    void getStreamWithoutTargetChar2() {
        String inputStream = "Prathamesh%Tajane";
        char target = '%';
        String expectedOutputString = "PrathameshTajane";
        Assert.assertEquals("remove % from string",
                expectedOutputString,
                testObj.getStreamWithoutTargetChar(inputStream,target));
    }

    @Test
    void getStreamWithoutTargetChar3() {
        String inputStream = "Prathamesh%Tajane";
        char target = ' ';
        String expectedOutputString = "Prathamesh%Tajane";
        Assert.assertEquals("remove space from string with no spaces",
                expectedOutputString,
                testObj.getStreamWithoutTargetChar(inputStream,target));
    }
}