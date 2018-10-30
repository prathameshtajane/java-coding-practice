package careermonk.tree;

/**
 * Create Binary tree
 */
public class GenerateBinaryTree {
    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int data){
            this.data=data;
        }
    }

    static TreeNode createBinaryTree(int[] inputArray,int leftIndex,int rightIndex){
        //base condition
        if(leftIndex > rightIndex){
            return null;
        }
        int midIndex=(leftIndex+rightIndex)/2;
        TreeNode root = new TreeNode(inputArray[midIndex]);
        root.left=createBinaryTree(inputArray,leftIndex,midIndex-1);
        root.right=createBinaryTree(inputArray,midIndex+1,rightIndex);
        return root;
    }

    static void inOrderTraversal(TreeNode root){
        if(root!= null){
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }

    public static void main(String args[]){
        System.out.println("Generate Binary tree !");
        int[] testInput = {1,2,3,4,5,6,7,8,9};
//        System.out.println(GenerateBinaryTree.createBinaryTree(testInput,0,testInput.length-1).left.data);
        GenerateBinaryTree.inOrderTraversal(GenerateBinaryTree.createBinaryTree(testInput,0,testInput.length-1));
    }
}
