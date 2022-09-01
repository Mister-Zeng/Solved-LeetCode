class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 0;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[prev]) {
                prev++;
                nums[prev] = nums[i];
            }
        }
        return prev + 1;
    }
}