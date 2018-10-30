package leetcode_solutions.google;

/**
     Consider all the leaves of a binary tree.  From left to right order,
     the values of those leaves form a leaf value sequence.

     For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

     Two binary trees are considered leaf-similar if their leaf value sequence is the same.

     Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

     Note:

     Both of the given trees will have between 1 and 100 nodes.
 */
public class Leaf_Similar_Trees {

    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }

    Node createBST(int[] inputArray){
        Node root = new Node(inputArray[0]);
        for(int i=1;i<inputArray.length;i++){
            Node p = root;
            Node q = new Node(inputArray[i]);
            while(true){
                if(q.val <= p.val){
                    if(p.left == null){
                        p.left = q;
                        break;
                    }else {
                        p = p.left;
                    }
                }else{
                    if(p.right == null){
                        p.right = q;
                        break;
                    }else{
                        p=p.right;
                    }
                }
            }
        }
        return root;
    }




//    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//
//    }

    public static void main(String args[]){
        System.out.println("Leaf_Similar_Trees");
        Leaf_Similar_Trees tree = new Leaf_Similar_Trees();
        tree.createBST(new int[]{1,2,3,4,5,6,7,8});
    }
}
