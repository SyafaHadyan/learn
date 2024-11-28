package syafa.java.leetcode;

public class BestTimeToBuyAndSellStock
{
    class Solution
    {
        public int maxProfit(int[] prices)
        {
            int lowestPrice = prices[0];
            int highestPrice = Integer.MIN_VALUE;
            int profit = 0;
            for (int i = 1; i < prices.length; i++)
            {
                if (prices[i] < lowestPrice)
                {
                    lowestPrice = prices[i];
                    continue;
                }
                if (prices[i] > highestPrice)
                {
                    highestPrice = prices[i];
                }
                if (prices[i] - lowestPrice > profit)
                {
                    profit = prices[i] - lowestPrice;
                }
            }
            return profit;
        }
    }
}