class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> list = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            if(list.contains(nums[i])){
                return true;
            }
            list.add(nums[i]);
        }
        return false;
    }
}