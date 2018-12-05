package daily_coding_challenges;

/*
    This problem was asked by Facebook.

    Given a binary tree, return the level of the tree with minimum sum.

    Algorithm :

    Time Complexity : O(n)

    step 1 - variation of level order traversal.

 */

import java.util.ArrayList;
import java.util.List;

public class Prob117_LevelWithMinSumInBT {
    static int temp_min_sum = 0;
    static int global_min_sum = Integer.MAX_VALUE;
    static int global_min_level = Integer.MAX_VALUE;
    static int local_min_level = Integer.MAX_VALUE;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    private static int levelOrderTraversal(TreeNode root) {
        //edge case
        if (root == null) {
            return -1;
        }

        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        queue.add(null);
        local_min_level = 0;

        while (!queue.isEmpty()) {
            TreeNode temp_node = queue.get(0);
            queue.remove(0);
            if (temp_node == null && queue.isEmpty()) {
                if (global_min_sum > temp_min_sum) {
                    global_min_sum = temp_min_sum;
                    global_min_level = local_min_level;
                }
                return global_min_level;
            } else if (temp_node == null) {
                if (global_min_sum > temp_min_sum) {
                    global_min_sum = temp_min_sum;
                    global_min_level = local_min_level;
                }
                ++local_min_level;
                temp_min_sum = 0;
                queue.add(null);
            } else {
                temp_min_sum = temp_min_sum + temp_node.val;
                if (temp_node.left != null) {
                    queue.add(temp_node.left);
                }
                if (temp_node.right != null) {
                    queue.add(temp_node.right);
                }
            }
        }
        return global_min_level;
    }

    public static void main(String[] args) {

        System.out.println("Prob117_LevelWithMinSumInBT");
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(3);
        rootNode.left.left = new TreeNode(-4);
        rootNode.left.right = new TreeNode(-5);
        rootNode.right.left = new TreeNode(-6);
        rootNode.right.right = new TreeNode(-7);
        System.out.println(levelOrderTraversal(rootNode));
    }
}
