package appfolio;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReactionResidueTest {

    @Test
    void alchemicalReduction() {
        String input = "dabAcCaCBAcCcaDA";
        String expected_output = "dabCBAcaDA";
        ReactionResidue testObject = new ReactionResidue();
        Assert.assertEquals(expected_output,testObject.alchemicalReduction(input));
    }
}