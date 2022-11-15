class Solution {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];
        
        boolean first = true;
        while (first || fast != slow) {
            if (first) first = false;
            fast = nums[nums[fast]];
            slow = nums[slow];
            if(fast == slow) break;
        }
        
        int slow2 = nums[0];
          
        while (slow2 != slow) {
            slow = nums[slow];
            slow2 = nums[slow2];
            if(slow2 == slow) return slow2;
        }
        
        return slow2;
    }
}