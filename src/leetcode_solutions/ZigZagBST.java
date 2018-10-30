package leetcode_solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Print Binary Search tree in ZigZag pattern.
 * <p>
 * Algo Link : https://www.youtube.com/watch?v=YsLko6sSKh8&list=PLeIMaH7i8JDj7DnmO7lll97P1yZjMCpgY&index=20
 * <p>
 * Algorithm :
 * 1.  Push root in S1
 * ---2.  Pop from S1 and print
 * |
 * while()
 * |
 * ---3.  Push in S2 [Push Left to Right]
 * ---4.  Pop from S2 and print
 * |
 * while()
 * |
 * ---5.  Push in S1 [Push Right to Left]
 */
public class ZigZagBST {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }

        public String toString() {
            return String.valueOf(data);
        }
    }


    TreeNode createTreeFromSortedArray(int[] sortedArray, int lowIndex, int highIndex) {
        if (lowIndex > highIndex) {
            return null;
        }
        int midIndex = (lowIndex + highIndex) / 2;
        TreeNode root = new TreeNode(sortedArray[midIndex]);
        root.left = createTreeFromSortedArray(sortedArray, lowIndex, midIndex - 1);
        root.right = createTreeFromSortedArray(sortedArray, midIndex + 1, highIndex);
        return root;
    }

    public void printInorderBST(TreeNode root) {
        if (root == null) {
            return;
        }
        printInorderBST(root.left);
        System.out.print(root);
        System.out.print(" ");
        printInorderBST(root.right);
    }

    public void printZigZagBST(TreeNode root) {
        Deque<TreeNode> stack1 = new ArrayDeque<>();
        Deque<TreeNode> stack2 = new ArrayDeque<>();
        stack1.add(root);
        while (!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                TreeNode tempNodeFromStack1 = stack1.pop();
                System.out.print(" "+tempNodeFromStack1+" ");
                if(tempNodeFromStack1.left != null){
                    stack2.push(tempNodeFromStack1.left);
                }
                if(tempNodeFromStack1.right != null){
                    stack2.push(tempNodeFromStack1.right);
                }
            }
            while(!stack2.isEmpty()){
                TreeNode tempNodeFromStack2 = stack2.pop();
                System.out.print(" "+tempNodeFromStack2+" ");
                if(tempNodeFromStack2.right != null){
                    stack1.push(tempNodeFromStack2.right);
                }
                if(tempNodeFromStack2.left != null){
                    stack1.push(tempNodeFromStack2.left);
                }
            }

        }
    }

    public static void main(String args[]) {
        System.out.println("Hello  World !");
        System.out.println("Printing BST in ZigZag order.");
        ZigZagBST tst = new ZigZagBST();
        int[] sortedArray = {1, 2, 3, 4, 5};
        TreeNode rootMain = tst.createTreeFromSortedArray(sortedArray, 0, sortedArray.length - 1);
        System.out.println("In Order :");
        tst.printInorderBST(rootMain);
        System.out.println("Zig Zag Order :");
        tst.printZigZagBST(rootMain);
    }
}
