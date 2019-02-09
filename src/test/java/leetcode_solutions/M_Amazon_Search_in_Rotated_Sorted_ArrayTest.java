package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class M_Amazon_Search_in_Rotated_Sorted_ArrayTest {

    M_Amazon_Search_in_Rotated_Sorted_Array testObj;

    @BeforeEach
    public void setter(){
        testObj = new M_Amazon_Search_in_Rotated_Sorted_Array();
    }

    @Test
    void binarySearch() {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        int expectedTargetIndex = 4;
        Assert.assertEquals(expectedTargetIndex,testObj.binarySearch(arr,0,arr.length-1,target));
    }

    @Test
    void search() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int expectedTargetIndex = 4;
        Assert.assertEquals(expectedTargetIndex,testObj.search(nums,target));
    }

    @Test
    void search2() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int expectedTargetIndex = -1;
        Assert.assertEquals(expectedTargetIndex,testObj.search(nums,target));
    }
}