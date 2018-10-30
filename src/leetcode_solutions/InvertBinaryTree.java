package leetcode_solutions;

/**
 * 226. Invert Binary tree
 * Link : https://leetcode.com/problems/invert-binary-tree/description/
 * Algorithm : https://www.youtube.com/watch?v=vdwcCIkLUQI
 * Recursive Algorithm
 */
public class InvertBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            invertTree(root.left);
            invertTree(root.right);

            //Actually swapping left and right node of given root node
            TreeNode tempNode = root.left;
            root.left=root.right;
            root.right=tempNode;
        }
        return root;
    }
}
