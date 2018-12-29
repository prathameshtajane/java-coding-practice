package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void optimalMerge1() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        int[] expectedNums1 = new int[]{1,2,2,3,5,6};
        MergeSortedArray testObj = new MergeSortedArray();
        testObj.optimalMerge(nums1,m,nums2,n);
        Assert.assertArrayEquals(expectedNums1,nums1);
    }

    @Test
    void optimalMerge2() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{4,5,6};
        int n = 3;
        int[] expectedNums1 = new int[]{1,2,3,4,5,6};
        MergeSortedArray testObj = new MergeSortedArray();
        testObj.optimalMerge(nums1,m,nums2,n);
        Assert.assertArrayEquals(expectedNums1,nums1);
    }

    @Test
    void optimalMerge3() {
        int[] nums1 = new int[]{1,0,0};
        int m = 1;
        int[] nums2 = new int[]{4,5};
        int n = 2;
        int[] expectedNums1 = new int[]{1,4,5};
        MergeSortedArray testObj = new MergeSortedArray();
        testObj.optimalMerge(nums1,m,nums2,n);
        Assert.assertArrayEquals(expectedNums1,nums1);
    }
}