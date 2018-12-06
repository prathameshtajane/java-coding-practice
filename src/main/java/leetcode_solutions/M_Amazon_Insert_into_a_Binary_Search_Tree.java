package leetcode_solutions;

/**
 * 701. Insert into a Binary Search Tree
 *
 * Given the root node of a binary search tree (BST) and a value to be inserted into the tree, insert the value into the BST. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
 *
 * Note that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.
 *
 * For example,
 *
 * Given the tree:
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 * And the value to insert: 5
 * You can return this binary search tree:
 *
 *          4
 *        /   \
 *       2     7
 *      / \   /
 *     1   3 5
 * This tree is also valid:
 *
 *          5
 *        /   \
 *       2     7
 *      / \
 *     1   3
 *          \
 *           4
 *
 * link : https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
 */
public class M_Amazon_Insert_into_a_Binary_Search_Tree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    public void insertIntoBSTUtil(TreeNode root, int val) {
        if(root.val > val && root.left != null){
            insertIntoBST(root.left,val);
        }else if(root.val < val && root.right != null){
            insertIntoBST(root.right,val);
        }else if(root.val >= val){
            root.left=new TreeNode(val);
        }else if(root.val < val){
            root.right=new TreeNode(val);
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        insertIntoBSTUtil(root,val);
        return root;
    }

}
