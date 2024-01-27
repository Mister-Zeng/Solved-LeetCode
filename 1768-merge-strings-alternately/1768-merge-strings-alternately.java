class Solution {
    public String mergeAlternately(String word1, String word2) {
        int longerStringLength = word1.length() > word2.length() ? word1.length() : word2.length();
        
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < longerStringLength; i++){
            if(i < word1.length()) {
                res.append(word1.charAt(i));
            }
            
            if(i < word2.length()) {
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }
}