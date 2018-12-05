package com.company.QueueImplementation;

import com.company.Node;

public class QueueOperations {
    private static Node head;
    private static Node tail;

    public static Node createNode(int data){
        return new Node(data,null);
    }

    public static void addNewNode(int data){
        if(head==null){
            head=createNode(data);
            tail=head;
        }else{
            Node newNode=createNode(data);
            tail.setNextNode(newNode);
            tail=newNode;
        }
    }

    public static int popNode(){
        if(head==null){
            tail=null;
            System.out.println("Empty Queue");
            return 0;
        }else{
            int result=head.getData();
            head=head.getNextNode();
            return result;
        }
    }

    public static boolean isEmpty(){
        if(head==null){
            return  true;
        }else{
            return false;
        }
    }

    public static void printQueue(){
        if(head==null){
            System.out.println("Queue is empty");
        }else{
            Node printPointer=head;
            while(printPointer != null){
                System.out.println(printPointer.toString());
                printPointer=printPointer.getNextNode();
            }
        }
    }

}
