package leetcode_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 257. Binary tree Paths
 *
 * Given a binary tree, return all root-to-leaf paths.
 * <p>
 *
 * Algo Link :
 * https://www.youtube.com/watch?v=zIkDfgFAg60
 *
 * Leetcode Link :
 * https://leetcode.com/problems/binary-tree-paths/description/
 *
 */
public class AllBinaryPath {
    public Stack<Integer> stack = new Stack<>();
    public List<String> opStringList = new ArrayList<>();

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void processArray(Stack<Integer> stk) {
        String tempString = "\"";
        for (int i = 0; i < stk.size(); i++) {
            tempString = tempString + (String.valueOf(stk.get(i)));
            tempString = tempString + "->";
        }
        tempString = tempString.substring(0, (tempString.length() - 2));
        tempString = tempString + "\"";
        opStringList.add(tempString);
    }

    public void InOrderTraversal(TreeNode root) {
        //base condition
        if (root == null) {
            return;
        }
        stack.push(root.val);
        InOrderTraversal(root.left);
        if (root.left == null && root.right == null) {
            processArray(stack);
        }
        InOrderTraversal(root.right);
        stack.pop();
    }

    public void testFunction() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        InOrderTraversal(root);
        System.out.println(Arrays.asList(opStringList).toString());
    }

    public static void main(String args[]) {
        AllBinaryPath test = new AllBinaryPath();
        test.testFunction();
    }
}
