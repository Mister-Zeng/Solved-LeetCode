class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> list = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num; 
            
            // check if contains num 
            if(list.containsKey(num)){
                return new int[] {list.get(num), i};
            }
            
            list.put(diff, i);
        }
        return new int[] {};
    }
}
