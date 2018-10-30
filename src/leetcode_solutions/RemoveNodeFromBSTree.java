package leetcode_solutions;

/**
 * Remove Node from given Binary Search tree
 */
public class RemoveNodeFromBSTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode findMinNode(TreeNode root){
        while(root.left != null){
            root=root.left;
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root,int data){
        if(root == null){
            return null;
        }else if(root.val < data){
            root.right = deleteNode(root.right,data);
        }else if(root.val > data){
            root.left = deleteNode(root.left,data);
        }else if(root.val == data){
            //Case1 : No node
            if(root.left == null && root.right== null){
                root=null;
            }
            //Case2 : One Node
            if(root.left == null){
                root = root.right;
            }
            if(root.right == null){
                root = root.left;
            }else{//Case3 : Two Nodes
                TreeNode tempNode = findMinNode(root.right);
                root.val=tempNode.val;
                root.right = deleteNode(root.right,data);
            }
        }
        return root;
    }

    public static void main(String args[]) {
        System.out.println("Hello World !");
    }
}
