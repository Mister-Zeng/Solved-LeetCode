class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        
        while(left < right){
            int mid = Math.floorDiv(left + right, 2);
            int midValue = nums[mid];
            
            if(midValue == target){
                return mid;
            } else if(midValue < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return -1;
    }
}