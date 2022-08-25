class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}

/*
class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        int c;
        
        for(int i = 0; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
*/