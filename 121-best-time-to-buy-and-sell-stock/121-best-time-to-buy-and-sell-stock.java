class Solution {
    public int maxProfit(int[] prices) {
        // variable to hold lowest price in stock price
        int min = Integer.MAX_VALUE;
        
        // variable to store max profit
        int maxProfit = 0;
        
        // loop through array
        for(int price : prices) {
            // find lowest price 
            min = Math.min(min, price);
            // find maximum profit by subtracting from highest price to the lowest price
            maxProfit = Math.max(maxProfit, price - min);
        }
        return maxProfit;
    }
}