package daily_coding_challenges;

import java.util.Deque;
import java.util.LinkedList;

public class Prob83_Google_Invert_Binary_Tree {

    // Structure of TreeNode
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;
        TreeNode(int data){
            this.data = data;
        }
    }

    TreeNode generateBT(int[] sortedArray,int minIndex,int maxIndex){
        //base condition
        if(minIndex > maxIndex){
            return null;
        }

        int curr_root_index = (minIndex+maxIndex)/2;
        TreeNode root = new TreeNode(sortedArray[curr_root_index]);
        root.left = generateBT(sortedArray,minIndex,curr_root_index-1);
        root.right = generateBT(sortedArray,curr_root_index+1,maxIndex);
        return root;
    }


    void traverseBTLevelByLevel(TreeNode root){
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        StringBuffer currentLevelNodes = new StringBuffer();

        while (!queue.isEmpty()){
            TreeNode currNode = queue.removeFirst();

            if(currNode == null){
                if(queue.size() != 0) {
                    queue.addLast(null);
                }
                System.out.println(currentLevelNodes.toString());
                currentLevelNodes = new StringBuffer();
                continue;
            }

            currentLevelNodes.append(currNode.data + " ");

            if(currNode.left != null)
                queue.add(currNode.left);
            if(currNode.right !=null)
                queue.add(currNode.right);
        }
    }

     TreeNode invertBinaryTree(TreeNode root){
        if(root != null){
            invertBinaryTree(root.left);
            invertBinaryTree(root.right);

            TreeNode temp=root.left;
            root.left = root.right;
            root.right = temp;
        }
        return root;
    }

    public static void main(String args[]){
        System.out.println("Prob83_Google_Invert_Binary_Tree");
        Prob83_Google_Invert_Binary_Tree BT = new Prob83_Google_Invert_Binary_Tree();
        int[] sortedArray = {1,2,3,4,5,6,7,8};
        TreeNode root = BT.generateBT(sortedArray,0,sortedArray.length-1);
        System.out.println("Original tree");
        BT.traverseBTLevelByLevel(root);

        System.out.println("Inverted tree");
        TreeNode invertedBTroot = BT.invertBinaryTree(root);
        BT.traverseBTLevelByLevel(invertedBTroot);
    }
}
