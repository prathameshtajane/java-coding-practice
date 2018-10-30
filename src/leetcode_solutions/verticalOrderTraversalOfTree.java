package leetcode_solutions;

import java.util.*;

/**
 * Vertical Order Traversal of Binary tree
 * Link : https://www.youtube.com/watch?v=PQKkr036wRc
 */
public class verticalOrderTraversalOfTree {
    public Map<Integer, ArrayList<TreeNode>> levelMapper = new TreeMap<Integer, ArrayList<TreeNode>>();

    class TreeNode {
        String val;
        int hDist;
        TreeNode left;
        TreeNode right;

        public TreeNode(String val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return this.val;
        }
    }

    public void verticalTreeTraversalLogic(TreeNode root) {
        //Not a base case.Its just an edge case
        Queue<TreeNode> nodeList = new LinkedList<>();
        if (root == null) {
            return;
        }
        root.hDist = 0;

        nodeList.add(root);
        ArrayList<TreeNode> temp = new ArrayList<>();
        temp.add(root);
        levelMapper.put(0, temp);

        while (!nodeList.isEmpty()) {
            TreeNode tempNode = nodeList.remove();
            if (tempNode.left != null) {
                nodeList.add(tempNode.left);
                tempNode.left.hDist = tempNode.hDist - 1;
                if (levelMapper.get(tempNode.left.hDist) != null) {
                    ArrayList<TreeNode> tempN = levelMapper.get(tempNode.left.hDist);
                    tempN.add(tempNode.left);
                    levelMapper.put(tempNode.left.hDist, tempN);
                } else {
                    ArrayList<TreeNode> tempN = new ArrayList<>();
                    tempN.add(tempNode.left);
                    levelMapper.put(tempNode.left.hDist, tempN);
                }
            }
            if (tempNode.right != null) {
                nodeList.add(tempNode.right);
                tempNode.right.hDist = tempNode.hDist + 1;
                if (levelMapper.get(tempNode.right.hDist) != null) {
                    ArrayList<TreeNode> tempN = levelMapper.get(tempNode.right.hDist);
                    tempN.add(tempNode.right);
                    levelMapper.put(tempNode.right.hDist, tempN);
                } else {
                    ArrayList<TreeNode> tempN = new ArrayList<>();
                    tempN.add(tempNode.right);
                    levelMapper.put(tempNode.right.hDist, tempN);
                }
            }
        }
    }

    public void createTree() {
        TreeNode rootNode = new TreeNode("a");
        rootNode.left = new TreeNode("b");
        rootNode.right = new TreeNode("c");
        rootNode.left.left = new TreeNode("d");
        rootNode.left.right = new TreeNode("e");
        rootNode.right.left = new TreeNode("f");
        rootNode.right.right = new TreeNode("g");
        verticalTreeTraversalLogic(rootNode);
        System.out.println(levelMapper);

    }

    public static void main(String args[]) {
        System.out.println("Hello World !");
        verticalOrderTraversalOfTree testVerticalTraversal = new verticalOrderTraversalOfTree();
        testVerticalTraversal.createTree();
    }
}
