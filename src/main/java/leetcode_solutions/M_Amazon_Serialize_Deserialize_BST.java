package leetcode_solutions;

/**
 *  449. Serialize and Deserialize BST
 *
 *  Serialization is the process of converting a data structure or object into a sequence of bits so that it can be
 *  stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in
 *  the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your
 * serialization/deserialization algorithm should work. You just need to ensure that a binary search tree can be
 * serialized to a string and this string can be deserialized to the original tree structure.
 *
 * The encoded string should be as compact as possible.
 *
 * Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms
 * should be stateless.
 *
 * link : https://leetcode.com/problems/serialize-and-deserialize-bst/description/
 */
    // todo : Serialize and Deserialize BST (incorrect logic)
public class M_Amazon_Serialize_Deserialize_BST {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder op_string = new StringBuilder();
        inOrderTraversal(root,op_string);
        return op_string.toString();
    }

    public void inOrderTraversal(TreeNode root, StringBuilder serialised_string){
        if(root != null){
            inOrderTraversal(root.left,serialised_string);
            serialised_string.append(root.val);
            serialised_string.append("-");
            inOrderTraversal(root.right,serialised_string);
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] serialised_string = data.split("-");
        return createBinaryTreeBasedOnIndexes(serialised_string,0,serialised_string.length-1);
    }

    public TreeNode createBinaryTreeBasedOnIndexes(String[] serialised_string,int start_index, int end_index){
        if(start_index > end_index){
            return null;
        }
        int mid = (start_index+end_index)/2;
        TreeNode root = new TreeNode(Integer.parseInt(serialised_string[mid]));
        root.left=createBinaryTreeBasedOnIndexes(serialised_string,start_index,mid-1);
        root.left=createBinaryTreeBasedOnIndexes(serialised_string,mid+1,end_index);
        return root;
    }

    // Your Codec object will be instantiated and called as such:
    // Codec codec = new Codec();
    // codec.deserialize(codec.serialize(root));
}
