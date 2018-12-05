package daily_coding_challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
    This problem was asked by Facebook.

    Given a binary tree, return all paths from the root to leaves.

    For example, given the tree

       1
      / \
     2   3
        / \
       4   5
    it should return [[1, 2], [1, 3, 4], [1, 3, 5]].

    Algorithm :

    step1 - Make use of modified inOrder tree traversal.


 */
public class Prob110_ReturnRootToLeavesPaths {

    private static  Stack<Integer> stack = new Stack<>();
    private static  List<String> opStringList = new ArrayList<>();

    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val){
            this.val=val;
        }
    }


    private static TreeNode createTree(int[] sortedArray,int minIndex,int maxIndex){
        //base condition
        if(maxIndex < minIndex){
            return null;
        }
        int mid = (minIndex+maxIndex)/2;
        TreeNode root = new TreeNode(sortedArray[mid]);
        root.left=createTree(sortedArray,minIndex,mid-1);
        root.right=createTree(sortedArray,mid+1,maxIndex);
        return root;
    }

    public static void processArray(Stack<Integer> stk) {
        String tempString = "\"";
        for (int i = 0; i < stk.size(); i++) {
            tempString = tempString + (String.valueOf(stk.get(i)));
            tempString = tempString + "->";
        }
        tempString = tempString.substring(0, (tempString.length() - 2));
        tempString = tempString + "\"";
        opStringList.add(tempString);
    }

    public static void inOrderTraversal(TreeNode root) {
        //base condition
        if (root == null) {
            return;
        }
        stack.push(root.val);
        inOrderTraversal(root.left);
        if (root.left == null && root.right == null) {
            processArray(stack);
        }
        inOrderTraversal(root.right);
        stack.pop();
    }

    public static void main(String[] args) {
        System.out.println("Prob110_ReturnRootToLeavesPaths");
        int[] sortedArray = {1,2,3,4,5,6,7,8,9};
        inOrderTraversal(createTree(sortedArray,0,sortedArray.length-1));
        for(String eachPath : opStringList){
            System.out.println(eachPath);
        }
    }
}
