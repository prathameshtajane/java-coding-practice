package ctci.LinkedLists;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ReturnKthToLastTest {

    @Test
    void getKthToLast1() {
        ReturnKthToLast testObj = new ReturnKthToLast();
        Node root = new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        root.next.next.next=new Node(4);
        int expectedOutput = 3;
        Assert.assertEquals(expectedOutput,testObj.getKthToLast(root,2));
    }

    @Test
    void getKthToLast2() {
        ReturnKthToLast testObj = new ReturnKthToLast();
        Node root = new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        root.next.next.next=new Node(4);
        int expectedOutput = 4;
        int k = 1;
        Assert.assertEquals(expectedOutput,testObj.getKthToLast(root,k));
    }

    @Test
    void getKthToLast3() {
        ReturnKthToLast testObj = new ReturnKthToLast();
        Node root = new Node(1);
        root.next=new Node(2);
        int expectedOutput = 2;
        int k = 1;
        Assert.assertEquals(expectedOutput,testObj.getKthToLast(root,k));
    }
}