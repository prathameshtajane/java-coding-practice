package leetcode_solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 669. Trim a Binary Search tree
 * Given a binary search tree and the lowest and highest boundaries as L and R,
 * trim the tree so that all its elements lies in [L, R] (R >= L).
 * You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.
 */
public class TrimBST {

    //Create TreeNode structure
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }

        public String toString(){
            return String.valueOf(data);
        }
    }

    public TreeNode createBST(int[] sortedIntArray, int lowIndex, int highIndex) {
        //base condition
        if (lowIndex > highIndex) {
            return null;
        }
        int midIndex = (lowIndex + highIndex) / 2;
        TreeNode root = new TreeNode(sortedIntArray[midIndex]);
        root.left = createBST(sortedIntArray, lowIndex, midIndex - 1);
        root.right = createBST(sortedIntArray, midIndex + 1, highIndex);
        return root;
    }

    public void printBSTLevelByLevel(TreeNode root) {
        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);
        nodesQueue.add(null);
        while (!nodesQueue.isEmpty()) {
            TreeNode currNode = nodesQueue.remove();
            if (currNode == null && nodesQueue.size() > 0) {
                nodesQueue.add(null);
                System.out.println();
            } else if (currNode != null) {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    nodesQueue.add(currNode.left);
                }
                if (currNode.right != null) {
                    nodesQueue.add(currNode.right);
                }
            }
        }
    }

    public TreeNode findMinBSTNode(TreeNode root){
        if(root == null){
            return null;
        }else{
            while(root.left!=null){
                root=root.left;
            }
        }
        return root;
    }

    public TreeNode deleteBSTNode(TreeNode root,int data){
        if(root == null){
            return null;
        }
        if(data > root.data){
            root.right=deleteBSTNode(root.right,data);
        }
        if(data <= root.data){
            root.left=deleteBSTNode(root.left,data);
        }
        if(data == root.data){
            //case 1
            if(root.left == null && root.right == null){
                root = null;
            }else if(root.left == null){
                root=root.right;
            }else if(root.right == null){
                root=root.left;
            }else if(root.left != null && root.right != null){
                TreeNode tempMinNode = findMinBSTNode(root.right);
                root.data=tempMinNode.data;
                root=deleteBSTNode(root.right,data);
            }
        }
        return root;
    }

    public static void main(String args[]) {
        System.out.println("Trimmed BST !");
        TrimBST trimmedBST = new TrimBST();
        int[] sortedArray = {1,2,3,4,5,6,7,8,9};
        TreeNode rootMain = trimmedBST.createBST(sortedArray,0,sortedArray.length-1);
        System.out.println("Before");
        trimmedBST.printBSTLevelByLevel(rootMain);
        trimmedBST.deleteBSTNode(rootMain,7);
        System.out.println();
        System.out.println("After");
        trimmedBST.printBSTLevelByLevel(rootMain);
    }
}
