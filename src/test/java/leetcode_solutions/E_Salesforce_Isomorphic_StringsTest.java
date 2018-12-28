package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E_Salesforce_Isomorphic_StringsTest {

    @Test
    void isIsomorphic1() {
        E_Salesforce_Isomorphic_Strings testObj = new E_Salesforce_Isomorphic_Strings();
        String s = "egg";
        String t = "add";
        Assert.assertTrue(testObj.isIsomorphic(s,t));
    }

    @Test
    void isIsomorphic2() {
        E_Salesforce_Isomorphic_Strings testObj = new E_Salesforce_Isomorphic_Strings();
        String s = "paper";
        String t = "title";
        Assert.assertTrue(testObj.isIsomorphic(s,t));
    }

    @Test
    void isIsomorphic3() {
        E_Salesforce_Isomorphic_Strings testObj = new E_Salesforce_Isomorphic_Strings();
        String s = "foo";
        String t = "bar";
        Assert.assertFalse(testObj.isIsomorphic(s,t));
    }
}