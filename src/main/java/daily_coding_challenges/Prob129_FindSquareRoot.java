package daily_coding_challenges;


/**
 * Given a real number n, find the square root of n. For example, given n = 9, return 3.
 *
 * Algorithm :
 * This method can be derived from (but predates) Newton–Raphson method.
 * 1. Start with an arbitrary positive start value x (the closer to the root, the better).
 * 2. Initialize y = 1.
 * 3. Do following until desired approximation is achieved.
 *    a) Get the next approximation for root using average of x and y
 *    b) Set y = n/x
 */

public class Prob129_FindSquareRoot {

    private static float getSquareRoot(int n){
        float x = n;
        float y = 1;
        float e = 0.000001f; /* e decides the accuracy level*/
        while(x - y > e)
        {
            x = (x + y)/2;
            y = n/x;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Daily Coding Problem: Problem #129");
        System.out.println(getSquareRoot(2));
    }
}
