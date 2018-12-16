package leetcode_solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class E_Amazon_Vertical_Order_Tree_Traversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static Map<Integer,List<Integer>> treeMap = new TreeMap<>();

    public static void verticalOrderUtil(TreeNode root,int count) {
        if(root != null){
            int newCount=count;
            if(root.left != null){
                newCount = count-1;
            }
            verticalOrderUtil(root.left,newCount);
            //visit
            List<Integer> tempList = treeMap.getOrDefault(count,new ArrayList<>());
            tempList.add(root.val);
            treeMap.put(count,tempList);

            if(root.right != null){
                newCount = count+1;
            }
            verticalOrderUtil(root.right,newCount);
        }
    }


    public static List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> outputList = new ArrayList<>();
        if(root != null) {
            verticalOrderUtil(root, 0);
            for(Map.Entry<Integer,List<Integer>> entry: treeMap.entrySet()){
                outputList.add(entry.getValue());
            }
        }else{
            return null;
        }
        return outputList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        verticalOrder(root);
    }
}
