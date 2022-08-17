class Solution {
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
}