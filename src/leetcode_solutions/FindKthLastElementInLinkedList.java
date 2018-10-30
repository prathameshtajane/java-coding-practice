package leetcode_solutions;

/**
 * Find the Kth last element from the linked list
 */
public class FindKthLastElementInLinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }

        void appendToTail(int data){
            Node head = this;
            Node newNode = new Node(data);
            while(head.next !=null){
                head=head.next;
            }
            head.next=newNode;
        }
    }

     Node createLinkedList(int[] inputArray){
        Node head = new Node(inputArray[0]);
        for(int i=1;i<inputArray.length;i++){
            head.appendToTail(inputArray[i]);
        }
        return head;
    }

    int getKthLastElement(Node head,int kthIndex){
        if(head==null){
            return 0;
        }
        int index = getKthLastElement(head.next,kthIndex)+1;
        if(index == kthIndex){
            System.out.println(kthIndex+"th last element is : "+head.data);
        }
        return index;
    }

    public static void main(String args[]){
        System.out.println("FindKthLastElementInLinkedList");
        FindKthLastElementInLinkedList f = new FindKthLastElementInLinkedList();
        int[] testInput = {1,2,3,4,5,6,7,8,9,10};
        Node firstNode = f.createLinkedList(testInput);
        System.out.println(f.getKthLastElement(firstNode,4));
    }
}
