package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_Amazon_Daily_TemperaturesTest {

    @Test
    void dailyTemperatures() {
        M_Amazon_Daily_Temperatures dailyTemperatures = new M_Amazon_Daily_Temperatures();
        int[] daily_temp_list = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] op_temp_list = {1, 1, 4, 2, 1, 1, 0, 0};
        Assert.assertArrayEquals("default test case",op_temp_list,dailyTemperatures.dailyTemperatures(daily_temp_list));
    }
}