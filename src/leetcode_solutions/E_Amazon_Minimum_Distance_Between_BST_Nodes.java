package leetcode_solutions;


import java.util.ArrayList;
import java.util.List;

/**
 * 783. Minimum Distance Between BST Nodes
 *
 * Given a Binary Search Tree (BST) with the root node root, return the minimum difference between the values of any two different nodes in the tree.
 *
 * Example :
 *
 * Input: root = [4,2,6,1,3,null,null]
 * Output: 1
 * Explanation:
 * Note that root is a TreeNode object, not an array.
 *
 * The given tree [4,2,6,1,3,null,null] is represented by the following diagram:
 *
 *           4
 *         /   \
 *       2      6
 *      / \
 *     1   3
 *
 * while the minimum difference in this tree is 1, it occurs between node 1 and node 2, also between node 3 and node 2.
 * Note:
 *
 * The size of the BST will be between 2 and 100.
 * The BST is always valid, each node's value is an integer, and each node's value is different.
 *
 * link : https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/
 */
public class E_Amazon_Minimum_Distance_Between_BST_Nodes {

    static List<Integer> collector_list = new ArrayList<>();
    static int min_diff = Integer.MAX_VALUE;

    private static int minDiffInBST(TreeNode root) {
        inorderTravesal(root);
        return min_diff;
    }

    private static void inorderTravesal(TreeNode root){
        if(root != null){
            inorderTravesal(root.left);
            collector_list.add(root.val);
            if(collector_list.size()>1){
                min_diff = (min_diff > Math.abs(collector_list.get(collector_list.size()-1)-collector_list.get(collector_list.size()-2))) ? Math.abs(collector_list.get(collector_list.size()-1)-collector_list.get(collector_list.size()-2)):min_diff;
            }
            inorderTravesal(root.right);
        }
    }

    public static void main(String[] args) {
        System.out.println("783. Minimum Distance Between BST Nodes");
//        TreeNode root=new TreeNode(4);
//        root.left=new TreeNode(2);
//        root.right=new TreeNode(6);
//        root.left.left=new TreeNode(1);
//        root.left.right=new TreeNode(3);
//        System.out.println(minDiffInBST(root));

        TreeNode root1 = new TreeNode(27);
        root1.right=new TreeNode(34);
        root1.right.right=new TreeNode(58);
        root1.right.right.left=new TreeNode(50);
        root1.right.right.left.left=new TreeNode(44);
        System.out.println(minDiffInBST(root1));

    }
}