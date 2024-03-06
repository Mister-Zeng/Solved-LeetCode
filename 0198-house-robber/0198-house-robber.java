class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        
        int robIncludingLastHouse = 0;
        int robWithoutIncludingLastHouse = 0; 
        
        for(int num : nums) {
            int temp = Math.max(robWithoutIncludingLastHouse + num, robIncludingLastHouse);
            robWithoutIncludingLastHouse = robIncludingLastHouse;
            robIncludingLastHouse = temp;
        }
        
        return robIncludingLastHouse;
    }
}