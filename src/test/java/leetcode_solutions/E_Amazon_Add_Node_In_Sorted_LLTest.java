package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class E_Amazon_Add_Node_In_Sorted_LLTest {

    @Test
    void getNewLinkedList() {
        E_Amazon_Add_Node_In_Sorted_LL test_obj = new E_Amazon_Add_Node_In_Sorted_LL();
        Integer[] expected_arr = {1,2,3,4};
        E_Amazon_Add_Node_In_Sorted_LL.Node expected = test_obj.createLL(expected_arr);
        Assert.assertEquals(expected.val,test_obj.getNewLinkedList(test_obj.createLL(expected_arr),5).val);
    }
}