package daily_coding_challenges;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob159_FirstRecurringCharacterTest {

    @Test
    void getFirstRecurringCharFromString1() {
        Prob159_FirstRecurringCharacter testObj = new Prob159_FirstRecurringCharacter();
        String input = "acbbac";
        Character expectedOutput = 'b';
        Assert.assertEquals(expectedOutput,testObj.getFirstRecurringCharFromString(input));
    }

    @Test
    void getFirstRecurringCharFromString2() {
        Prob159_FirstRecurringCharacter testObj = new Prob159_FirstRecurringCharacter();
        String input = "abcdef";
        Assert.assertNull(testObj.getFirstRecurringCharFromString(input));
    }

    @Test
    void getFirstRecurringCharFromString3() {
        Prob159_FirstRecurringCharacter testObj = new Prob159_FirstRecurringCharacter();
        String input = "aaccbbac";
        Character expectedOutput = 'a';
        Assert.assertEquals(expectedOutput,testObj.getFirstRecurringCharFromString(input));
    }

}