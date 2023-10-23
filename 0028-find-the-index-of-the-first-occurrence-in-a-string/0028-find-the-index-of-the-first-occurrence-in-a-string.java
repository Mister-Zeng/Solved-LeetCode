class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == "") return 0;
        
        for(int i = 0; i < haystack.length() + 1 - needle.length(); i++){
            if(haystack.substring(i, i + needle.length()).contains(needle)){
                return i;
            }
        }
       
        return -1;
    }
}