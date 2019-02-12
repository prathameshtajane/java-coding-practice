package ctci.StacksAndQueues;


import java.util.Stack;

/**
 *  3.5 Sort Stack

    Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
    an additonal temporary stack, but you may not copy the elements into any other data struture
    (such as an array). The stack support the following operations: pop, peek, and isEmpty.

 */


public class SortStack {
    public Stack<Integer> sortStack(Stack<Integer> inputStack){
        Stack<Integer> outputStack = new Stack<>();
        while(!inputStack.isEmpty()){
            int curr_num = inputStack.pop();
            while(!outputStack.isEmpty() && outputStack.peek() > curr_num){
                inputStack.push(outputStack.pop());
            }
            outputStack.push(curr_num);
        }

        /* copy elements from outputStack into  inputStack */
        while(!outputStack.isEmpty()){
            inputStack.push(outputStack.pop());
        }
        return inputStack;
    }
}
