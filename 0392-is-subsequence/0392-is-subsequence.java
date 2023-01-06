class Solution {
    public boolean isSubsequence(String s, String t) {
        int s1 = 0;
        int s2 = t.length();
        
        if(t.length() < s.length()){
            return false;
        } else if(s.length() == 0) {
            return true;
        }
        
        
        for(int i = 0; i < s2; i++){
            if(s.charAt(s1) == t.charAt(i)){
                s1++;
            }
            
            if(s1 == s.length()){
                return true;
            }
        }
        
        return false;
    }
}