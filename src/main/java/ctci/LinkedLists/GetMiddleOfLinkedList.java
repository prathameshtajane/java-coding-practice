package ctci.LinkedLists;

public class GetMiddleOfLinkedList {
    int getMiddleNodeOfLinkedList(Node head){
        Node slowPointer = head;
        Node fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        return slowPointer.data;
    }
}
