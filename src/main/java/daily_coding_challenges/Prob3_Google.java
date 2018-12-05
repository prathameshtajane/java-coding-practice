package daily_coding_challenges;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * This problem was asked by google.

    Given the root to a binary tree, implement serialize(root), which serializes the tree into a string,
    and deserialize(s), which deserializes the string back into the tree.

    For example, given the following Node class

     class Node:
     def __init__(self, val, left=None, right=None):
     self.val = val
     self.left = left
     self.right = right
     The following test should pass:

     node = Node('root', Node('left', Node('left.left')), Node('right'))
     assert deserialize(serialize(node)).left.left.val == 'left.left'
 */


public class Prob3_Google {

    class Node{
        String val;
        Node left;
        Node right;

        Node(){

        }

        Node(String val,Node left,Node right){
            this.val=val;
            this.left=left;
            this.right=right;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    List<String> serialize(Node root){
        List<String> serializedStringList = new ArrayList<>();
        inorderTraversal(root,serializedStringList);
        return serializedStringList;
    }

    Node deserialize(List<String> serializedStringList,int leftIndex,int rightIndex){
        //base condition
        if(leftIndex >= rightIndex){
            return null;
        }

        int mid = (leftIndex+rightIndex)/2;
        Node root = new Node();
        root.val=serializedStringList.get(mid);
        root.left=deserialize(serializedStringList,leftIndex,mid-1);
        root.right=deserialize(serializedStringList,mid+1,rightIndex);
        return root;
    }

    void inorderTraversal(Node node,List<String> serializedStringList){
        if(node !=null){
            inorderTraversal(node.left,serializedStringList);
            serializedStringList.add(String.valueOf(node.val));
            inorderTraversal(node.right,serializedStringList);
        }
    }

    public void createTree(){
        Prob3_Google pb3 = new Prob3_Google();
        Node root;
        root = new Node("2", new Node("1", null,null), new Node("4",null,null));
        List<String> ouptutStringList = new ArrayList<>();
        ouptutStringList=pb3.serialize(root);
        Node testRoot = deserialize(ouptutStringList,0,ouptutStringList.size()-1);
        System.out.println(ouptutStringList);
        System.out.println(testRoot);
    }

    public static void main(String args[]){
        System.out.println("Prob3_Google");
        Prob3_Google pb3 = new Prob3_Google();
        pb3.createTree();
    }
}


















