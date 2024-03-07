class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];

        return Math.max(
            rob(nums, 0, length - 1),
            rob(nums, 1, length)
        );
    }
    
    public int rob(int[] nums, int start, int end) {
        if (nums == null || nums.length == 0) return 0;

        int dp0 = 0, dp1 = 0;
        
        for(int i = start; i < end; i++) {
            int curr = Math.max(dp0 + nums[i], dp1);
            dp0 = dp1;
            dp1 = curr;
        }
        
        return Math.max(dp0, dp1);
    }
}
