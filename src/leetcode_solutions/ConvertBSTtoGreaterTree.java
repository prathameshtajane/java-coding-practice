package leetcode_solutions;

/**
 * 538. Convert BST to Greater tree
 *
 * Link : https://leetcode.com/problems/convert-bst-to-greater-tree/description/
 *
 * Description :
 * Given a Binary Search tree (BST), convert it to a Greater tree such that every key of the original BST is changed to
 * the original key plus sum of all keys greater than the original key in BST.
 *
 * Algorithm :
 * public void convert(TreeNode cur) {
         if (cur == null) return;
         convert(cur.right);
         cur.val += sum;
         sum = cur.val;
         convert(cur.left);
   }
 */
public class ConvertBSTtoGreaterTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
        }
    }
    int sum=0;

    public void convert(TreeNode curr){
        //base condition
        if(curr == null){
            return;
        }
        convert(curr.right);
        curr.val += sum;
        sum=curr.val;
        convert(curr.left);

    }
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    public static void main(String args[]){
        System.out.println("538. Convert BST to Greater tree");

    }
}
