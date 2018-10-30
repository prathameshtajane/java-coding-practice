package daily_coding_challenges;

/**
 * Given the root to a binary search tree, find the second largest node in the tree
 *
 * Step 1 : Create binary search tree
 * Step 2 : Apply reverse inorder till Kth count
 *
 */
public class Prob36_KthLargestElementInBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    static Node createBST(int[] inputarray ,int leftIndex,int rightIndex){
        if(leftIndex > rightIndex){
            return null;
        }

        int mid = (leftIndex+rightIndex)/2;
        Node root = new Node(inputarray[mid]);
        root.left=createBST(inputarray,leftIndex,mid-1);
        root.right=createBST(inputarray,mid+1,rightIndex);
        return root;
    }

    static class Count{
        int count=0;
        Count(int count){
            this.count=count;
        }
    }

    static void printReverseInOrder(Node root,Count c){
        if(root == null || c.count < 1){
            return;
        }
        printReverseInOrder(root.right,c);
        if(c.count == 1){
            System.out.println(root.data);
        }
        c.count-=1;
        printReverseInOrder(root.left,c);
    }

    public static void main(String args[]){
        int[] testInput = {1,2,3,4,5,6,7};
        Count c=new Count(3);
        Prob36_KthLargestElementInBST.printReverseInOrder(createBST(testInput,0,testInput.length-1),c);
    }

}
