package careermonk.tree;

public class Prob1_FindMaxInBT {
    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int data){
            this.data=data;
        }
    }



    static TreeNode createBinaryTree(int[] inputArray,int leftIndex,int rightIndex){
        //base condition
        if(leftIndex > rightIndex){
            return null;
        }
        int midIndex=(leftIndex+rightIndex)/2;
        TreeNode root = new TreeNode(inputArray[midIndex]);
        root.left=createBinaryTree(inputArray,leftIndex,midIndex-1);
        root.right=createBinaryTree(inputArray,midIndex+1,rightIndex);
        return root;
    }

    static int getMaxElementFromTree(TreeNode root){
        int left,right,max=Integer.MIN_VALUE;
        if(root != null){
            left = getMaxElementFromTree(root.left);
            right = getMaxElementFromTree(root.right);
            if(left > right){
                max=left;
            }else if(right >= left){
                max=right;
            }
            if(root.data > max){
                max=root.data;
            }
        }
        return max;
    }

    public static void main(String args[]){
        System.out.println("Prob1_FindMaxInBT");
        int[] testInput = {1,2,3,4,5,6,7,8};
        System.out.println(Prob1_FindMaxInBT.getMaxElementFromTree(Prob1_FindMaxInBT.createBinaryTree(testInput,0,testInput.length-1)));
    }

}
