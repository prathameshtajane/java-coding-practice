package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E_Amazon_Kth_Largest_Element_in_a_StreamTest {

    @Test
    void add1() {
        int[]input = {4,5,8,2};
        int k = 3;
        E_Amazon_Kth_Largest_Element_in_a_Stream kthLargest = new E_Amazon_Kth_Largest_Element_in_a_Stream(k,input);
        Assert.assertEquals(4,kthLargest.add(3));
        Assert.assertEquals(5,kthLargest.add(5));
        Assert.assertEquals(5,kthLargest.add(10));
        Assert.assertEquals(8,kthLargest.add(9));
        Assert.assertEquals(8,kthLargest.add(4));
    }
}