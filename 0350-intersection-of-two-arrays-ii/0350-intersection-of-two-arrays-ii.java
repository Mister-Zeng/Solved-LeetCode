class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();
        Map<Integer, Integer> numOfOccurrence = new HashMap<>();
        
        for(int i : nums1) {
            numOfOccurrence.put(i, numOfOccurrence.getOrDefault(i, 0) + 1);
        }
        
        for(int i : nums2) {
            if(numOfOccurrence.containsKey(i) && numOfOccurrence.get(i) > 0) {
                resultList.add(i);
                numOfOccurrence.put(i, numOfOccurrence.get(i) - 1);
            }
        }
        
        int[] result = new int[resultList.size()];
        
        for(int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}