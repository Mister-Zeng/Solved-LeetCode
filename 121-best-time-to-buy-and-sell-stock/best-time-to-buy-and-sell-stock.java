class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int lowest = Integer.MAX_VALUE;
        
        for (int price : prices) {
            lowest = Math.min(lowest, price);
            max = Math.max(max, price - lowest);
        }

        return max;
    }
}