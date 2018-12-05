package daily_coding_challenges;
/*

This problem was asked by Square.

Given a string and a set of characters, return the shortest substring containing all the characters in the set.

For example, given the string "figehaeci" and the set of characters {a, e, i}, you should return "aeci".

If there is no substring containing all the characters in the set, return null.

todo : complete implementation of Sliding Window

Example 1:
    ADOBECODEBANC
    ABC

    [ADOBEC]ODEBANC
    ADO[BECODEBA]NC
    ADOBE[CODEBA]NC
    ADOBECODE[BANC]

    return smallest of (ADOBEC,BECODEBA,CODEBA,BANC) => BANC

Example 2:
    FIGEHAECI
    AEI

    F[IGEHA]ECI
    FIG[EHAECI]
    FIGEH[AECI]
    FIGEHA[ECI] <- Breaking condition

    return smallest of (IGEHA,EHAECI,AECI) => AECI
 */
public class Prob103_FindShortestSubstringWithGivenCharset {
    public static void main(String args[]){
        System.out.println("Prob103_FindShortestSubstringWithGivenCharset");
    }
}
