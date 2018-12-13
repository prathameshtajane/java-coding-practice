package dynamic_programming;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_Sub_Square_MatrixTest {

    @Test
    void getMaximumSubSquareMtrix() {
        int[][] inputMatrix = new int[][]{{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};
        int expectedOutput = 9;
        Maximum_Sub_Square_Matrix textObject= new Maximum_Sub_Square_Matrix();
        Assert.assertEquals(expectedOutput,textObject.getMaximumSubSquareMtrix(inputMatrix));
    }
}