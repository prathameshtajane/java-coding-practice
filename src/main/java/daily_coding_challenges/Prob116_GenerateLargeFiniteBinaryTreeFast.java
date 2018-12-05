package daily_coding_challenges;


/*
    This problem was asked by Jane Street.

    Generate a finite, but an arbitrarily large binary tree quickly in O(1).

    That is, generate() should return a tree whose size is unbounded but finite.


 */

import java.util.Random;

public class Prob116_GenerateLargeFiniteBinaryTreeFast {

    static Random random = new Random();

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
        }
    }
    // this function will generate random BT using recursion
    // this will most probably give stack overflow error
    // Assumption :
    // we have unlimited memory and stack size
    private static TreeNode generateUnboundedFiniteBTree(){
        TreeNode root = new TreeNode(1);
        if(Math.random() < 0.5){
            root.left = generateUnboundedFiniteBTree();
        }
        if(Math.random() < 0.5){
            root.right = generateUnboundedFiniteBTree();
        }
        return root;
    }

    private static void inorderTraversal(TreeNode root){
        if(root != null){
            inorderTraversal(root.left);
            System.out.println(root.val);
            inorderTraversal(root.right);
        }
    }


    public static void main(String[] args) {
        System.out.println("Generate large binary tree");
        inorderTraversal(generateUnboundedFiniteBTree());
    }
}
