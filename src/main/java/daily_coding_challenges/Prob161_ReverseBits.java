package daily_coding_challenges;

/**
 * This problem was asked by Facebook.
 *
 * Given a 32-bit integer, return the number with its bits reversed.
 *
 * For example, given the binary number 1111 0000 1111 0000 1111 0000 1111 0000,
 * return 0000 1111 0000 1111 0000 1111 0000 1111.
 */
public class Prob161_ReverseBits {

    // using bits operations
    int getReversedBitsInteger(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev << 1;
            if ((n & 1) == 1) {
                rev = rev ^ 1;
            }
            n = n >> 1;
        }
        return rev;
    }

}
