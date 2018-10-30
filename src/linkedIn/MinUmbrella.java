package linkedIn;

import java.util.Arrays;
import java.util.List;

/**
 * Created by prathamesh on 9/29/18.
 */
public class MinUmbrella {

    static int minCoins(List<Integer> p, int n)
    {
        // table[i] will be storing
        // the minimum number of coins
        // required for i value. So
        // table[V] will have result
        int table[] = new int[n + 1];

        int m =p.size();
        // Base case (If given value V is 0)
        table[0] = 0;

        // Initialize all table values as Infinite
        for (int i = 1; i <= n; i++)
            table[i] = Integer.MAX_VALUE;

        // Compute minimum coins required for all
        // values from 1 to V
        for (int i = 1; i <= n; i++)
        {
            // Go through all coins smaller than i
            for (int j = 0; j < m; j++)
                if (p.get(j) <= i)
                {
                    int sub_res = table[i - p.get(j)];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }

        }
        return table[n] == 2147483647 ? -1 : table[n];

    }

    public static void main (String[] args)
    {
        Integer coins[] = {2,3,5};
        int m = coins.length;
        int V = 8;
        System.out.println ( "Minimum coins required is "
                + minCoins(Arrays.asList(coins),V));
    }
}
