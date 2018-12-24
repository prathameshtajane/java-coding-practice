package ctci.LinkedLists;

/**
 * Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
 * Definition :
 * Circular linked list - A circular linked list in which a node's next pointer points to an earlier node, so as to
 * make a loop in the linked list.
 *
 * Example :
 * Input : A -> B -> C -> D -> E -> C
 * Output : C
 */
public class LoopDetection {

    /**
     * @return Node if true else null
     */
    Node isCircularLL(Node root){
       if(root == null || root.next == null){
           return null;
       }
       Node slowPointer = root;
       Node fastPointer = root;

       while(slowPointer != null && fastPointer != null && fastPointer.next != null){
           slowPointer=slowPointer.next;
           fastPointer=fastPointer.next.next;
           if(slowPointer == fastPointer){
               return slowPointer;
           }
       }
       return null;
    }

    /**
     * Detect loop in given circular linked list if present.If its not a circular linked list returns null
     * @param root : Linked List start node
     * @return Node where loop start if there is a loop in given linked list else null
     */
    Node getLoopStartNode(Node root){
        Node circularLLNode = isCircularLL(root);
        if(circularLLNode != null){
            Node headPointer = root;
            while(circularLLNode != headPointer){
                circularLLNode=circularLLNode.next;
                headPointer=headPointer.next;
            }
        }
        return circularLLNode;
    }
}
