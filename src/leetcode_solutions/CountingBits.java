package leetcode_solutions;

import java.util.Arrays;

/**
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's
 * in their binary representation and return them as an array.
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 *
 * By-heart this logic :
 * f[i] = f[i/2] + (i % 2);
 *
 */

public class CountingBits {

    public int[] countBits(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++)
//            f[i] = f[i >> 1] + (i & 1);
            f[i] = f[i/2] + (i % 2);
        return f;
    }

    public static void main(String args[]){
        CountingBits CB = new CountingBits();
        System.out.println(Arrays.toString(CB.countBits(5)));
    }
}
