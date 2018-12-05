package leetcode_solutions;

import java.util.*;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its level order traversal as:
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * <p>
 * <p>
 * Link : https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 */
public class Binary_Tree_Level_Order_Traversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static TreeNode createBinaryTree(int[] sortedIntegersArray,int leftIndex,int rightIndex){
        //base case for recursion
        if(leftIndex > rightIndex){
            return null;
        }

        int mid = (leftIndex+rightIndex)/2;
        TreeNode root = new TreeNode(sortedIntegersArray[mid]);
        root.left = createBinaryTree(sortedIntegersArray,leftIndex,mid-1);
        root.right = createBinaryTree(sortedIntegersArray,mid+1,rightIndex);
        return root;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<TreeNode> nodesQueue = new ArrayList<>();
        List<List<Integer>> levelOrderList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        if(root != null){
            nodesQueue.add(root);
            nodesQueue.add(null);
            tempList=new ArrayList<>();
        }
        while(!nodesQueue.isEmpty()){
            TreeNode tempNode = nodesQueue.get(0);
            nodesQueue.remove(0);
            if(tempNode==null && nodesQueue.isEmpty()){
                levelOrderList.add(tempList);
                return levelOrderList;
            }else if(tempNode == null){
                levelOrderList.add(tempList);
                tempList = new ArrayList<>();
                nodesQueue.add(null);
            }else{
                tempList.add(tempNode.val);
                if(tempNode.right != null){
                    nodesQueue.add(tempNode.right);
                }
                if(tempNode.left != null){
                    nodesQueue.add(tempNode.left);
                }
            }
        }
        return  levelOrderList;
    }



    public static void main(String args[]) {
        System.out.println("Binary_Tree_Level_Order_Traversal");
        int[] sortedTestArray = {1,2,3,4 };
        Binary_Tree_Level_Order_Traversal t = new Binary_Tree_Level_Order_Traversal();
        t.levelOrder(createBinaryTree(sortedTestArray,0,sortedTestArray.length-1));
    }
}
