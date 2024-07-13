class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0; 
        boolean letter = false; 
        for(int i = s.length() - 1; i >= 0; i--) {
            if(letter == false && s.charAt(i) == ' ') {
                continue;
            }
            if(i > 0) letter = true;
            if(s.charAt(i) == ' ') return length;
            length++;
        }
        
        return length;
    }
}