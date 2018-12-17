package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_Amazon_Compare_Version_NumbersTest {

    @Test
    void compareVersion() {
        M_Amazon_Compare_Version_Numbers testObj = new M_Amazon_Compare_Version_Numbers();
        String version1 = "0.1";
        String version2 = "1.1";
        int expectedOutput = -1;
        Assert.assertEquals(expectedOutput,testObj.compareVersion(version1,version2));
    }


    @Test
    void compareVersion2() {
        M_Amazon_Compare_Version_Numbers testObj = new M_Amazon_Compare_Version_Numbers();
        String version1 = "1.0.1";
        String version2 = "1";
        int expectedOutput = 1;
        Assert.assertEquals(expectedOutput,testObj.compareVersion(version1,version2));
    }

    @Test
    void compareVersion3() {
        M_Amazon_Compare_Version_Numbers testObj = new M_Amazon_Compare_Version_Numbers();
        String version1 = "7.5.2.4";
        String version2 = "7.5.3";
        int expectedOutput = -1;
        Assert.assertEquals(expectedOutput,testObj.compareVersion(version1,version2));
    }

    @Test
    void compareVersion4() {
        M_Amazon_Compare_Version_Numbers testObj = new M_Amazon_Compare_Version_Numbers();
        String version1 = "01";
        String version2 = "1";
        int expectedOutput = 0;
        Assert.assertEquals(expectedOutput,testObj.compareVersion(version1,version2));
    }

    @Test
    void compareVersion5() {
        M_Amazon_Compare_Version_Numbers testObj = new M_Amazon_Compare_Version_Numbers();
        String version1 = "02";
        String version2 = "1";
        int expectedOutput = 1;
            Assert.assertEquals(expectedOutput,testObj.compareVersion(version1,version2));
    }

    @Test
    void compareVersion6() {
        M_Amazon_Compare_Version_Numbers testObj = new M_Amazon_Compare_Version_Numbers();
        String version1 = "0.0.0";
        String version2 = "0.0.0";
        int expectedOutput = 0;
        Assert.assertEquals(expectedOutput,testObj.compareVersion(version1,version2));
    }
}