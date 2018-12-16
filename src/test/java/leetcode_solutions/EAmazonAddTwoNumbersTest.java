package leetcode_solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EAmazonAddTwoNumbersTest {

    @Test
    void addTwoNumbersOptimal() {
        E_Amazon_addTwoNumbers testObj = new E_Amazon_addTwoNumbers();

        E_Amazon_addTwoNumbers.ListNode l1 = new E_Amazon_addTwoNumbers.ListNode(2);
        l1.next=new E_Amazon_addTwoNumbers.ListNode(4);
        l1.next.next=new E_Amazon_addTwoNumbers.ListNode(3);

        E_Amazon_addTwoNumbers.ListNode l2 = new E_Amazon_addTwoNumbers.ListNode(5);
        l1.next=new E_Amazon_addTwoNumbers.ListNode(6);
        l1.next.next=new E_Amazon_addTwoNumbers.ListNode(4);

        ListNode outputHead = new ListNode(7);

        Assert.assertEquals(outputHead.val,testObj.addTwoNumbersOptimal(l1,l2).val);
    }
}