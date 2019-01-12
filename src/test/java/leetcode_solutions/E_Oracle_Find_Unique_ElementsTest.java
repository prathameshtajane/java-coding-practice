package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class E_Oracle_Find_Unique_ElementsTest {

    @Test
    void getListOfUniqueCharacters() {
        String input = "aaabc";
        String expectedOutput = "bc";
        E_Oracle_Find_Unique_Elements testObj = new E_Oracle_Find_Unique_Elements();
        Assert.assertEquals(expectedOutput,testObj.getListOfUniqueCharacters(input));
    }

    @Test
    void getListOfUniqueCharacter2() {
        String input = "aaabbcc";
        String expectedOutput = "";
        E_Oracle_Find_Unique_Elements testObj = new E_Oracle_Find_Unique_Elements();
        Assert.assertEquals(expectedOutput,testObj.getListOfUniqueCharacters(input));
    }

    @Test
    void getListOfUniqueCharacter3() {
        String input = null;
        String expectedOutput = null;
        E_Oracle_Find_Unique_Elements testObj = new E_Oracle_Find_Unique_Elements();
        Assert.assertEquals(expectedOutput,testObj.getListOfUniqueCharacters(input));
    }

    @Test
    void getListOfUniqueCharacter4() {
        String input = "a";
        String expectedOutput = "a";
        E_Oracle_Find_Unique_Elements testObj = new E_Oracle_Find_Unique_Elements();
        Assert.assertEquals(expectedOutput,testObj.getListOfUniqueCharacters(input));
    }
}