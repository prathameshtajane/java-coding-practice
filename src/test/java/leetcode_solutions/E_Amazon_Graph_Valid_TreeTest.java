package leetcode_solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E_Amazon_Graph_Valid_TreeTest {

    @Test
    void validTree() {
        E_Amazon_Graph_Valid_Tree testObj = new E_Amazon_Graph_Valid_Tree();
        int n = 5;
        int[][] input = {{0,1},{0,2},{0,3},{1,4}};
        assertTrue(testObj.validTree(n,input));
    }

    @Test
    void validTree2() {
        E_Amazon_Graph_Valid_Tree testObj = new E_Amazon_Graph_Valid_Tree();
        int n = 5;
        int[][] input = {{0,1},{1,2},{2,3},{1,3},{1,4}};
        assertFalse(testObj.validTree(n,input));
    }
}