package leetcode_solutions;

/**
 * 206. Reverse Linked List
 * Reverse a singly linked list.
 *
 * Hint:
 *  A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 *  Solution :
 *  Iterative Method

    1.  Initialize three pointers prev as NULL, curr as head and next as NULL.
    2.  Iterate through the linked list. In loop, do following.
        // Before changing next of current,
        // store next node
        next = curr->next

        // This is where actual reversing happens
        curr->next = prev

        // Move prev and curr one step forward
        prev = curr
        curr = next
 */


//Definition for singly-linked list.
class Node {
  int val;
  Node next;
  Node(int x) { val = x; }
}


public class ReverseLinkedList {

    public Node reverseList(Node head) {
        //speacial case
        if(head.next == null || head == null){
            return head;
        }
        Node prevNode=null;
        Node currNode=head;
        Node nextNode=head.next;

        while(currNode.next != null){
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        return prevNode;
    }
}
