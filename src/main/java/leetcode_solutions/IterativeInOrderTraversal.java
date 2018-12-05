package leetcode_solutions;

import java.util.ArrayList;
import java.util.Stack;

/**
 *  Iterative InOrder Traversal Problem
 */
public class IterativeInOrderTraversal {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }

        public String toString(){
            return String.valueOf(val);
        }
    }

    public void recursiveInOrderTraversal(TreeNode root){
        //base condition
        if(root == null){
            return;
        }
        recursiveInOrderTraversal(root.left);
        System.out.print(root.val+" ");
        recursiveInOrderTraversal(root.right);
    }

    public  ArrayList<TreeNode> iterativeIndorderTraversal(TreeNode root){
        ArrayList<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr=curr.left;
            }
            curr = stack.pop();
            list.add(curr);
            curr=curr.right;
        }
        return list;
    }

    public TreeNode createBinaryTree(int[] sortedArray,int lowIndex,int highIndex){
        //base condition
        if(lowIndex>highIndex){
            return null;
        }
        int midIndex=(lowIndex+highIndex)/2;
        TreeNode root = new TreeNode(sortedArray[midIndex]);
        root.left=createBinaryTree(sortedArray,lowIndex,midIndex-1);
        root.right=createBinaryTree(sortedArray,midIndex+1,highIndex);
        return root;
    }

    public void createTree(int[] sortedArray){
        TreeNode root = createBinaryTree(sortedArray,0,sortedArray.length-1);
        System.out.println("Recursive");
        recursiveInOrderTraversal(root);
        System.out.println("Iteratve");
        System.out.println(iterativeIndorderTraversal(root));
    }

    public static void main(String args[]){
        System.out.println("Iterative InOrder Traversal Problem");
        int[] sortedArray = {1,2,3,4,5,6,7,8,9};
        IterativeInOrderTraversal test =new IterativeInOrderTraversal();
        test.createTree(sortedArray);
    }
}
