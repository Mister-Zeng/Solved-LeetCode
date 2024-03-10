class Solution {
    public int countSubstrings(String s) {
        int stringLength = s.length(); 
        
        if (s.length() < 2) return stringLength;
        
        int result = 0;
        
        for(int i = 0; i < stringLength; i++) {
            int left = i;
            int right = i; 
            
            while(left >= 0 && 
                  right < stringLength && 
                  s.charAt(left) == s.charAt(right)
                 ) {
                result++;
                left--;
                right++;
            }
            
            left = i;
            right = i + 1; 
            
            while(left >= 0 && 
                  right < stringLength && 
                  s.charAt(left) == s.charAt(right)
                 ) {
                result++;
                left--;
                right++;
            }
        }
        
        return result;
    }
}