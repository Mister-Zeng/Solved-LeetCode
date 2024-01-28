class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list = new HashSet<>();
        
        for(int i : nums1) {
            for(int j : nums2) {
                if (i == j) {
                    list.add(j);
                }
            }
        }
        
        int[] res = new int[list.size()];
        int k = 0;
        for(int l : list) {
            res[k++] = l;
        }
        
        return res;
    }
}