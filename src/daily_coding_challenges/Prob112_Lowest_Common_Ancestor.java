package daily_coding_challenges;

public class Prob112_Lowest_Common_Ancestor {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    private static TreeNode createBST(int[] sorted_arr, int start_index,int end_index){
        if(start_index > end_index){
            return null;
        }
        int mid = (start_index+end_index)/2;
        TreeNode root = new TreeNode(sorted_arr[mid]);
        root.left = createBST(sorted_arr,start_index,mid-1);
        root.right = createBST(sorted_arr,mid+1,end_index);
        return root;
    }

    private static TreeNode findLowestCommonAncestor(TreeNode root , int p , int q) {
        //base condition
        if(root == null){
            return null;
        }

        if(root.val == p || root.val == q){
            return root;
        }

        TreeNode left = findLowestCommonAncestor(root.left,p,q);
        TreeNode right = findLowestCommonAncestor(root.right,p,q);

        if(left != null && right != null){
            return root;
        }else{
            if(left != null){
                return left;
            }else{
                return right;
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Prob112_Lowest_Common_Ancestor");
        TreeNode root = createBST(new int[]{1,2,3,4,5,6,7,8,9,10},0,9);
        TreeNode lca_node = findLowestCommonAncestor(root,6,10);
        if(lca_node != null){
            System.out.println(lca_node.val);
        }else{
            System.out.println("No LCA found !");
        }

    }
}
