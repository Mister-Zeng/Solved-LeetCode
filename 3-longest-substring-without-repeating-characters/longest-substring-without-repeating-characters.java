class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>(); 
        int left = 0; 
        int right = 0;

        while (right < s.length()) {
            while (set.contains(s.charAt(right))) {
                 set.remove(s.charAt(left++));
            }

            set.add(s.charAt(right++));
            max = Math.max(max, right - left);
            
        }

        return max;
    }
}