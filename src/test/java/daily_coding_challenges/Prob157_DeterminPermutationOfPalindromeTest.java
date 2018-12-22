package daily_coding_challenges;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob157_DeterminPermutationOfPalindromeTest {

    @Test
    void isPermutationOfPalidrome1() {
        Prob157_DeterminPermutationOfPalindrome testObj = new Prob157_DeterminPermutationOfPalindrome();
        String input="carrace";
        Assert.assertTrue(testObj.isPermutationOfPalidrome(input));
    }

    @Test
    void isPermutationOfPalidrome2() {
        Prob157_DeterminPermutationOfPalindrome testObj = new Prob157_DeterminPermutationOfPalindrome();
        String input="daily";
        Assert.assertFalse(testObj.isPermutationOfPalidrome(input));
    }

    @Test
    void isPermutationOfPalidrome3() {
        Prob157_DeterminPermutationOfPalindrome testObj = new Prob157_DeterminPermutationOfPalindrome();
        String input="d";
        Assert.assertTrue(testObj.isPermutationOfPalidrome(input));
    }

    @Test
    void isPermutationOfPalidrome4() {
        Prob157_DeterminPermutationOfPalindrome testObj = new Prob157_DeterminPermutationOfPalindrome();
        String input="cc";
        Assert.assertTrue(testObj.isPermutationOfPalidrome(input));
    }
}