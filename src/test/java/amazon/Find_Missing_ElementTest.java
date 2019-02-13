package amazon;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Find_Missing_ElementTest {

    Find_Missing_Element testObj;
    @BeforeEach
    void setUp() {
        testObj=new Find_Missing_Element();
    }

    @Test
    void getMissingElement() {
        int[] srcArr = {5,4,2,3,1};
        int[] destArr = {5,4,3,1};
        int expectedMissingElement = 2;
        Assert.assertEquals(expectedMissingElement,testObj.getMissingElement(srcArr,destArr));
    }

    @Test
    void getMissingElemen2() {
        int[] srcArr = {5,4,2,3,1};
        int[] destArr = {5,3,1,2};
        int expectedMissingElement = 4;
        Assert.assertEquals(expectedMissingElement,testObj.getMissingElement(srcArr,destArr));
    }
}