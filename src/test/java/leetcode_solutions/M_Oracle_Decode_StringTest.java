package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_Oracle_Decode_StringTest {

    @Test
    void decodeString1() {
        String input = "3[a]2[bc]";
        String expectedOutput = "aaabcbc";
        M_Oracle_Decode_String testObj = new M_Oracle_Decode_String();
        Assert.assertEquals(expectedOutput,testObj.decodeString(input));
    }

    @Test
    void decodeString2() {
        String input = "3[a2[c]]";
        String expectedOutput = "accaccacc";
        M_Oracle_Decode_String testObj = new M_Oracle_Decode_String();
        Assert.assertEquals(expectedOutput,testObj.decodeString(input));
    }

    @Test
    void decodeString3() {
        String input = "2[abc]3[cd]ef";
        String expectedOutput = "abcabccdcdcdef";
        M_Oracle_Decode_String testObj = new M_Oracle_Decode_String();
        Assert.assertEquals(expectedOutput,testObj.decodeString(input));
    }

    @Test
    void decodeString4() {
        String input = "a";
        String expectedOutput = "a";
        M_Oracle_Decode_String testObj = new M_Oracle_Decode_String();
        Assert.assertEquals(expectedOutput,testObj.decodeString(input));
    }

    @Test
    void decodeString5() {
        String input = "5[a]";
        String expectedOutput = "aaaaa";
        M_Oracle_Decode_String testObj = new M_Oracle_Decode_String();
        Assert.assertEquals(expectedOutput,testObj.decodeString(input));
    }

//    @Test
//    void decodeString6() {
//        String input = "100[leetcode]";
//        String expectedOutput = "";
//        M_Oracle_Decode_String testObj = new M_Oracle_Decode_String();
//        Assert.assertEquals(expectedOutput,testObj.decodeString(input));
//    }


}