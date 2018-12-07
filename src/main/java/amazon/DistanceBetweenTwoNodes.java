package amazon;

public class DistanceBetweenTwoNodes {
    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public  Node LCA(Node root, int n1, int n2)
    {
        if (root == null)
            return root;
        if (root.value == n1 || root.value == n2)
            return root;

        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);

        if (left != null && right != null)
            return root;
        if (left != null)
            return LCA(root.left, n1, n2);
        else
            return LCA(root.right, n1, n2);
    }

    public  int findLevel(Node root, int a, int level)
    {
        if (root == null)
            return -1;
        if (root.value == a)
            return level;
        int left = findLevel(root.left, a, level + 1);
        if (left == -1)
            return findLevel(root.right, a, level + 1);
        return left;
    }

    public  int findDistance(Node root, int a, int b)
    {
        Node lca = LCA(root, a, b);

        int d1 = findLevel(lca, a, 0);
        int d2 = findLevel(lca, b, 0);
        return d1+d2;
    }

//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//        root.right.left.right = new Node(8);

//        System.out.println(findDistance(root,4,3));
//        System.out.println(findDistance(root,4,6));
//        System.out.println(findDistance(root,4,8));
//        System.out.println(findDistance(root,3,8));
//    }
}
