package geeksforgeeks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_amazon_Trapping_Rain_WaterTest {

    @Test
    @DisplayName("default test case 1")
    void getTrappedWater() {
        int[] locations = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        M_amazon_Trapping_Rain_Water trapped_water = new M_amazon_Trapping_Rain_Water();
        assertEquals(6,trapped_water.getTrappedWater(locations));
    }

    @Test
    @DisplayName("default test case 2")
    void getTrappedWater2() {
        int[] locations = {3, 0, 0, 2, 0, 4};
        M_amazon_Trapping_Rain_Water trapped_water = new M_amazon_Trapping_Rain_Water();
        assertEquals(10,trapped_water.getTrappedWater(locations));
    }

    @Test
    @DisplayName("default test case 3")
    void getTrappedWater3() {
        int[] locations = {2, 0, 2};
        M_amazon_Trapping_Rain_Water trapped_water = new M_amazon_Trapping_Rain_Water();
        assertEquals(2,trapped_water.getTrappedWater(locations));
    }

    @Test
    @DisplayName("default edge test case 3")
    void getTrappedWater4() {
        int[] locations = {2, 0};
        M_amazon_Trapping_Rain_Water trapped_water = new M_amazon_Trapping_Rain_Water();
        assertEquals(0,trapped_water.getTrappedWater(locations));
    }

}