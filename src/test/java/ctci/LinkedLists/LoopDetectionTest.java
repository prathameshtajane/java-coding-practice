package ctci.LinkedLists;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopDetectionTest {

    @Test
    void isCircularLL1() {
        LoopDetection testObj = new LoopDetection();
        Node root = new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        Assert.assertNull(testObj.isCircularLL(root));
    }

    @Test
    void isCircularLL2() {
        LoopDetection testObj = new LoopDetection();
        Node root = new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        root.next.next.next=root;
        Assert.assertNotNull(testObj.isCircularLL(root));
    }

    @Test
    void getLoopStartNodeTest1(){
        LoopDetection testObj = new LoopDetection();
        Node root = new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        Assert.assertNull(testObj.getLoopStartNode(root));
    }

    @Test
    void getLoopStartNodeTest2(){
        LoopDetection testObj = new LoopDetection();
        Node root = new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        root.next.next.next=root;
        Node expectedLoopStartNode = root;
        Assert.assertEquals(expectedLoopStartNode,testObj.getLoopStartNode(root));
    }

    @Test
    void getLoopStartNodeTest3(){
        LoopDetection testObj = new LoopDetection();
        Node root = new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        root.next.next.next=root.next;
        Node expectedLoopStartNode = root.next;
        Assert.assertEquals(expectedLoopStartNode,testObj.getLoopStartNode(root));
    }

    @Test
    void getLoopStartNodeTest4(){
        LoopDetection testObj = new LoopDetection();
        Node root = new Node(1);
        Assert.assertNull(testObj.getLoopStartNode(root));
    }
}