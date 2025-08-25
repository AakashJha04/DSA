class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minn = prices[0];
        int profit = 0;
        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
            minn = Math.min(minn, prices[i]);
            profit = prices[i] - minn;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}