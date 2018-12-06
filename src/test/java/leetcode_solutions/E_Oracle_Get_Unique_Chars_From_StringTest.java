package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class E_Oracle_Get_Unique_Chars_From_StringTest {

    @Test
    @Tag("default test case 1")
    void getUniqueCharsFromString() {
        E_Oracle_Get_Unique_Chars_From_String unique_char_test = new E_Oracle_Get_Unique_Chars_From_String();
        String input = "abbc";
        List<String> expected = new ArrayList<>(Arrays.asList(new String[]{"a", "c"}));
        Assert.assertEquals(expected,unique_char_test.getUniqueCharsFromString(input));
    }

    @Test
    @Tag("default test case 2")
    void getUniqueCharsFromStrin2() {
        E_Oracle_Get_Unique_Chars_From_String unique_char_test = new E_Oracle_Get_Unique_Chars_From_String();
        String input = "abc";
        List<String> expected = new ArrayList<>(Arrays.asList(new String[]{"a", "b","c"}));
        Assert.assertEquals(expected,unique_char_test.getUniqueCharsFromString(input));
    }
}