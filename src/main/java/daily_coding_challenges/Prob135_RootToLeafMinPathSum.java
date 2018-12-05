package daily_coding_challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * This question was asked by Apple.
 *
 * Given a binary tree, find a minimum path sum from root to a leaf.
 *
 * For example, the minimum path in this tree is [10, 5, 1, -1], which has sum 15.
 *
 *   10
 *  /  \
 * 5    5
 *  \     \
 *    2    1
 *        /
 *      -1
 */


public class Prob135_RootToLeafMinPathSum {

    private static class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int data){
            this.data=data;
        }
    }

    static int min_sum = Integer.MAX_VALUE;
    static List<Integer> curr_sum_path = new ArrayList<>();

    private static void getCurrPathSum(List<Integer> curr_sum_path){
        int temp_path_sum = curr_sum_path.parallelStream()
                                        .reduce(0,(x,y)->x+y);
        min_sum = (temp_path_sum < min_sum)?temp_path_sum:min_sum;
    }

    private static void inOrderTraversal(TreeNode root){
        if(root != null){
            curr_sum_path.add(root.data);
            inOrderTraversal(root.left);
            if(root.left ==null && root.right == null){
                getCurrPathSum(curr_sum_path);
            }
            inOrderTraversal(root.right);
            curr_sum_path.remove(curr_sum_path.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Prob135_RootToLeafMinPathSum");
        TreeNode root = new TreeNode(10);
        root.left=new TreeNode(5);
        root.left.right=new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.right= new TreeNode(1);
        root.right.right.left=new TreeNode(-5);
        inOrderTraversal(root);
        System.out.println(min_sum);

    }
}
