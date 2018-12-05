//package daily_coding_challenges;
//
//import org.junit.Test;
//
//import static daily_coding_challenges.Prob1_Google.isPossible;
//import static org.junit.jupiter.api.Assertions.*;
//
//
//class Prob1_GoogleTest {
//
//    @Test
//    void isPossibleTest1() {
//        int[] inputArray = {10,15,3,7};
//        int result = 17;
//        assertTrue(isPossible(inputArray,result));
//    }
//
//    @Test
//    void isPossibleTest2() {
//        int[] inputArray = {10,15,3,7};
//        int result = 19;
//        assertFalse(isPossible(inputArray,result));
//    }
//
//    @Test
//    void isPossibleTest3() {
//        int[] inputArray = {};
//        int result = 19;
//        assertFalse(isPossible(inputArray,result));
//    }
//
//    @Test
//    void isPossibleTest5() {
//        int[] inputArray = {10};
//        int result = 19;
//        assertFalse(isPossible(inputArray,result));
//    }
//
//    @Test
//    void isPossibleTest6() {
//        int[] inputArray = {10};
//        int result = 10;
//        assertTrue(isPossible(inputArray,result));
//    }
//}