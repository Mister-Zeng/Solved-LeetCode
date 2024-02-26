class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numOfOccur = new HashMap<>();
        int[] res = new int[Math.min(nums1.length, nums2.length)];

        for(int i : nums1) {
            numOfOccur.put(i, numOfOccur.getOrDefault(i, 0) + 1);
        }

        int i = 0;
        for(int num : nums2) {
            if(numOfOccur.containsKey(num) && numOfOccur.get(num) > 0) {
                res[i] = num;
                numOfOccur.put(num, numOfOccur.get(num) - 1);
                i++;
                
            }
        }
         
        return Arrays.copyOfRange(res, 0, i);
    }
}