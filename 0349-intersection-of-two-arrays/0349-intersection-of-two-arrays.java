class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>(); 
        
        for(int i : nums1 ){
            for(int j : nums2){
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