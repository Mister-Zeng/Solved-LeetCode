class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int nums1Pos = 0;
        int nums2Pos = 0;
        int curIndex = 0; 
        
        while(m > nums1Pos && n > nums2Pos){
            if(nums1[nums1Pos] < nums2[nums2Pos]){
                merged[curIndex] = nums1[nums1Pos];
                nums1Pos++;
            } else {
                merged[curIndex] = nums2[nums2Pos];
                nums2Pos++;
            }
            curIndex++;
        }
        
        System.arraycopy(nums1, nums1Pos, merged, curIndex, m - nums1Pos);
        System.arraycopy(nums2, nums2Pos, merged, curIndex, n - nums2Pos);
        
        for(int i = 0; i< nums1.length; i++){
            nums1[i] = merged[i];
        }
    }
}