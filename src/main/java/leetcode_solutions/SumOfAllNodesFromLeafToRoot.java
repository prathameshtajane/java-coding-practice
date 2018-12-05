package leetcode_solutions;

/**
 * Find sum of all nodes from leaf to root
 */

public class SumOfAllNodesFromLeafToRoot {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int inOrderSummation(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftTreeSum = inOrderSummation(root.left);
        int rightTreeSum = inOrderSummation(root.right);
        return root.val+leftTreeSum + rightTreeSum;
    }

    int testFunction(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        return inOrderSummation(root);
    }

    public static void main(String args[]) {
        SumOfAllNodesFromLeafToRoot s = new SumOfAllNodesFromLeafToRoot();
        System.out.println(s.testFunction());
    }
}
