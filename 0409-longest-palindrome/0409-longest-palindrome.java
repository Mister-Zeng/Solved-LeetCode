class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[128];
        int result = 0;
        
        if(s.length() == 1) return 1;
        
        for (char c: s.toCharArray())
            charCount[c]++;
        
        for(int c : charCount) {
            result += c / 2 * 2;
            if (result % 2 == 0 && c % 2 == 1)
                result++;
        }
        
        return result;
    }
}