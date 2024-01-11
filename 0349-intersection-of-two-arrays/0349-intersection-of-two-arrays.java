class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // initiate a set for result 
        Set<Integer> set = new HashSet<>(); 
        
        // For loop for i array 
        for(int i : nums1 ){
            // Nested for the other j array
            for(int j : nums2){
                // Check if element from i and j match and add to the set 
                if(i == j) {
                    set.add(j);
                }
            }
        }
            
        int setSize = set.size();
        int result[] = new int[setSize];
        
        int i = 0; 
        for(int s : set) {
            result[i++] = s;
        }
        
        return result;
                
                
    }
}