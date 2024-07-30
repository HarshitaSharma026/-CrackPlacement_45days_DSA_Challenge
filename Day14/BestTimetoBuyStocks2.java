// Medium: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[buy]) {
                profit += prices[i] - prices[buy];
            }
            // beacuse i can buy and sell it on the same day also.
            buy = i;
        }
        return profit;
    }
}

// REVISE --
//Same as "best time to buy stock1", with one change that change 'buy' to prices[I] everytime.

// it is done using greedy algo : **(learn more on greedy algo).**
// Time complexity : O(n)
// Space complexity: O(1)