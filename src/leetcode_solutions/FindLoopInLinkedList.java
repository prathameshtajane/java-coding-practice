package leetcode_solutions;

/**
 *  Find loop in LinkedList
 *
 *  Approach :
 *  Slow Runner Pointer : jumps to next node
 *  Fast Runner Pointer : skips next node and jumps to next node
 */
public class FindLoopInLinkedList {

    static class LLNode{
        int data;
        LLNode next;

        LLNode(int data){
            this.data=data;
            next = null;
        }

        void addToNodeToTail(int data){
            LLNode first = this;
            LLNode newNode = new LLNode(data);
            while(first.next != null){
                first = first.next;
            }
            first.next=newNode;
        }


        void createLoopInLinkedList(){
            LLNode first = this;
            while(first.next != null){
             first=first.next;
            }
            first.next=this;
        }
    }



    static LLNode createLinkedList(int[] inputArray){
        LLNode firstNode = new LLNode(inputArray[0]);
        for(int i=1;i<inputArray.length;i++){
            firstNode.addToNodeToTail(inputArray[i]);
        }
        return firstNode;
    }

    static LLNode deleteNode(LLNode firstNode,int data){
        LLNode tempPointer = firstNode;
        if(firstNode.data == data){
            firstNode = firstNode.next;
            return firstNode;
        }

        while(tempPointer.next != null){
            if(tempPointer.next.data == data){
                tempPointer.next=tempPointer.next.next;
                return firstNode;
            }
            tempPointer=tempPointer.next;
        }
        return firstNode;
    }

    static boolean isLoopPresent(LLNode firstNode){
        LLNode slowPointer = firstNode;
        LLNode fastPointer = firstNode.next;

        if(slowPointer.next == null){
            return false;
        }

        if(fastPointer.next == null){
            return false;
        }

        while(slowPointer.next != null && fastPointer.next != null && fastPointer.next.next != null){
            if(slowPointer == fastPointer){
                return true;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println("FindLoopInLinkedList");
        int[] testInput = {1,2,3,4,5,6,7};
        LLNode FirstNode =FindLoopInLinkedList.createLinkedList(testInput);
        System.out.println(FindLoopInLinkedList.isLoopPresent(FirstNode));
        FirstNode.createLoopInLinkedList();
        System.out.println(FindLoopInLinkedList.isLoopPresent(FirstNode));
    }
}
