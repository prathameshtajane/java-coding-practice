package ctci.LinkedLists;

/**
 * Reverse a linked list
 */

public class ReverseLinkedList {
    Node getReversedLinkedList(Node head){

        //speacial case
        if(head.next == null || head == null){
            return head;
        }

        Node currentNode = head;
        Node previous = null;
        Node nextNode= null;

        while(currentNode != null){
            nextNode=currentNode.next;
            //actual reversal happens here
            currentNode.next=previous;
            previous=currentNode;
            currentNode=nextNode;
        }
        return previous;
    }

    String printLinkedList(Node head){
        StringBuffer accum = new StringBuffer();
        while(head != null){
            accum.append(head.data);
            head=head.next;
        }
        return accum.toString();
    }
}
