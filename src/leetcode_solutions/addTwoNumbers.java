package leetcode_solutions;

/**
 * 2. Add Two Numbers
 * Link : https://leetcode.com/problems/add-two-numbers/description/
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 Example
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.
 */

/**
 * Definition for singly-linked list.
 **/

public class addTwoNumbers {

    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int x) { val = x; }
    }

    public static ListNode outputLinkedListFirst;
    public static ListNode outputLinkedListCurrentPointer;
    public static int carryForward = 0;

    public void addDummyNode(){
        ListNode dummyNode = new ListNode(0);
        outputLinkedListCurrentPointer = dummyNode;
        outputLinkedListCurrentPointer = dummyNode;
    }

    public void addNodeInOutputLinkedList(int nodeValue){
        ListNode newNode = new ListNode(nodeValue);
        outputLinkedListCurrentPointer.next=newNode;
        outputLinkedListCurrentPointer=newNode;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        addDummyNode();
        while(l1.next != null && l2.next != null){
            if(l1.val + l2.val >= 10){
               addNodeInOutputLinkedList(l1.val+l2.val-10);
               carryForward = 1;
               l1.next.val=l1.next.val+carryForward;
               carryForward = 0;
            }else{
                addNodeInOutputLinkedList(l1.val+l2.val);
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1.val + l2.val >= 10){
            addNodeInOutputLinkedList(l1.val+l2.val-10);
            carryForward = 1;
            if(l1.next != null){
                l1.next.val=l1.next.val+carryForward;
                carryForward =0;
                l1 = l1.next;
            }else{
                l2.next.val=l2.next.val+carryForward;
                carryForward =0;
            }
        }else{
            addNodeInOutputLinkedList(l1.val+l2.val);
        }

        while(l1.next != null){
            addNodeInOutputLinkedList(l1.val);
        }

        while (l2.next != null){
            addNodeInOutputLinkedList(l2.val);
        }
        return outputLinkedListFirst.next;
    }
}
