package leetcode_solutions;

import java.util.ArrayList;
import java.util.List;

/**
 *  155. Min Stack
 *  Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
        push(x) -- Push element x onto stack.
        pop() -- Removes the element on top of the stack.
        top() -- Get the top element.
        getMin() -- Retrieve the minimum element in the stack.
 */



public class Min_Stack {
    /** initialize your data structure here. */
    class Node{
        Integer data=null;
        Integer curr_min=null;

        public Node(Integer data,Integer curr_min){
            this.data=data;
            this.curr_min=curr_min;
        }
    }

    public int min_value=Integer.MAX_VALUE;
    public List<Node> nodeLists  ;

    public Min_Stack() {
        nodeLists= new ArrayList<>();
    }

    public void push(int x) {
        Integer temp_x = x;
        // Specail Cases to be take care off :
        // 1. What of input is null ?
        if(x >= min_value || temp_x == null){
            Node newNode =  new Node(x,min_value);
            nodeLists.add(newNode);
        }else{
            Node newNode = new Node(x,x);
            min_value=x;
            nodeLists.add(newNode);
        }
    }

    public void pop() {
        nodeLists.remove(nodeLists.size()-1);
        // Cases to be take care off :
        // 1. What if stack is empty and pop() is performed ?
        // 2. Update min_value after every pop() operation
        if(nodeLists.size()==0){
            min_value=Integer.MAX_VALUE;
        }else{
            min_value=nodeLists.get(nodeLists.size()-1).curr_min;
        }
    }

    public int top() {
            return nodeLists.get(nodeLists.size() - 1).data;
    }

    public int getMin() {
            return nodeLists.get(nodeLists.size() - 1).curr_min;
    }

    public static void main(String args[]){
        Min_Stack minStack = new Min_Stack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.push(2147483647);
        minStack.push(-2147483648);
        minStack.pop();
        System.out.println(minStack.getMin());

    }
}
