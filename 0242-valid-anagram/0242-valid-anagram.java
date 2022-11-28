class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        int[] list = new int[26];
        for(int i = 0 ; i < s.length(); i++) {
            list[s.charAt(i) - 'a']++;
            list[t.charAt(i) - 'a']--;
        }
        
        for(int c : list) {
            if(c != 0) {
                return false;
            }
        }
        
        return true;
    }
}


    /*
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        if(sArray.length != tArray.length) {
            return false;
        }
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        for(int k = 0; k < sArray.length; k++){
            if(sArray[k] != tArray[k]) {
                return false;
            }
        }
        
        return true;
    }
    */