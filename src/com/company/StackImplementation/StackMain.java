package com.company.StackImplementation;
public class StackMain {
    public static void main(String args[]){
        boolean isEmptyStack=StackOperations.isEmptyStack();
        System.out.println("Stack Empty Flag : "+isEmptyStack);

        StackOperations.addIntoStack(1);

        isEmptyStack=StackOperations.isEmptyStack();
        System.out.println("Stack Empty Flag : "+isEmptyStack);

        StackOperations.printStack();
        try{
        System.out.println("Popped Item : "+StackOperations.popfromStack());
        isEmptyStack=StackOperations.isEmptyStack();
        System.out.println("Stack Empty Flag : "+isEmptyStack);

        System.out.println("Popped Item : "+StackOperations.popfromStack());}
        catch (CustomException e){

        }

    }
}
