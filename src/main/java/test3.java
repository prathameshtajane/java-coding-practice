/**
 * Sorted array
 * integers [2,3,4,5,7,9,10]
 * mid_element = 4
 * make_node
 *
 * function buildBinaryTree(array,lowElment,highElement){
 *     1. find mid
 *     2. creating node <-mid
 *     3. node.left = buildBinaryTree(arr,lowElment,mid-1)
 *     4. node.right = buildBinaryTree(arr,mid+1,highElement)
 * }
 */
public class test3 {
    class Node{
        int data;
        Node left=null;
        Node right=null;

        public Node(int data){
            this.data=data;
        }

        @Override
        public String toString() {
            return data+" "+left.data+" "+right.data;
        }
    }

    public Node buildBinaryTree(int[] arr,int lowIndex,int highIndex){
        int mid = 0;
        //breaking condition
        if(highIndex < lowIndex){
            return null;
        }
        mid = (lowIndex+highIndex)/2;
        Node tempNode = new Node(arr[mid]);
        tempNode.left = buildBinaryTree(arr,lowIndex,mid-1);
        tempNode.right = buildBinaryTree(arr,mid+1,highIndex);
        return tempNode;
    }

    public static void main(String args[]){
      //main method
        int[] testArray = {2,3,4,5,6,7,9,10};
        test3 t = new test3();
        Node root=t.buildBinaryTree(testArray,0,testArray.length-1);
    }
}
