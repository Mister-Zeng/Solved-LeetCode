class Solution {
    public int maxProduct(int[] nums) {
        int left = 1;
        int right = 1;
        int res = nums[0]; 
        
        for(int i = 0; i < nums.length; i++) {
            left = left == 0 ? 1 : left;
            right = right == 0 ? 1 : right;
            
            left *= nums[i];
            right *= nums[nums.length - 1 - i]; 
            
            res = Math.max(res, Math.max(left, right));
        }
        
        return res;
    }
}