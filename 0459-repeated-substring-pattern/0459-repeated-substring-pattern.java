class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int size = s.length(); 
        
        for(int len = size / 2; len > 0; len--) {
            if(size % len == 0) {
                int subStringLength = size / len; 
                String substring = s.substring(0, len);
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < subStringLength; i++) {
                    sb.append(substring);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        
        return false;
    }
}