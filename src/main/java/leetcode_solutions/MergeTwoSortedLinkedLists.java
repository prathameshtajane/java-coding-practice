package leetcode_solutions;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.

 Example:

 Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4

 */
public class MergeTwoSortedLinkedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }else if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }

        ListNode finalHead = new ListNode(0);
        ListNode finalTail=new ListNode(0);
        finalTail=finalHead;
        while(l1 != null && l2 !=null){
            if(l1.val <= l2.val){
                finalTail.next=new ListNode(l1.val);
                l1=l1.next;
            }else if(l1.val > l2.val){
                finalTail.next=new ListNode(l2.val);
                l2=l2.next;
            }
            finalTail = finalTail.next;
        }

        while(l1 != null){
            finalTail.next=new ListNode(l1.val);
            finalTail=finalTail.next;
            l1=l1.next;
        }

        while(l2 != null){
            finalTail.next=new ListNode(l2.val);
            finalTail=finalTail.next;
            l2=l2.next;
        }

        return finalHead.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        l1.next=new ListNode(1);
        l1.next.next=new ListNode(2);
        l1.next.next.next=new ListNode(3);
        l2.next=new ListNode(1);
        l2.next.next=new ListNode(2);
        l2.next.next.next=new ListNode(3);
//        mergeTwoLists(l1,l2);
    }
}
