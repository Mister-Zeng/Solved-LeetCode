class Solution {
    public int[] twoSum(int[] numbers, int target) {
         HashMap<Integer, Integer> list = new HashMap<>();
        
        for(int i = 0; i < numbers.length ; i++) {
            int num = numbers[i];
            int diff = target - num;
            
            if(list.containsKey(num)) {
                return new int[] {list.get(num), i+1};
            }
            
            list.put(diff, i+1);
        };
        
        return new int[] {};
    }
}