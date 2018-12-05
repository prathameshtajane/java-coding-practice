package com.company.QueueImplementation;

public class QueueMain {
    public static void main(String args[]){
        System.out.println("Queue Implementation Practice");
        System.out.println("Is queue EMPTY? : "+QueueOperations.isEmpty());
        QueueOperations.addNewNode(1);
        QueueOperations.addNewNode(2);
        QueueOperations.addNewNode(3);
        QueueOperations.addNewNode(4);
        System.out.println("Is queue EMPTY? : "+QueueOperations.isEmpty());
        QueueOperations.printQueue();
        QueueOperations.popNode();
        System.out.println("Is queue EMPTY? : "+QueueOperations.isEmpty());
        QueueOperations.printQueue();
    }
}
