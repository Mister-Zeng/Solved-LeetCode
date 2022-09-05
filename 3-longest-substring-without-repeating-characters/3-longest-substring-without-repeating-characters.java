class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0; 
        HashSet<Character> window = new HashSet<>();
        
        int left = 0, right = 0;
        while(right < s.length()) {
            while(window.contains(s.charAt(right))) {
                window.remove(s.charAt(left++));
            }
            window.add(s.charAt(right++));
            maxLength = Math.max(maxLength, right - left);
        }
        
        return maxLength;
    }
}