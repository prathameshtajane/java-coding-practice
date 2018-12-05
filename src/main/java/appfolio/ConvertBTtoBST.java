package appfolio;


/*
    Convert Binary Tree to Binary Search Tree without changing spatial structure.

    Algorithm :
    step 1 : In-order traversal of BT
    step 2 : Arrays.sort(In-order traversal of BT)
    step 3 : Iterating BT in In-order fashion

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertBTtoBST {

    private static class TreeNode{
        int data;
        TreeNode right;
        TreeNode left;
        TreeNode(int data){
            this.data=data;
        }
    }

    static List<Integer> in_order_list = new ArrayList<>();
    static int in_order_list_pointer = 0;

    private static void inOrderTravesal(TreeNode root,boolean is_replace){
        if(root != null){
            inOrderTravesal(root.left,is_replace);
            if(is_replace){
                root.data=in_order_list.get(in_order_list_pointer++);
            }else{
                in_order_list.add(root.data);
            }
            inOrderTravesal(root.right,is_replace);
        }
    }

    private static String levelOrderTravesal(TreeNode root){
        StringBuffer op_string = new StringBuffer();
        List<TreeNode> level_order_list = new ArrayList<>();
        level_order_list.add(root);
        level_order_list.add(null);

        while(!level_order_list.isEmpty()){
            TreeNode curr_node = level_order_list.get(0);
            level_order_list.remove(0);
            if(curr_node == null && level_order_list.size() == 0){
                op_string.append('\n');
                return op_string.toString();
            }else{
                if(curr_node == null){
                    level_order_list.add(null);
                    op_string.append('\n');
                    continue;
                }else{
                    op_string.append(curr_node.data+" ");
                    if(curr_node.left != null){
                        level_order_list.add(curr_node.left);
                    }
                    if(curr_node.right != null){
                        level_order_list.add(curr_node.right);
                    }
                }
            }
        }
        return op_string.toString();
    }

    public static void main(String[] args) {
        System.out.println("Convert Binary Tree to Binary Search Tree without changing spatial structure");
        TreeNode root = new TreeNode(0);
        root.left=new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right=new TreeNode(2);

        System.out.println(levelOrderTravesal(root));

        //step 1
        inOrderTravesal(root,false);
        //step 2
        Collections.sort(in_order_list);
        //step 3
        inOrderTravesal(root,true);

        System.out.println(levelOrderTravesal(root));
//        System.out.println(root.right.data);

    }
}
