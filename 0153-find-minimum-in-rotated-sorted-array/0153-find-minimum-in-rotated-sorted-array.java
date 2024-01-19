class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            
            if ((middle == nums.length - 1 || nums[middle] < nums[middle + 1]) &&
                (middle == 0 || nums[middle] < nums[middle - 1])) {
                return nums[middle];
            }

            if (nums[middle] > nums[right]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        
        return -1;
    }
}
