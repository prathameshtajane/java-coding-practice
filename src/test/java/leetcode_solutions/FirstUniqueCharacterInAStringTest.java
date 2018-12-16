package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {

    @Test
    void firstUniqCharOptimal() {
        FirstUniqueCharacterInAString testObj = new FirstUniqueCharacterInAString();
        String input = "leetcode";
        int expectedOutput = 0;
        Assert.assertEquals(expectedOutput,testObj.firstUniqCharOptimal(input));
    }

    @Test
    void firstUniqCharOptimal2() {
        FirstUniqueCharacterInAString testObj = new FirstUniqueCharacterInAString();
        String input = "loveleetcode";
        int expectedOutput = 2;
        Assert.assertEquals(expectedOutput,testObj.firstUniqCharOptimal(input));
    }

    @Test
    void firstUniqCharOptimal3() {
        FirstUniqueCharacterInAString testObj = new FirstUniqueCharacterInAString();
        String input = "aabbccdd";
        int expectedOutput = -1;
        Assert.assertEquals(expectedOutput,testObj.firstUniqCharOptimal(input));
    }

    @Test
    void firstUniqCharOptimal4() {
        FirstUniqueCharacterInAString testObj = new FirstUniqueCharacterInAString();
        String input = "Leetcode";
        int expectedOutput = 0;
        Assert.assertEquals(expectedOutput,testObj.firstUniqCharOptimal(input));
    }

    @Test
    void firstUniqCharOptimal5() {
        FirstUniqueCharacterInAString testObj = new FirstUniqueCharacterInAString();
        String input = "";
        int expectedOutput = -1;
        Assert.assertEquals(expectedOutput,testObj.firstUniqCharOptimal(input));
    }

    @Test
    void firstUniqCharOptimal6() {
        FirstUniqueCharacterInAString testObj = new FirstUniqueCharacterInAString();
        String input = "a";
        int expectedOutput = 0;
        Assert.assertEquals(expectedOutput,testObj.firstUniqCharOptimal(input));
    }
}