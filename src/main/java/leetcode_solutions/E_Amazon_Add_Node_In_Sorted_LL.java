package leetcode_solutions;

/**
 * Given a sorted circularly linked list of Nodes that store integers and a new Node,
 * insert the new Node into the correct position. (Duplicates allowed)
 */
public class E_Amazon_Add_Node_In_Sorted_LL {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    public Node createLL(Integer[] sorted_arr){
        Node root = new Node(sorted_arr[0]);
        Node curr_heah = root;
        for(int i = 1 ; i < sorted_arr.length ; i++){
            Node head = new Node(sorted_arr[i]);
            curr_heah.next=head;
            curr_heah=head;
        }
        curr_heah.next=root;
        return root;
    }

    public Node getNewLinkedList(Node head,int new_num){
        Node prev = head;
        Node iterator_pointer = head;
        head=head.next;
        //edge case : when only one node in LL
        if(head == null){
            prev.next = new Node(new_num);
            return iterator_pointer;
        }
        while(true){
            //case 1 - adding new node in between two nodes
            //case 2 - adding new node at the end of LL
            if((head.val >= new_num && prev.val < new_num) || (head.val < new_num && prev.val > head.val)){
                Node new_node = new Node(new_num);
                prev.next=new_node;
                new_node.next=head;
                break;
            }
            prev=head;
            head=head.next;
        }
        return iterator_pointer;
    }
}
