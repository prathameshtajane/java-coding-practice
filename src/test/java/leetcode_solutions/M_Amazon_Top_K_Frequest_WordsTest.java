package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class M_Amazon_Top_K_Frequest_WordsTest {

    @Test
    @Tag("Default test case 1")
    void topKFrequent() {
        String[] input_list = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> expected = Arrays.asList(new String[]{"i", "love"});
        M_Amazon_Top_K_Frequest_Words textObj = new M_Amazon_Top_K_Frequest_Words();
        Assert.assertEquals(expected,textObj.topKFrequent(input_list,k));
    }

    @Test
    @Tag("Default test case 2")
    void topKFrequent2() {
        String[] input_list = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> expected = Arrays.asList(new String[]{"the", "is", "sunny", "day"});
        M_Amazon_Top_K_Frequest_Words textObj = new M_Amazon_Top_K_Frequest_Words();
        Assert.assertEquals(expected,textObj.topKFrequent(input_list,k));
    }
}