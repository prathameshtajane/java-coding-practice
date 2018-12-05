package leetcode_solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M_Amazon_Serialize_Deserialize_BSTTest {



    @Test
    void serialize() {
        TreeNode root = new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(11);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(6);
        M_Amazon_Serialize_Deserialize_BST test = new M_Amazon_Serialize_Deserialize_BST();
        String expected_string = "4-5-6-10-11-";
        assertEquals(expected_string,test.serialize(root));
    }

//    @Test
//    void deserialize() {
//        TreeNode root = new TreeNode(10);
//        root.left=new TreeNode(5);
//        root.right=new TreeNode(11);
//        root.left.left=new TreeNode(4);
//        root.left.right=new TreeNode(6);
//        M_Amazon_Serialize_Deserialize_BST test = new M_Amazon_Serialize_Deserialize_BST();
//        String expected_string = "4-5-6-10-11-";
//        assertEquals(root.val,test.deserialize(expected_string).val);
//    }
}