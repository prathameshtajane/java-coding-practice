package daily_coding_challenges;


/**
 * This problem was asked by Amazon.
 *
 * Given a complete binary tree, count the number of nodes in faster than O(n) time. Recall that a complete binary tree
 * has every level filled except the last, and the nodes in the last level are filled starting from the left.
 */

public class Prob204_Amazon_BST_Count_Nodes_Faster {

    private static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }


    static int getLeftTreeHeight(TreeNode root){
        int height = 0;

        while(root!= null) {
            height++;
            root=root.left;
        }
        return height;
    }

    static int getRightTreeHeight(TreeNode root){
        int height = 0;
        while(root!= null) {
            height++;
            root=root.right;
        }
        return height;
    }

    static int getNodeCount(TreeNode root){
        //base case
        if(root == null){
            return 0;
        }
        int leftHeight = getLeftTreeHeight(root);
        int rightHeight = getRightTreeHeight(root);
        if(leftHeight==rightHeight){
            return (1 << leftHeight)-1;//2^n-1
        }
        return getNodeCount(root.left)+getNodeCount(root.right)+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
        System.out.println("Total Node Count :"+getNodeCount(root));
    }
}
