package ctci.LinkedLists;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetMiddleOfLinkedListTest {

    @Test
    void getMiddleNodeOfLinkedList1() {
        GetMiddleOfLinkedList testObj = new GetMiddleOfLinkedList();
        Node root = new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        root.next.next.next=new Node(4);
        int expectedOutput = 3;
        Assert.assertEquals(expectedOutput,testObj.getMiddleNodeOfLinkedList(root));
    }

    @Test
    void getMiddleNodeOfLinkedList2() {
        GetMiddleOfLinkedList testObj = new GetMiddleOfLinkedList();
        Node root = new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        int expectedOutput = 2;
        Assert.assertEquals(expectedOutput,testObj.getMiddleNodeOfLinkedList(root));
    }

    @Test
    void getMiddleNodeOfLinkedList3() {
        GetMiddleOfLinkedList testObj = new GetMiddleOfLinkedList();
        Node root = null;
        int expectedOutput = -1;
        Assert.assertEquals(expectedOutput,testObj.getMiddleNodeOfLinkedList(root));
    }

    @Test
    void getMiddleNodeOfLinkedList4() {
        GetMiddleOfLinkedList testObj = new GetMiddleOfLinkedList();
        Node root = new Node(1);
        int expectedOutput = 1;
        Assert.assertEquals(expectedOutput,testObj.getMiddleNodeOfLinkedList(root));
    }
}