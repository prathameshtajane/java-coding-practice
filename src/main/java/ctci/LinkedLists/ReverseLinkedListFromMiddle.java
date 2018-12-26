package ctci.LinkedLists;

public class ReverseLinkedListFromMiddle {
    static Node getMiddleNode(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node fastRunner = head;
        Node slowRunner = head;
        while(fastRunner != null && fastRunner.next != null){
            slowRunner=slowRunner.next;
            fastRunner=fastRunner.next.next;
        }
        return slowRunner;
    }

    static Node getReverseLinkedListFromMiddle(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node previousNode = getMiddleNode(head);
        Node currentNode = previousNode.next;
        previousNode.next=null;
        Node nextNode;

        while(currentNode != null){
            nextNode=currentNode.next;
            currentNode.next=previousNode;
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        Node tail = getReverseLinkedListFromMiddle(head);
        while (head != null){
            System.out.println(head.data);
            head=head.next;
        }
        while (tail != null){
            System.out.println(tail.data);
            tail=tail.next;
        }
    }
}
