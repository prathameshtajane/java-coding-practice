package daily_coding_challenges;

/*

This problem was asked by Microsoft.

Print the nodes in a binary tree level-wise. For example, the following should print 1, 2, 3, 4, 5.

      1
     / \
    2   3
       / \
      4   5

 */

import java.util.ArrayList;

public class Prob107_PrintBSTLevelWise {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data=data;
        }

    }

    static void levelOrderTravesalofBST(TreeNode root){
        if(root == null){
            System.out.println("Root is null");
        }

        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            TreeNode curr_node = queue.get(0);
            queue.remove(0);
            if(curr_node == null && queue.isEmpty()){
                break;
            }else if(curr_node == null){
                queue.add(null);
            }else{
                System.out.print(curr_node.data+" ");
                if(curr_node.left != null){
                    queue.add(curr_node.left);
                }
                if(curr_node.right != null){
                    queue.add(curr_node.right);
                }
            }

        }
    }

    public static void main(String args[]){
        System.out.println("Prob107_PrintBSTLevelWise");
    }
}
