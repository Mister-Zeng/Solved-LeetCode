class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        
        int longest = 0;
        for(int num : nums) list.add(num);
        for(int num : nums) {
            if(!list.contains(num - 1)) {
                int length = 0;
                while(list.contains(num + length)) {
                    length++;
                    longest = Math.max(longest, length);
                }
            }
        }
        
        return longest;
    }
}