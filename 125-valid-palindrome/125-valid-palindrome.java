class Solution {
    public boolean isPalindrome(String s) {
        // intialize and compare the start of string to end of string
        int i = 0;
        int j = s.length() - 1; 
        
        // compare letter from start to end of string until reached middle 
        while(i < j) {
            // 
            char start = s.charAt(i);
            char end = s.charAt(j);
            
            // skip all except for letters or digit
            if(!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }
            
            // if compared dont match, it not a palindrome
            if(Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            
            // next letter to compare
            i++;
            j--;
        }

        return true;
    }
}