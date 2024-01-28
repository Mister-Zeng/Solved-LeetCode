class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0; 
        int left = 0;
        int right = 0; 
        
        while (right <= nums.length - 1) {
            sum += nums[right];
            max = Math.max(max, sum);
            
            if(sum < 0) {
                sum = 0;
            }
            
            if(nums[right] + sum < sum) {
                left++;
            }
            
            right++;
        }
        return max; 
    }
}