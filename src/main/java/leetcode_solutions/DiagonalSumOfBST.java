package leetcode_solutions;

import java.util.*;

/**
 * Print Daigonal Elements and their sum (Diagonal Sum) of BST
 * Algorithm Link : https://www.youtube.com/watch?v=I3BC8nEKYm8&list=PLeIMaH7i8JDj7DnmO7lll97P1yZjMCpgY&index=24
 */
public class DiagonalSumOfBST {

    // Define node structure
    class TreeNode {
        int data;
        int levelNumber;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }

        public String toString() {
            return String.valueOf(data);
        }
    }

    // Create Binary Search tree wit sorted integers array
    TreeNode createBinaryTree(int[] sortedIntArray, int lowIndex, int highIndex) {
        //base condition
        if (lowIndex > highIndex) {
            return null;
        }
        int midIndex = (lowIndex + highIndex) / 2;
        TreeNode root = new TreeNode(sortedIntArray[midIndex]);
        root.left = createBinaryTree(sortedIntArray, lowIndex, midIndex - 1);
        root.right = createBinaryTree(sortedIntArray, midIndex + 1, highIndex);
        return root;
    }

    void printLevelByLevelBST(TreeNode root) {
        Deque<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);
        nodesQueue.add(null);
        while (!nodesQueue.isEmpty()) {
            TreeNode tempNode = nodesQueue.pop();
            if (tempNode == null && nodesQueue.size() > 1) {
                nodesQueue.add(null);
                System.out.println();
            } else if (tempNode != null) {
                System.out.print(tempNode);
                System.out.print(" ");
                if (tempNode.left != null) {
                    nodesQueue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    nodesQueue.add(tempNode.right);
                }

            }
        }
    }

    void printDiagonalSum(TreeNode root) {
        TreeMap<Integer, ArrayList<TreeNode>> diagonalMap = new TreeMap<>();
        Deque<TreeNode> nodeQueue = new LinkedList<>();
        root.levelNumber = 0;
        ArrayList<TreeNode> tempArrayList = new ArrayList<>();
        tempArrayList.add(root);
        diagonalMap.put(root.levelNumber, tempArrayList);
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            TreeNode tempNode = nodeQueue.pop();
            if (tempNode.left != null) {
                int tempLevelNumber = tempNode.levelNumber + 1;
                tempNode.left.levelNumber = tempLevelNumber;
                if (diagonalMap.get(tempLevelNumber) == null) {
                    ArrayList<TreeNode> tempNodesList = new ArrayList<>();
                    tempNodesList.add(tempNode.left);
                    diagonalMap.put(tempLevelNumber, tempNodesList);
                    nodeQueue.add(tempNode.left);
                } else {
                    ArrayList<TreeNode> tempNodesList = diagonalMap.get(tempLevelNumber);
                    tempNodesList.add(tempNode.left);
                    diagonalMap.put(tempLevelNumber, tempNodesList);
                    nodeQueue.add(tempNode.left);
                }
            }
            if (tempNode.right != null) {
                int tempLevelNumber = tempNode.levelNumber;
                tempNode.right.levelNumber = tempLevelNumber;
                if (diagonalMap.get(tempLevelNumber) == null) {
                    ArrayList<TreeNode> tempNodesList = new ArrayList<>();
                    tempNodesList.add(tempNode.right);
                    diagonalMap.put(tempLevelNumber, tempNodesList);
                    nodeQueue.add(tempNode.right);
                } else {
                    ArrayList<TreeNode> tempNodesList = diagonalMap.get(tempLevelNumber);
                    tempNodesList.add(tempNode.right);
                    diagonalMap.put(tempLevelNumber, tempNodesList);
                    nodeQueue.add(tempNode.right);
                }
            }
        }
        System.out.println();
        System.out.println("diagonalMap :"+diagonalMap);
    }

    public static void main(String args[]) {
        System.out.println("Hellp World!");
        DiagonalSumOfBST test = new DiagonalSumOfBST();
        int[] testArray = {1, 2, 3, 4, 5, 6, 7};
        TreeNode rootMain = test.createBinaryTree(testArray, 0, testArray.length - 1);
        test.printLevelByLevelBST(rootMain);
        test.printDiagonalSum(rootMain);
    }
}
