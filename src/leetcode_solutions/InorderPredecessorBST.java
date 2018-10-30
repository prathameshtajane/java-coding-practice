package leetcode_solutions;


import java.util.LinkedList;
import java.util.Queue;

public class InorderPredecessorBST {
    TreeNode rootNode;

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        public String toString() {
            return String.valueOf(data);
        }
    }

    public TreeNode binarySearch(int node, TreeNode rootNode) {
        if (node == rootNode.data) {
            return rootNode;
        } else if (node > rootNode.data && rootNode.right != null) {
            return binarySearch(node, rootNode.right);
        } else if (node < rootNode.data && rootNode.left != null) {
            return binarySearch(node, rootNode.left);
        } else {
            return null;
        }
    }

    public void inOrderPredessorNode(TreeNode root, TreeNode node) {
        Queue<TreeNode> nodesQueue = new LinkedList<>();
        TreeNode tempNode = binarySearch(node.data, root);
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

    public void createBinarySearchTree() {
        rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(3);
        rootNode.left.left = new TreeNode(4);
        rootNode.left.right = new TreeNode(5);
        rootNode.right.left = new TreeNode(6);
        rootNode.right.right = new TreeNode(7);

    }

    public static void main(String args[]) {
        System.out.println("Hello World !");
    }
}
