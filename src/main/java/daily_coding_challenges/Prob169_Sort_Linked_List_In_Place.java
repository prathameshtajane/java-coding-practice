package daily_coding_challenges;


/**
 * This problem was asked by Google.
 *
 * Given a linked list, sort it in O(n log n) time and constant space.
 *
 * For example, the linked list 4 -> 1 -> -3 -> 99 should become -3 -> 1 -> 4 -> 99.
 */

public class Prob169_Sort_Linked_List_In_Place {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    Node getMiddleNode(Node head){
        //base case
        // return if head node is null or its an only node in linked list
        if(head == null || head.next == null){
            return head;
        }

        Node slowRunner = head;
        Node fastRunner = head;

        while(fastRunner != null && fastRunner.next != null){
            slowRunner=slowRunner.next;
            fastRunner=fastRunner.next.next;
        }
        return slowRunner;
    }

    Node getMergedSortedLinkedList(Node a , Node b){
        if(a == null){
            return b;
        }

        if(b == null){
            return a;
        }

        Node result;
        if(a.val <= b.val){
            result = a;
            result.next=getMergedSortedLinkedList(a.next,b);
        }else{
            result = b;
            result.next=getMergedSortedLinkedList(a,b.next);
        }
        return result;
    }

    Node getSortedArrayInPlace(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node middleNode = getMiddleNode(head);
        Node nextToMiddleNode = middleNode.next;
        middleNode.next=null;
        Node left = getSortedArrayInPlace(middleNode);
        Node right = getSortedArrayInPlace(nextToMiddleNode);
        Node sortedList = getMergedSortedLinkedList(left,right);
        return sortedList;
    }
}
