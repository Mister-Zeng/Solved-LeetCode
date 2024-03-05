class Solution {
    public String longestPalindrome(String s) {
        int stringLength = s.length(); 
        String res = "";
        int resultLength = 0;
        
        for(int i = 0; i < stringLength; i++) {
            int left = i;
            int right = i; 
            
            while(left >= 0 && 
                  right < stringLength && 
                  s.charAt(left) == s.charAt(right)
                 ) {
                if(right - left + 1 > resultLength) {
                    res = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }
                
                left--;
                right++;
            }
            
            left = i;
            right = i + 1;
            
            while(left >= 0 && 
                  right < stringLength && 
                  s.charAt(left) == s.charAt(right)
                 ) {
                if(right - left + 1 > resultLength) {
                    res = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }
                
                left--;
                right++;
            }
        }
        
        return res;
    }
}