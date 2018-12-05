package leetcode_solutions;

/**
 * 101. Symmetric tree
 * Link : https://leetcode.com/problems/symmetric-tree/description/
 * <p>
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 */
public class SymmetricTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.val = data;
        }
    }

    public boolean isSymmetricTree(TreeNode leftNode, TreeNode rightNode) {
        //base condition
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if(leftNode != null && rightNode != null){
            if (leftNode.val == rightNode.val && isSymmetricTree(leftNode.left, rightNode.right) && isSymmetricTree(leftNode.right, rightNode.left)) {
                return true;
            }
        }
        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        if (root.left != null && root.right != null) {
            if (root.left.val == root.right.val) {
                return isSymmetricTree(root.left, root.right);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println("101. Symmetric tree");
    }
}
