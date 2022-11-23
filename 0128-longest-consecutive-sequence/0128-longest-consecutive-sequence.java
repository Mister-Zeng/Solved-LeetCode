class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        
        int longestTime = 0;
        for(int num : nums) list.add(num);
        for(int num : nums) {
            if(!list.contains(num - 1)) {
                int length = 0;
                while(list.contains(num + length)) {
                    length++;
                    longestTime = Math.max(longestTime, length);
                }
            }
        }
        
        return longestTime;
    }
}