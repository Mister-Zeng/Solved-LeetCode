class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();
        
        for(int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            int difference = target - current; 
            
            if(result.containsKey(current)) {
                return new int[]{result.get(current), i+1};
            }
            
            result.put(difference, i+1);
        }
        return new int[]{};
    }
}