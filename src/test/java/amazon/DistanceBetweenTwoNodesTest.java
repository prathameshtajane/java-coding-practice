package amazon;

import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DistanceBetweenTwoNodesTest {

    @Test
    @Tag("Default test case 1")
    void findDistance1() {
        DistanceBetweenTwoNodes.Node root = new DistanceBetweenTwoNodes.Node(1);
        root.left = new DistanceBetweenTwoNodes.Node(2);
        root.right = new DistanceBetweenTwoNodes.Node(3);
        root.left.left = new DistanceBetweenTwoNodes.Node(4);
        root.left.right = new DistanceBetweenTwoNodes.Node(5);
        root.right.left = new DistanceBetweenTwoNodes.Node(6);
        root.right.right = new DistanceBetweenTwoNodes.Node(7);
        root.right.left.right = new DistanceBetweenTwoNodes.Node(8);
        DistanceBetweenTwoNodes testObj = new DistanceBetweenTwoNodes();
        int expectedDistance = 3;
        Assert.assertEquals(expectedDistance,testObj.findDistance(root,4,3));
    }

    @Test
    @Tag("Default test case 2")
    void findDistance2() {
        DistanceBetweenTwoNodes.Node root = new DistanceBetweenTwoNodes.Node(1);
        root.left = new DistanceBetweenTwoNodes.Node(2);
        root.right = new DistanceBetweenTwoNodes.Node(3);
        root.left.left = new DistanceBetweenTwoNodes.Node(4);
        root.left.right = new DistanceBetweenTwoNodes.Node(5);
        root.right.left = new DistanceBetweenTwoNodes.Node(6);
        root.right.right = new DistanceBetweenTwoNodes.Node(7);
        root.right.left.right = new DistanceBetweenTwoNodes.Node(8);
        DistanceBetweenTwoNodes testObj = new DistanceBetweenTwoNodes();
        int expectedDistance = 1;
        Assert.assertEquals(expectedDistance,testObj.findDistance(root,1,3));
    }
}