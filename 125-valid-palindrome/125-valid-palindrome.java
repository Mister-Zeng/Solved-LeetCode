class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while(start < end) {
            char i = s.charAt(start);
            char j = s.charAt(end);
            
            if(!Character.isLetterOrDigit(i)) {
                start++;
                continue;
            };
            
            if(!Character.isLetterOrDigit(j)) {
                end--;
                continue;
            };
            
            if(Character.toLowerCase(i) != Character.toLowerCase(j)) {
                return false;
            };
            
            start++;
            end--;
        }
        
        return true;
    }
}