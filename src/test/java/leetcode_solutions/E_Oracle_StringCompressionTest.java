package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E_Oracle_StringCompressionTest {

    @Test
    void getCompressesdString1() {
        E_Oracle_StringCompression testObj = new E_Oracle_StringCompression();
        String input = "abcccd";
        String expectedOutput = "abc3d";
        Assert.assertEquals(expectedOutput,testObj.getCompressesdString(input));
    }

    @Test
    void getCompressesdString2() {
        E_Oracle_StringCompression testObj = new E_Oracle_StringCompression();
        String input = "abcccdd";
        String expectedOutput = "abc3d2";
        Assert.assertEquals(expectedOutput,testObj.getCompressesdString(input));
    }

    @Test
    void getCompressesdString3() {
        E_Oracle_StringCompression testObj = new E_Oracle_StringCompression();
        String input = "abcccddeeeeea";
        String expectedOutput = "abc3d2e5a";
        Assert.assertEquals(expectedOutput,testObj.getCompressesdString(input));
    }

    @Test
    void getCompressesdString4() {
        E_Oracle_StringCompression testObj = new E_Oracle_StringCompression();
        String input = "ab";
        String expectedOutput = "ab";
        Assert.assertEquals(expectedOutput,testObj.getCompressesdString(input));
    }

    @Test
    void getCompressesdString5() {
        E_Oracle_StringCompression testObj = new E_Oracle_StringCompression();
        String input = "aa";
        String expectedOutput = "a2";
        Assert.assertEquals(expectedOutput,testObj.getCompressesdString(input));
    }

    @Test
    void getCompressesdString6() {
        E_Oracle_StringCompression testObj = new E_Oracle_StringCompression();
        String input = "a";
        String expectedOutput = "a";
        Assert.assertEquals(expectedOutput,testObj.getCompressesdString(input));
    }

    @Test
    void getCompressesdString7() {
        E_Oracle_StringCompression testObj = new E_Oracle_StringCompression();
        String input = "";
        String expectedOutput = "";
        Assert.assertEquals(expectedOutput,testObj.getCompressesdString(input));
    }
}