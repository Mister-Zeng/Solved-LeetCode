class Solution {
    public String longestPalindrome(String s) {
        int resLen = 0;
        String sb = "";
        int sLen = s.length();
        
        for(int i = 0; i < sLen; i++) {
            int l = i; 
            int r = i;
            
            while (l >= 0 && 
                  r < sLen && 
                  s.charAt(l) == s.charAt(r)
                  ) {
                if((r - l + 1) > resLen) {
                    sb = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                
                l--;
                r++;
            }
            
            l = i;
            r = i + 1;
            
            while (l >= 0 && 
                  r < sLen && 
                  s.charAt(l) == s.charAt(r)
                  ) {
                if((r - l + 1) > resLen) {
                    sb = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                
                l--;
                r++;
            }
        }
        
        return sb;
    }
}