package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E_Amazon_Valid_AnagramTest {

    E_Amazon_Valid_Anagram testObj;

    @BeforeEach
    void setUp() {
        testObj=new E_Amazon_Valid_Anagram();
    }

    @Test
    void isAnagram() {
        String s = "anagram";
        String t = "nagaram";
        Assert.assertTrue(testObj.isAnagram(s,t));
    }

    @Test
    void isAnagram2() {
        String s = "rat";
        String t = "car";
        Assert.assertFalse(testObj.isAnagram(s,t));
    }
}