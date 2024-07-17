// Easy : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int profit = 0;

        for(int i = 0; i < prices.length; i++) {
            if (prices[buy] > prices[i]) {
                buy = i;
            }
            else {
                if (prices[i] - prices[buy] > profit) {
                    profit = prices[i] - prices[buy];
                }
            }
        }
        return profit;
    }
}

// Using 2-pointer and kind of kadane's algorithm, because we are keeping track of profit at the current index. 

// Time Complexity : O(n)
// Space Complexity: O(1)
