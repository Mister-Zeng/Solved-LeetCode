class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int degree = 0; 
        
        Map<Integer, Integer> firstSeenMap = new HashMap<>();
        int minCount = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            firstSeenMap.putIfAbsent(current, i);
            countMap.put(current, countMap.getOrDefault(current, 0) + 1);
            if(countMap.get(current) > degree) {
                degree = countMap.get(current);
                minCount = i - firstSeenMap.get(current) + 1;
            } else if(countMap.get(current) == degree) {
                minCount = Math.min(minCount, i - firstSeenMap.get(current) + 1);
            }
        }
        
        return minCount;
    }
}