class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0; 
        
        for(int i : prices){
            min = Math.min(min, i);
            maxProfit = Math.max(maxProfit, i - min);
        }
        
        return maxProfit;
    }
}