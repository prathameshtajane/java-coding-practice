package leetcode_solutions;

/**
 * Given a linked list, determine if it has a cycle in it.
 * Link : https://leetcode.com/problems/linked-list-cycle/description/
 *
 * Algorithm :
 *
 * Floyd’s Cycle-Finding Algorithm:
 * This is the fastest method. Traverse linked list using two pointers.
 * Move one pointer by one and other pointer by two.
 * If these pointers meet at some node then there is a loop.
 * If pointers do not meet then linked list doesn’t have loop.
 */


public class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
        val = x;
        next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        //boundary case
        if(head == null || head.next == null){
            return false;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        /*
        * Take care of three conditions :
        * 1. When slow pointer crosses the end node
        * 2. When fast pointer crosses the end node
        * 3. When fast pointer reaches end of Linkned List
        * */

        while(slowPointer != null && fastPointer != null && fastPointer.next != null){

            //Pointer has to be set first
            slowPointer = slowPointer.next;
            fastPointer=fastPointer.next.next;

            if(slowPointer == fastPointer){
                return true;
            }
        }
        return false;
    }
}
