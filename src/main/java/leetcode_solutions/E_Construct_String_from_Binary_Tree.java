package leetcode_solutions;

/**
 * 606. Construct String from Binary Tree
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.
 * <p>
 * The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.
 * <p>
 * Example 1:
 * Input: Binary tree: [1,2,3,4]
 * 1
 * /   \
 * 2     3
 * /
 * 4
 * <p>
 * Output: "1(2(4))(3)"
 * <p>
 * Explanation: Originallay it needs to be "1(2(4)())(3()())",
 * but you need to omit all the unnecessary empty parenthesis pairs.
 * And it will be "1(2(4))(3)".
 * Example 2:
 * Input: Binary tree: [1,2,3,null,4]
 * 1
 * /   \
 * 2     3
 * \
 * 4
 * <p>
 * Output: "1(2()(4))(3)"
 * <p>
 * Explanation: Almost the same as the first example,
 * except we can't omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.
 * <p>
 * link : https://leetcode.com/problems/construct-string-from-binary-tree/
 */
public class E_Construct_String_from_Binary_Tree {
    static StringBuilder op_string = new StringBuilder();
    /**
     * Definition for a binary tree node.
     **/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static void preOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        //visit root
        op_string.append(root.val);
        op_string.append("(");
        //recurse in left sub tree
        preOrderTraversal(root.left);
        //recurse in right sub tree and closing bracket
        preOrderTraversal(root.right);
        op_string.append(")");
    }

    public String tree2str(TreeNode root) {
        preOrderTraversal(root);
        //remove empty paranthesis
        for(int i = 0 ; i < op_string.length()-1; i++){
            if(op_string.charAt(i) == '(' && op_string.charAt(i+1) == ')'){
                op_string.deleteCharAt(i);
                op_string.deleteCharAt(i+1);
            }
        }
        return op_string.toString();

    }
}
