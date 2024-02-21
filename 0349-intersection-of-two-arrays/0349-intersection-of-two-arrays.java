class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> intMap = new HashMap<>();
        List<Integer> intList = new ArrayList<>();
        
        for(int i : nums1) {
            intMap.put(i, intMap.getOrDefault(i, 0) + 1);
        }
        
        for(int i : nums2) {
            if(intMap.containsKey(i)) {
                intList.add(i);
                intMap.remove(i);
            }
        }
        
        int[] result = new int[intList.size()];
        
        for(int i = 0; i < intList.size(); i++) {
            result[i] = intList.get(i);
        }
        
        return result;
        
    }
}