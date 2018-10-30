package leetcode_solutions;


import java.util.*;

/**
 * Binary tree Level order traversal
 */

public class TreeLevelTraversal {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        boolean visited=false;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void treeLevelOrderTraversal(TreeNode root) {
        Queue<TreeNode> treeNodeList = new LinkedList<TreeNode>();
        treeNodeList.add(root);
        while (!treeNodeList.isEmpty()) {
            TreeNode tempNode = treeNodeList.remove();
            System.out.print(tempNode.val);
            if (tempNode.left != null) {
                treeNodeList.add(tempNode.left);
            }
            if (tempNode.right != null) {
                treeNodeList.add(tempNode.right);
            }
        }
    }

    public void treeLevelOrderTraversalInTreeStruncture(TreeNode root) {
        Queue<TreeNode> treeNodeList = new LinkedList<TreeNode>();
        treeNodeList.add(root);
        treeNodeList.add(null);
        while (!treeNodeList.isEmpty()) {
            TreeNode tempTreeNode = treeNodeList.remove();
            if (tempTreeNode == null && !treeNodeList.isEmpty()) {
                treeNodeList.add(null);
                System.out.println();
            }
            if (tempTreeNode != null) {
                System.out.print(tempTreeNode.val);
                if (tempTreeNode.left != null) {
                    treeNodeList.add(tempTreeNode.left);
                }
                if (tempTreeNode.right != null) {
                    treeNodeList.add(tempTreeNode.right);
                }
            }
        }
    }

    public void verticalTreeTravesal(TreeNode root){
        //base condition
        if(root == null){
            return;
        }
        System.out.println(root.val);
        root.visited=true;
        if(root.left !=null && root.left.visited == false){
            verticalTreeTravesal(root.left);
        }
        if(root.right !=null && root.right.visited == false){
            verticalTreeTravesal(root.right);
        }
    }

//    public static ArrayList<ArrayList<Integer>> abc = new ArrayList<ArrayList<Integer>>();
//    public  static ArrayList<Integer> b = new ArrayList<>();
//    public static void abcd(TreeNode root){
//        if(root == null) return;
//        root.visited = true;
//        b.add(root.val);
//        if(root.left !=null && root.left.visited == false){
//            abcd(root.left);
//        }
//        if(root.right !=null && root.right.visited == false){
//            abcd(root.right);
//        }
//        if(root.left)
//        abc.add(b);
//        b.remove(b.size()-1);
//    }

    public void createTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(2);
        root.left.left.left.left = new TreeNode(1);
        treeLevelOrderTraversal(root);
        treeLevelOrderTraversalInTreeStruncture(root);
        System.out.println("Vertical Traversal");
        verticalTreeTravesal(root);
//        System.out.println("abcd Vertical Traversal");
//        abcd(root);
//        System.out.println("abcd Vertical Traversal End");
    }

    public static void main(String args[]) {
        TreeLevelTraversal tempTraverSal = new TreeLevelTraversal();
        tempTraverSal.createTree();
    }


}

