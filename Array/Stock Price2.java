//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2
class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int profit = 0, maxProfit = 0, minProfit = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            minProfit = Math.min(prices[i], minProfit);
            int current_profit = prices[i] - minProfit;
            maxProfit = Math.max(maxProfit, current_profit);
        }
        return maxProfit;
    }
}
