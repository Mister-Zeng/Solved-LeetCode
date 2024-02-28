class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list1 = new HashSet<>();
        HashSet<Integer> list2 = new HashSet<>();
        
        for(int i : nums1) {
            list1.add(i);
        }
        
        for(int j : nums2) {
            if(list1.contains(j)) {
                list2.add(j);
            }
        }
        
        int[] res = new int[list2.size()];
        int k = 0;
        for(int l : list2) {
            res[k++] = l;
        }
        
        return res;
    }
}