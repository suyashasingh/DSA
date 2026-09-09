class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int min = prices[0];
        int max = 0;

        for(int i = 1; i < n ; i++){
            min = Math.min(min, prices[i]);
            int profit = prices[i]-min;
            max = Math.max(max, profit);
        }
        return max;
        
    }
}

// Profit = Selling Price - Buying Price