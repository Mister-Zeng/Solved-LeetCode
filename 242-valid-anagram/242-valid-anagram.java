class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = new char[s.length()];
        char[] tArray = new char[t.length()];
        
        for(int i = 0; i < s.length(); i++) {
            sArray[i] = s.charAt(i);
        }
        for(int j = 0; j < t.length(); j++) {
            tArray[j] = t.charAt(j);
        }
        
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
}