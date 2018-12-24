package ctci.LinkedLists;

public class GetMiddleOfLinkedList {
    int getMiddleNodeOfLinkedList(Node head){
        //edge case
        if(head == null){
            return -1;
        }

        Node slowPointer = head;
        Node fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        return slowPointer.data;
    }
}
