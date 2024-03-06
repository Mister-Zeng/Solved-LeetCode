class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int dp0 = 0, dp1 = 0, curr;
        
        for(int num : nums) {
            curr = Math.max(dp0 + num, dp1);
            dp0 = dp1;
            dp1 = curr;
        }
        
        return Math.max(dp0, dp1);
    }
}