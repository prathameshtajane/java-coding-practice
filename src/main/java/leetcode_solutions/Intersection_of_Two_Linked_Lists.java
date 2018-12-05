package leetcode_solutions;

/**
 * 160. Intersection of Two Linked Lists
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * Notes:
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 *
 * Algorithm :
 *  1. Run through each linked list to get legths and tail
 *  2. Compare the tails.If they are different (by reference,not by value),return immediately.There is no intersection
 *  3. Set two pointers to start of each linked list
 *  4. On the longer linked list,advance its pointer by the difference in lengths
 *  5. Now,traverse on each linked list until the pointers are the same
 *
 */

//Definition for singly-linked list.

class ListNode {
  int val;
  ListNode next;

  ListNode(int x){
      val = x;
      next = null;
  }
}



public class Intersection_of_Two_Linked_Lists {

    class Result{
        ListNode currentNode;
        int length;
        public Result(ListNode currentNode,int length){
            this.currentNode=currentNode;
            this.length=length;
        }
    }

    public Result getLastNodeAndLength(ListNode head){
        int length=1;
        ListNode lastNode;
        while(head.next != null){
            length++;
            head=head.next;
        }
        Result returnResult = new Result(head,length);
        return returnResult;
    }

    public ListNode skipLongerLinkedList(ListNode head,int count){
        while(count != 0){
            head = head.next;
            count--;
        }
        return head;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Speacial Case
        if(headA == headB){
            return headA;
        }

        //Speacial Case
        if(headA == null || headB == null){
            return null;
        }

        Result LinkedListA = getLastNodeAndLength(headA);
        Result LinkedListB = getLastNodeAndLength(headB);

        //If end node LinkedList A and LinkedList B is different that means there does not intersect
        if(LinkedListA.currentNode != LinkedListB.currentNode){
            return null;
        }

        ListNode longerListNode = LinkedListA.length >= LinkedListB.length ? headA : headB;
        ListNode shorterListNode = LinkedListA.length < LinkedListB.length ? headA : headB;

        ListNode newLongerListNode = skipLongerLinkedList(longerListNode,Math.abs(LinkedListA.length-LinkedListB.length));

        while(newLongerListNode != null || shorterListNode != null){
            if(newLongerListNode == shorterListNode){
                return newLongerListNode;
            }else{
                newLongerListNode=newLongerListNode.next;
                shorterListNode=shorterListNode.next;
            }
        }
        return null;
    }
}
