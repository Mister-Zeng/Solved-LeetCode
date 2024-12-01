class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        return Math.max(getMax(nums, 0, nums.length - 2), getMax(nums, 1, nums.length - 1));
    }

    public int getMax(int[] nums, int start, int end) {
        int prev = 0;
        int max = 0;

        for (int i = start; i <= end; i++) {
            int temp = Math.max(max, nums[i] + prev);
            prev = max; 
            max = temp;
        }

        return max;
    }
}