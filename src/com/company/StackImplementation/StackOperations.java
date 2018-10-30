package com.company.StackImplementation;

import java.util.EmptyStackException;


class CustomException extends Exception{
    public CustomException() {
        System.out.println("Custom Exception Invoked");
    }
}

public class StackOperations {
    private static Node top;

    public static void initialiseStack(int data){
        top=new Node(data,null);
    }

    public static Node creatNewNode(int data){
        Node newNode=new Node(data,null);
        return newNode;
    }

    public static void addIntoStack(int data){
        if(top==null){
            top=creatNewNode(data);
        }else{
            Node newNode=creatNewNode(data);
            newNode.setNextNode(top);
            top=newNode;
        }
    }

    public static int popfromStack() throws CustomException{
        if(top==null) throw new CustomException();
        int result=top.getData();
        top=top.getNextNode();
        return result;
    }

    public static int peekStack(){
        if(top == null) throw new EmptyStackException();
        return top.getData();
    }

    public static void printStack(){
    if(top==null){
        System.out.println("Stack is empty");
    }else{
        Node printPointer;
        printPointer=top;
        while(printPointer != null){
            System.out.println(printPointer.toString());
            printPointer=printPointer.getNextNode();
        }
    }
    }

    public static boolean isEmptyStack(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }

}
