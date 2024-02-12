class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> countMap = new HashMap<>();
        int degree = 0; 
        int minCount = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            countMap.putIfAbsent(current, new int[] {i, 0});
            countMap.get(current)[1] = countMap.get(current)[1] + 1;

            if(countMap.get(current)[1] > degree) {
                degree = countMap.get(current)[1];
                minCount = i - countMap.get(current)[0] + 1;
            } else if(countMap.get(current)[1] == degree) {
                minCount = Math.min(minCount, i - countMap.get(current)[0] + 1);
            }
        }
        
        return minCount;
    }
}