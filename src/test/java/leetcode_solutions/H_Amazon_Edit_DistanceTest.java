package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class H_Amazon_Edit_DistanceTest {

    @Test
    void minDistance1() {
        String word1="horse";
        String word2="ros";
        int expectedOp = 3;
        H_Amazon_Edit_Distance testObj = new H_Amazon_Edit_Distance();
        Assert.assertEquals(expectedOp,testObj.minDistance(word1,word2));
    }

    @Test
    void minDistance2() {
        String word1="intention";
        String word2="execution";
        int expectedOp = 5;
        H_Amazon_Edit_Distance testObj = new H_Amazon_Edit_Distance();
        Assert.assertEquals(expectedOp,testObj.minDistance(word1,word2));
    }

    @Test
    void minDistance3() {
        String word1="";
        String word2="";
        int expectedOp = 0;
        H_Amazon_Edit_Distance testObj = new H_Amazon_Edit_Distance();
        Assert.assertEquals(expectedOp,testObj.minDistance(word1,word2));
    }

    @Test
    void minDistance4() {
        String word1="a";
        String word2="b";
        int expectedOp = 1;
        H_Amazon_Edit_Distance testObj = new H_Amazon_Edit_Distance();
        Assert.assertEquals(expectedOp,testObj.minDistance(word1,word2));
    }
}