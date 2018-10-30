package leetcode_solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */


public class InorderPostDecessor {

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    void printInorder(TreeNode root){
        if(root == null){
            return;
        }
        printInorder(root.left);
        System.out.print(root.data);
        System.out.print(" ");
        printInorder(root.right);
    }

    public void inOrderPredessorNode(TreeNode root, TreeNode node) {
        Queue<TreeNode> nodesQueue = new LinkedList<>();
        TreeNode tempNode = searchNodeInBinarySearchTree(root,node);
        if (tempNode != null) {
            //case 1 : node has left node
            if (tempNode.left != null) {
                TreeNode leftTempNode = tempNode.left;
                while (leftTempNode.right != null) {
                    leftTempNode = leftTempNode.right;
                }
                System.out.println("In order predeccesor is :" + leftTempNode);
            } else //case 2 : node has no left node
            {
                TreeNode lastRight = new TreeNode(-1);
                while (node.data != root.data) {
                    if (node.data > root.data) {
                        lastRight = root;
                        root = root.right;
                    } else {
                        root = root.left;
                    }
                }
                System.out.println(lastRight.data);
            }
        } else {
            System.out.println("No nodes found");
        }
    }

    public void inorderPostDecessrNode(TreeNode root,TreeNode node){
        TreeNode tempNode = searchNodeInBinarySearchTree(root,node);
        if(tempNode != null){
            if(tempNode.right != null){
                //case 1 : when right tree exists
                TreeNode rightNode = tempNode.right;
                while(rightNode.left != null){
                    rightNode=rightNode.left;
                }
                System.out.println("inorderPostDecessrNode of "+node+" is "+rightNode);
            }else{
                TreeNode dummyNode = new TreeNode(-1);
                while(node.data != root.data){
                    if(node.data < root.data){
                        dummyNode = root;
                        root=root.left;
                    }else{
                        root=root.right;
                    }
                }
                System.out.println("inorderPostDecessrNode of "+node+" is "+dummyNode);
            }
        }else{

            System.out.println(node+" does not exists in given tree!");
        }
    }
    TreeNode searchNodeInBinarySearchTree(TreeNode root, TreeNode node) {
        //base condition;
        if (root.data == node.data) {
            return node;
        }
        if (root.data > node.data && root.left != null) {
            return searchNodeInBinarySearchTree(root.left, node);
        }
        if (root.data < node.data && root.right != null) {
            return searchNodeInBinarySearchTree(root.right, node);
        }
        return null;
    }

    TreeNode createBinaryTree(int[] sortedInputArray, int highIndex, int lowIndex) {
        //base condition
        if (highIndex < lowIndex) {
            return null;
        }
        int tempMidIndex = (highIndex + lowIndex) / 2;
        TreeNode rootNode = new TreeNode(sortedInputArray[tempMidIndex]);
        rootNode.left = createBinaryTree(sortedInputArray, tempMidIndex - 1, lowIndex);
        rootNode.right = createBinaryTree(sortedInputArray, highIndex, tempMidIndex + 1);
        return rootNode;
    }

    TreeNode createNode(int data){
        return new TreeNode(data);
    }

    public static void main(String args[]) {
        System.out.println("Hello Word!");
        InorderPostDecessor test = new InorderPostDecessor();
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        TreeNode testNode = test.createNode(2);
        TreeNode mainRoot = test.createBinaryTree(sortedArray, sortedArray.length - 1, 0);
        TreeNode searchedNode = test.searchNodeInBinarySearchTree(mainRoot, testNode);
        test.inOrderPredessorNode(mainRoot,testNode);
        test.inorderPostDecessrNode(mainRoot,testNode);
        test.printInorder(mainRoot);
        System.out.println(mainRoot);
        System.out.println(searchedNode);
    }
}
