package ctci.StacksAndQueues;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class SortStackTest {

    SortStack testObj ;

    @BeforeEach
    void setUp() {
        testObj = new SortStack();
    }

    @Test
    void sortStack() {
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(6);
        inputStack.push(16);
        inputStack.push(4);
        inputStack.push(5);
        inputStack.push(1);
        Object[] expectedSortedArray  = {16,6,5,4,1};
        Assert.assertArrayEquals(expectedSortedArray,testObj.sortStack(inputStack).toArray());
    }
}