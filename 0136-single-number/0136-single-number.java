class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> storage = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(storage.containsKey(nums[i])){
                storage.put(nums[i], storage.get(nums[i]) + 1);
            } else {
                storage.put(nums[i], 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : storage.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return -1;
    }
}