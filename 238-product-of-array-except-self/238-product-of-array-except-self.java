class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        
        int[] pre = new int[length];
        int[] post = new int[length];
        
        int[] result = new int[length];
        
        pre[0] = 1;
        post[length-1] = 1;
        
        for(int i = 1; i < length; i++) {
            pre[i] = nums[i - 1] * pre[i - 1];
        };
        
        for(int i = length - 2; i >= 0; i--) {
            post[i] = nums[i + 1] * post[i + 1];
        };
        
        for(int i = 0; i < length; i++){
            result[i] = pre[i] * post[i];
        }
        
        return result;
    }
}