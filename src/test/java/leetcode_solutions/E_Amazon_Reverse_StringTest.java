package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E_Amazon_Reverse_StringTest {

    @Test
    void reverseString() {
        E_Amazon_Reverse_String testObj = new E_Amazon_Reverse_String();
        String input = "hello";
        String expectedOutput = "olleh";
        Assert.assertEquals(expectedOutput,testObj.reverseString(input));
    }

    @Test
    void reverseString2() {
        E_Amazon_Reverse_String testObj = new E_Amazon_Reverse_String();
        String input = "A man, a plan, a canal: Panama";
        String expectedOutput = "amanaP :lanac a ,nalp a ,nam A";
        Assert.assertEquals(expectedOutput,testObj.reverseString(input));
    }

    @Test
    void reverseString3() {
        E_Amazon_Reverse_String testObj = new E_Amazon_Reverse_String();
        String input = "A";
        String expectedOutput = "A";
        Assert.assertEquals(expectedOutput,testObj.reverseString(input));
    }
}