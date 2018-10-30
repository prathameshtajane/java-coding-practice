/**
 * Remove duplicates from an unsorted linked list
 */

package ctci;

import java.util.HashSet;

class RemoveDupsFromUnsortedLinkedList{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static void removeDuplicates(Node head){
        Node currentNode = head;
        Node previousNode = null;
        HashSet<Integer> hs = new HashSet<>();
        while(currentNode != null){
            if(hs.contains(currentNode.data)){
                previousNode.next=currentNode.next;
            }else{
                hs.add(currentNode.data);
                previousNode = currentNode;
            }
            currentNode=currentNode.next;
        }
    }

    public static void printLinkedList(Node head){
        while(head != null){
            System.out.println("Node Data : "+head.data);
            head=head.next;
        }
    }

    public static void main(String args[]){
        System.out.println("Generating LinkedList Node");
        Node firsNode = new Node(1);
        firsNode.next = new Node(2);
        firsNode.next.next = new Node(2);
        firsNode.next.next.next = new Node(3);
        System.out.println("Original Linked List");
        printLinkedList(firsNode);
        removeDuplicates(firsNode);
        System.out.println("Modified Linked List");
        printLinkedList(firsNode);
    }
}