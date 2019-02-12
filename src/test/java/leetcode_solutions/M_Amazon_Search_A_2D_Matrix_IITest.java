package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_Amazon_Search_A_2D_Matrix_IITest {

    M_Amazon_Search_A_2D_Matrix_II testObj;

    @BeforeEach
    void setUp() {
        testObj=new M_Amazon_Search_A_2D_Matrix_II();
    }

    @Test
    void searchMatrix() {
        int[][] matrix = {{1,   4,  7, 11, 15},
                           {2,   5,  8, 12, 19},
                            {3,   6,  9, 16, 22},
                            {10, 13, 14, 17, 24},
                            {18, 21, 23, 26, 30}};
        int target = 5;
        Assert.assertTrue(testObj.searchMatrix(matrix,target));
    }

    @Test
    void searchMatrix2() {
        int[][] matrix = {{1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 20;
        Assert.assertFalse(testObj.searchMatrix(matrix,target));
    }

    @Test
    void searchMatrix3() {
        int[][] matrix = {};
        int target = 20;
        Assert.assertFalse(testObj.searchMatrix(matrix,target));
    }

    @Test
    void searchMatrix4() {
        int[][] matrix = {{1}};
        int target = 20;
        Assert.assertFalse(testObj.searchMatrix(matrix,target));
    }

    @Test
    void searchMatrix5() {
        int[][] matrix = {{20}};
        int target = 20;
        Assert.assertTrue(testObj.searchMatrix(matrix,target));
    }
}