package daily_coding_challenges;


class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

public class Prob89_ValidateBST {

    boolean validateBST(Node root,int min,int max){
        if(root == null){
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        return validateBST(root.left,min,root.data) && validateBST(root.right,root.data,max);
    }

    public static void main(String args[]){
        System.out.println("Prob89_ValidateBST");
    }
}
