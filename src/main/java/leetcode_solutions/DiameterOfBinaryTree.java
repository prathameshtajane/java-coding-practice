package leetcode_solutions;

/**
 * 543. Diameter of Binary tree
 * <p>
 * Question:
 * Given a binary tree, you need to compute the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 * <p>
 * Note:
 * The length of path between two nodes is represented by the number of edges between them.
 * <p>
 * Link :
 * https://leetcode.com/problems/diameter-of-binary-tree/description/
 * <p>
 * Algorithm :
 * Diameter of a binary tree is the maximum length of its
 *
 * Link :
 * https://www.youtube.com/watch?v=ey7DYc9OANo
 */
public class DiameterOfBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int findMaxDepth(TreeNode root) {
        //base condition
        if (root == null) {
            return 0;
        }
        int leftTreeMaxDepth = findMaxDepth(root.left);
        int rightTreeMaxDepth = findMaxDepth(root.right);
        return (leftTreeMaxDepth >= rightTreeMaxDepth) ? leftTreeMaxDepth + 1 : rightTreeMaxDepth + 1;
    }

    int diameterOfBinaryTree(TreeNode root) {
        //base condition
        if(root == null){
            return 0;
        }

        int leftTreeMaxHeight = findMaxDepth(root.left);
        int rightTreeMaxHeight = findMaxDepth(root.right);

        int leftTreeDiameter = diameterOfBinaryTree(root.left);
        int rightTreeDiameter = diameterOfBinaryTree(root.right);

        return Math.max((leftTreeMaxHeight+rightTreeMaxHeight),Math.max(leftTreeDiameter,rightTreeDiameter));
    }
}
