package geeksforgeeks;

public class CreateBSTGivenUnsortedArray {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
        }
    }

    static void addIntoBinarySearchTree(TreeNode root , int num){
        if(root.left == null && root.val >= num){
            root.left = new TreeNode(num);
            return;
        }else if(root.right == null && root.val < num){
            root.right= new TreeNode(num);
            return;
        }else if(root.val > num){
            addIntoBinarySearchTree(root.left,num);
        }else{
            addIntoBinarySearchTree(root.right,num);
        }
    }

    static TreeNode addIntoBinarySearchTreeIterative(TreeNode root , int num){
        if(root == null){
            return root;
        }
        TreeNode newNode = new TreeNode(num);
        TreeNode parentNode = null;
        TreeNode currentNode = root;

        while (currentNode != null){
            parentNode=currentNode;
            if(currentNode.val >= newNode.val){
                currentNode=currentNode.left;
            }else{
                currentNode=currentNode.right;
            }
        }

        if(parentNode.val >= newNode.val){
            parentNode.left=newNode;
        }else{
            parentNode.right=newNode;
        }
        return root;
    }


    private static TreeNode createBinarySearchTree(int[] unsorted_tree){
        TreeNode root = new TreeNode(unsorted_tree[0]);
        for(int i = 1 ; i<unsorted_tree.length ; i++){
            addIntoBinarySearchTreeIterative(root,unsorted_tree[i]);
        }
        return root;
    }

    private static TreeNode createBinarySearchTreeIteratively(int[] unsorted_tree){
        TreeNode root = new TreeNode(unsorted_tree[0]);
        for(int i = 1 ; i<unsorted_tree.length ; i++){
            addIntoBinarySearchTree(root,unsorted_tree[i]);
        }
        return root;
    }


    public static void main(String[] args) {
        System.out.println("Create a Binary Search Tree given unsorted array");
        System.out.println(createBinarySearchTreeIteratively(new int[]{8,7,9,10,5,6,3}).val);
        System.out.println(createBinarySearchTree(new int[]{8,7,9,10,5,6,3}).val);

    }
}
