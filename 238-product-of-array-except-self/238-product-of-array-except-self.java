class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        
        int[] result = new int[length];
        
        result[0] = 1;
        
        for(int i = 1; i < length; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        };
        
        int R = 1;
        for(int i = length - 1; i >= 0; i--) {
            result[i] = result[i] * R;
            R = nums[i] * R;
        };
        
        
        return result;
    }
}