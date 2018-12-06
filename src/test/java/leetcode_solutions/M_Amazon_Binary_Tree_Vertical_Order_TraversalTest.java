package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class M_Amazon_Binary_Tree_Vertical_Order_TraversalTest {

    @Test
    @Tag("default test case 1")
    void verticalOrder() {
        M_Amazon_Binary_Tree_Vertical_Order_Traversal vtravesal = new M_Amazon_Binary_Tree_Vertical_Order_Traversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
//        int[] expected_output = {9,3,15,20,7};
        List<Integer> expected_output_list = Arrays.asList(9,3,15,20,7);
        List<Integer> calculated_output_list = vtravesal.verticalOrder(root).stream().flatMap(Collection::stream).collect(Collectors.toList());
        Assert.assertEquals(expected_output_list,calculated_output_list);
    }
}