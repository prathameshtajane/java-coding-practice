package leetcode_solutions;

import java.util.*;

/**
 * Print top view of the binary tree
 */
public class TopViewOfBinaryTree {
    Map<Integer, ArrayList<TreeNode>> nodesMap = new TreeMap<>();
    ArrayList<TreeNode> levelOrderNodes = new ArrayList<>();
    ArrayList<TreeNode> topView = new ArrayList<>();
    ArrayList<TreeNode> bottomView = new ArrayList<>();

    class TreeNode {
        int hDistance;
        String data;
        TreeNode left;
        TreeNode right;

        TreeNode(String data) {
            this.data = data;
        }

        public String toString() {
            return data;
        }
    }

    public void printTopViewofTree(TreeNode root) {
        Queue<TreeNode> nodesQueue = new LinkedList<>();
        root.hDistance = 0;
        nodesQueue.add(root);
        ArrayList<TreeNode> tempArrayList = new ArrayList<>();
        tempArrayList.add(root);
        levelOrderNodes.add(root);
        nodesMap.put(root.hDistance, tempArrayList);
        while (!nodesQueue.isEmpty()) {
            TreeNode tempTreeNode = nodesQueue.remove();
            if (tempTreeNode.left != null) {
                tempTreeNode.left.hDistance = tempTreeNode.hDistance - 1;
                if (nodesMap.get(tempTreeNode.left.hDistance) != null) {
                    ArrayList<TreeNode> tempLeftNodeList = nodesMap.get(tempTreeNode.left.hDistance);
                    tempLeftNodeList.add(tempTreeNode.left);
                    nodesMap.put(tempTreeNode.left.hDistance, tempLeftNodeList);
                    nodesQueue.add(tempTreeNode.left);
                    levelOrderNodes.add(tempTreeNode.left);
                } else {
                    ArrayList<TreeNode> tempLeftNodeList = new ArrayList<>();
                    tempLeftNodeList.add(tempTreeNode.left);
                    nodesMap.put(tempTreeNode.left.hDistance, tempLeftNodeList);
                    nodesQueue.add(tempTreeNode.left);
                    levelOrderNodes.add(tempTreeNode.left);
                }
            }
            if (tempTreeNode.right != null) {
                tempTreeNode.right.hDistance = tempTreeNode.hDistance + 1;
                if (nodesMap.get(tempTreeNode.right.hDistance) != null) {
                    ArrayList<TreeNode> tempRightNodeList = nodesMap.get(tempTreeNode.right.hDistance);
                    tempRightNodeList.add(tempTreeNode.right);
                    nodesMap.put(tempTreeNode.right.hDistance, tempRightNodeList);
                    nodesQueue.add(tempTreeNode.right);
                    levelOrderNodes.add(tempTreeNode.right);
                } else {
                    ArrayList<TreeNode> tempRightNodeList = new ArrayList<>();
                    tempRightNodeList.add(tempTreeNode.right);
                    nodesMap.put(tempTreeNode.right.hDistance, tempRightNodeList);
                    nodesQueue.add(tempTreeNode.right);
                    levelOrderNodes.add(tempTreeNode.right);
                }
            }
        }
    }

    public void printTopView() {
        HashSet<TreeNode> nodesHashSet = new HashSet<>();
        for (int eackKey : nodesMap.keySet()) {
            nodesHashSet.addAll(nodesMap.get(eackKey));
        }

        for (int eackKey : nodesMap.keySet()) {
            if (nodesMap.get(eackKey).size() == 1) {
                topView.add(nodesMap.get(eackKey).get(0));
            } else {
                for (TreeNode eachNode : levelOrderNodes) {
                    if (nodesMap.get(eackKey).contains(eachNode)) {
                        topView.add(eachNode);
                        break;
                    }
                }
            }
        }
    }

    public void printBottomView() {
        HashSet<ArrayList<TreeNode>> nodesHashSet = new HashSet<>();
        for (int eackKey : nodesMap.keySet()) {
            nodesHashSet.add(nodesMap.get(eackKey));
        }
        for (int eackKey : nodesMap.keySet()) {
            if (nodesMap.get(eackKey).size() == 1) {
                bottomView.add(nodesMap.get(eackKey).get(0));
            } else {
                for (int i = levelOrderNodes.size() - 1; i >= 0; i--) {
                    if(nodesMap.get(eackKey).contains(levelOrderNodes.get(i))){
                        bottomView.add(levelOrderNodes.get(i));
                        break;
                    }
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
        printTopViewofTree(rootNode);
        printTopView();
        printBottomView();
        System.out.println(nodesMap);
        System.out.println(levelOrderNodes);
        System.out.println(topView);
        System.out.println(bottomView);

    }

    public static void main(String args[]) {
        System.out.println("Printing Top View of Binary tree !");
        TopViewOfBinaryTree tp = new TopViewOfBinaryTree();
        tp.createTree();
    }
}
