package leetcode_solutions;

/**
 * 572. Subtree of Another tree
 *
 * Link : https://leetcode.com/problems/subtree-of-another-tree/description/
 *
 * Description :
 * Given two non-empty binary trees s and t,
 * check whether tree t has exactly the same structure and node values with a subtree of s.
 * A subtree of s is a tree consists of a node in s and all of this node's descendants.
 * The tree s could also be considered as a subtree of itself.
 */
public class SubtreeOfAnotherTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
        }

        @Override
        public String toString(){
         return String.valueOf(val);
        }
    }

    public boolean isIdenticalTrees(TreeNode STNode,TreeNode DTNode){
        //base condition
        if(STNode == null && DTNode==null){
            return true;
        }

        if(STNode != null && DTNode != null){
            if(STNode.val == DTNode.val && isIdenticalTrees(STNode.left,DTNode.left) && isIdenticalTrees(STNode.right,DTNode.right)){
                return true;
            }
        }
        return false;
    }

    //create binary tree from sorted array
    public TreeNode createBinaryTree(int[] sortedIntArrays,int lowIndex,int highIndex){
        //base condition
        if(lowIndex>highIndex){
            return null;
        }
        int midIndex = (lowIndex+highIndex)/2;
        TreeNode root = new TreeNode(sortedIntArrays[midIndex]);
        root.left=createBinaryTree(sortedIntArrays,lowIndex,midIndex-1);
        root.right=createBinaryTree(sortedIntArrays,midIndex+1,highIndex);
        return root;
    }

    public boolean SubtreeOfAnotherTree(TreeNode STNode,TreeNode DTNode){
        if(DTNode == null){
            return true;
        }
        if(STNode == null){
            return false;
        }
        if(isIdenticalTrees(STNode,DTNode)){
            return true;
        }
        return (SubtreeOfAnotherTree(STNode.left,DTNode) || SubtreeOfAnotherTree(STNode.right,DTNode));
    }

    public void initiatorFunction(){
        int[] test1 = {1,2,3,4,5,6,7,8};
        int[] test2 = {1,2,3};
        System.out.println("Identical Trees");
        System.out.println(isIdenticalTrees(createBinaryTree(test1,0,test1.length-1),createBinaryTree(test2,0,test2.length-1)));
        System.out.println("SubTree of Another Trees");
        System.out.println(SubtreeOfAnotherTree(createBinaryTree(test1,0,test1.length-1),createBinaryTree(test2,0,test2.length-1)));
    }
    public static void main(String args[]){
        System.out.println("572. Subtree of Another tree");
        SubtreeOfAnotherTree test3 = new SubtreeOfAnotherTree();
        test3.initiatorFunction();
    }
}
