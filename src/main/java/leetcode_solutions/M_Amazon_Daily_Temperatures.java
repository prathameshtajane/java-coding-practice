package leetcode_solutions;

import java.util.Stack;

/**
 * 739. Daily Temperatures
 *
 * Given a list of daily temperatures T, return a list such that, for each day in the input,
 * tells you how many days you would have to wait until a warmer temperature.
 * If there is no future day for which this is possible, put 0 instead.
 *
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
 * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 *
 * Note: The length of temperatures will be in the range [1, 30000].
 * Each temperature will be an integer in the range [30, 100].
 *
 * Link : https://leetcode.com/problems/daily-temperatures/description/
 */


public class M_Amazon_Daily_Temperatures {

    protected int[] dailyTemperatures(int[] T) {
        int[] op_list = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < T.length ; i++){
            while (!stack.isEmpty() && T[i] > T[stack.peek()]){
                int index = stack.pop();
                op_list[index]=i-index;
            }
            stack.push(i);
        }
        return op_list;
    }
}
