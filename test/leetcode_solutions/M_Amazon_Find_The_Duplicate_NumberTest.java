package leetcode_solutions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class M_Amazon_Find_The_Duplicate_NumberTest {

    @Test
    @DisplayName("default test case 1")
    void findDuplicate() throws Exception {
        M_Amazon_Find_The_Duplicate_Number test = new M_Amazon_Find_The_Duplicate_Number();
        int[] input_list = {1,3,4,2,2};
        int duplicate_num = 2;
        assertEquals(duplicate_num,test.findDuplicate(input_list));
    }

    @Test
    @DisplayName("default test case 2")
    void findDuplicate2() throws Exception {
        M_Amazon_Find_The_Duplicate_Number test = new M_Amazon_Find_The_Duplicate_Number();
        int[] input_list = {3,1,3,4,2};
        int duplicate_num = 3;
        assertEquals(duplicate_num,test.findDuplicate(input_list));
    }
}