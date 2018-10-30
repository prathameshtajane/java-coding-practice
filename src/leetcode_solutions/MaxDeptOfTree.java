package leetcode_solutions;

/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */


// Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class MaxDeptOfTree {
    public int maxDepth(TreeNode root) {

        //base condition
        if(root == null){
            return 0;
        }

        int leftMaxHeight = maxDepth(root.left);
        int rightMaxHeight = maxDepth(root.right);

        if(leftMaxHeight > rightMaxHeight){
            return leftMaxHeight+1;
        }else {
            return rightMaxHeight+1;
        }
    }
}
