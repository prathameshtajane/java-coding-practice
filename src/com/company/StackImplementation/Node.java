package com.company.StackImplementation;

public class Node {
    private int data;
    private Node next;

    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }

    public Node getNextNode(){
        return this.next;
    }

    public void setNextNode(Node nextNode){
        this.next=nextNode;
    }

    public int getData(){
        return this.data;
    }


    @Override
    public String toString(){
        return "Data : "+data;
    }

}
