package leetcode_solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 */
public class BSTPathsWithSpecificSum {
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

    public TreeNode createBSTUsingSortedArray(int[] sortedArray, int lowIndex, int highIndex) {
        //base condition
        if (lowIndex > highIndex) {
            return null;
        }
        int midIndex = (lowIndex + highIndex) / 2;
        TreeNode root = new TreeNode(sortedArray[midIndex]);
        root.left = createBSTUsingSortedArray(sortedArray, lowIndex, midIndex - 1);
        root.right = createBSTUsingSortedArray(sortedArray, midIndex + 1, highIndex);
        return root;
    }
    Stack<TreeNode> singlePath = new Stack<>();

    public void processCurrentPath(Stack<TreeNode> currentPath,int targetSum){
        int tempSum=0;
        for(TreeNode each : currentPath){
            tempSum+=each.data;
            if(tempSum == targetSum){
                System.out.print("Path with target value found : ");
                System.out.println(currentPath);
            }
        }
    }

    /*
       Prints whole BST level by level
     */
    public void printBSTLevelByLevel(TreeNode root){
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            TreeNode currNode = queue.pop();
            if(currNode == null && queue.isEmpty()){
                System.out.println("BST has been printed");
                break;
            }else if (currNode == null){
                queue.addLast(null);
                System.out.println("");
                continue;
            }else{
                System.out.print(currNode.data + " ");
            }

            //Adding new node into Queue
            if(currNode.left != null){
                queue.addLast(currNode.left);
            }
            if(currNode.right != null){
                queue.addLast(currNode.right);
            }
        }

    }

    public void inOrderTraversalOfBst(TreeNode root) {
        //base condition
        if(root == null){
            return;
        }
        singlePath.push(root);
        //visit left node iteratively
        inOrderTraversalOfBst(root.left);
        //visit root
        //print stack only if current node is leaf node.
        if(root.left == null && root.right == null){
            System.out.println(singlePath);
            processCurrentPath(singlePath,12);
        }
        //visit right node iteratively
        inOrderTraversalOfBst(root.right);
        singlePath.pop();
    }

    public static void main(String args[]) {
        System.out.println("Hello World !");
        int[] testArray = {1,2,3,4,5,6,7,8,9,10,11};
        BSTPathsWithSpecificSum test = new BSTPathsWithSpecificSum();
        TreeNode rootMain = test.createBSTUsingSortedArray(testArray,0,testArray.length-1);
        test.printBSTLevelByLevel(rootMain);
        test.inOrderTraversalOfBst(rootMain);

    }
}
