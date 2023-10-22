class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int position = 0;

        while(position < nums.length){
            if(nums[position] == -1) break;
            if(nums[position] == val){
                for(int j = position; j < nums.length - 1; j++){
                    nums[j] = nums[j+1];
                }
                
                nums[nums.length - 1] = -1;
            } else {
                position++;
                count++;
            }
        }
        
        return count;
    }
}