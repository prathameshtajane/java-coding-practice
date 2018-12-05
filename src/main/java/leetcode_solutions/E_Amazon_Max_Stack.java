package leetcode_solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Design a max stack that supports push, pop, top, peekMax and popMax.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Remove the element on top of the stack and return it.
 * top() -- Get the element on the top.
 * peekMax() -- Retrieve the maximum element in the stack.
 * popMax() -- Retrieve the maximum element in the stack, and remove it. If you find more than one maximum elements, only remove the top-most one.
 *
 * Example 1:
 * MaxStack stack = new MaxStack();
 * stack.push(5);
 * stack.push(1);
 * stack.push(5);
 * stack.top(); -> 5
 * stack.popMax(); -> 5
 * stack.top(); -> 1
 * stack.peekMax(); -> 5
 * stack.pop(); -> 1
 * stack.top(); -> 5
 *
 * Note:
 * -1e7 <= x <= 1e7
 * Number of operations won't exceed 10000.
 * The last four operations won't be called when stack is empty.
 *
 * link : https://leetcode.com/problems/max-stack/description/
 */

public class E_Amazon_Max_Stack {

    Deque<Node> stack;

    private class Node {
        int val;
        Node max_node;

        Node(int val) {
            this.val = val;
            this.max_node = this;
        }

        //parameterised constructor
        Node(int val, Node max_node) {
            this.val = val;
            this.max_node = (val > max_node.max_node.val) ? this : max_node;
        }
    }

    /** initialize your data structure here. */
    public E_Amazon_Max_Stack() {
        stack=new ArrayDeque<>();
    }
    //Push element x onto stack.
    public void push(int x) {
        if(!stack.isEmpty()) {
            stack.addLast(new Node(x, stack.peekLast().max_node));
        }else {
            stack.addLast(new Node(x));
        }
    }

    // This operation won't be called when stack is empty
    // Remove the element on top of the stack and return it.
    public int pop() {
        try{
            return stack.removeLast().val;
        } catch (Exception e){
            System.out.println("Pop operation called on empty stack");
            return Integer.MAX_VALUE;
        }
    }

    // This operation won't be called when stack is empty
    // Get the element on the top.
    public int top() {
        try{
            return stack.getLast().val;
        } catch (Exception e){
            System.out.println("Top operation called on empty stack");
            return Integer.MAX_VALUE;
        }
    }

    // this operation won't be called when stack is empty
    // Retrieve the maximum element in the stack.
    public int peekMax() {
        return stack.peekLast().max_node.val;
    }

    // this operation won't be called when stack is empty
    // Retrieve the maximum element in the stack, and remove it. If you find more than one maximum elements, only remove the top-most one.
    //todo : Test this operation
    public int popMax() {
        Node max_node = stack.peekLast().max_node;
        Deque<Node> temp_stack = new ArrayDeque<>();

        while (stack.peekLast().max_node.val != max_node.val){
            temp_stack.addLast(stack.removeLast());
        }
        //removing max_node from temp_stack
        if(!temp_stack.isEmpty()) {
            temp_stack.removeLast();
            //pushing nodes in stack after removing current max_node
            while (!temp_stack.isEmpty()){
                stack.push(temp_stack.removeLast());
            }
        }else {
            stack.removeLast();
        }

        return max_node.max_node.val;
    }

    public static void main(String[] args) {
        System.out.println("716. Max Stack");
        E_Amazon_Max_Stack stack = new E_Amazon_Max_Stack();
        //stack.push(5);
        stack.push(5);
        //stack.push(1);
        stack.push(1);
        //stack.push(5);
        stack.push(5);
        //stack.top(); -> 5
        System.out.println(stack.top());
        //stack.popMax(); -> 5
        System.out.println(stack.popMax());
        //stack.top(); -> 1
        System.out.println(stack.top());
        //stack.peekMax(); -> 5
        System.out.println(stack.peekMax());
        //stack.pop(); -> 1
        System.out.println(stack.pop());
        //stack.top(); -> 5
        System.out.println(stack.top());
    }
}
