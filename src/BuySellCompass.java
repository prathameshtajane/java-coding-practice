public class BuySellCompass {

    public int[] maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int minIndex = 0;
        int maxprofit = 0;
        int maxIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
                minIndex = i;
            }
            else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }


    public static void main(String args[]){
        BuySellCompass b = new BuySellCompass();
//        int[] input1 =  {7, 1, 5, 3, 6, 4};
//        int[] input1 =  {7, 6, 4, 3, 1};
//        int[] input1 =  {7,10};
        int[] input1 =  {7,1,5,10,0,5};

        System.out.println(b.maxProfit(input1)[0]);
        System.out.println(b.maxProfit(input1)[1]);
    }
}
