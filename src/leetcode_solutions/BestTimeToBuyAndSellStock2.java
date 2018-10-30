package leetcode_solutions;

import java.util.ArrayList;

/**
 *Say you have an array for which the ith element is the price of a given stock on day i.

 Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

 Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

 Example 1:

 Input: [7,1,5,3,6,4]
 Output: 7
 Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 Example 2:

 Input: [1,2,3,4,5]
 Output: 4
 Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 engaging multiple transactions at the same time. You must sell before buying again.
 Example 3:

 Input: [7,6,4,3,1]
 Output: 0
 Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 * Algo Link : https://www.youtube.com/watch?v=JaosdXkUWTs
 *
 */
public class BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        boolean getLocalMin = true;
        boolean getLocalMax = false;
        int localMin=0;
        int localMax=0;
        int profit = 0;
        ArrayList<Integer> minMaxPairs = new ArrayList<>();
        for(int i=0;i<prices.length;i++){
            if(getLocalMin){
                if( i != prices.length-1 && prices[i]<prices[i+1]){
                    localMin=prices[i];
                    getLocalMin = !getLocalMin;
                    getLocalMax = !getLocalMax;
                    minMaxPairs.add(localMin);
                }
            }else if(getLocalMax){
                if( i != prices.length-1 &&prices[i]>prices[i+1]){
                    localMax=prices[i];
                    getLocalMin = !getLocalMin;
                    getLocalMax = !getLocalMax;
                    minMaxPairs.add(localMax);
                }else if(i == prices.length-1){
                    localMax=prices[i];
                    getLocalMin = !getLocalMin;
                    getLocalMax = !getLocalMax;
                    minMaxPairs.add(localMax);
                }
            }

        }
        for(int j=0;j<minMaxPairs.size()-1;j=j+2){
            profit=profit+(minMaxPairs.get(j+1)-minMaxPairs.get(j));
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
        }

        return total;
    }

    public static void main(String args[]){
        System.out.println("BestTimeToBuyAndSellStock2");
        int[] inputArray = {100,180,260,310,40,535,695};
        BestTimeToBuyAndSellStock2 BT2 = new BestTimeToBuyAndSellStock2();
        System.out.println(BT2.maxProfit(inputArray));
        System.out.println(BT2.maxProfit2(inputArray));
    }
}
