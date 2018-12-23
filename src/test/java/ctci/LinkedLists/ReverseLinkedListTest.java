package ctci.LinkedLists;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void getReversedLinkedList1() {
        ReverseLinkedList testObj = new ReverseLinkedList();
        Node root = new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        root.next.next.next=new Node(4);
        String expectedWithoutReverse = "1234";
        String expectedWithReverse = "4321";
        Assert.assertEquals(expectedWithoutReverse,testObj.printLinkedList(root));
        Assert.assertEquals(expectedWithReverse,testObj.printLinkedList(testObj.getReversedLinkedList(root)));
    }
}