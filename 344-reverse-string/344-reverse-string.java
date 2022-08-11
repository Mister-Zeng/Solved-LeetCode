class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int l = s.length - 1;
        
        recursion(s, i, l);
    }
    
    public char[] recursion(char[] s, int i, int l){
        if(l <= i){
            return s;
        } else {
            char temporary = s[i];
            s[i] = s[l];
            s[l] = temporary;
        }
        return recursion(s, i+1, l-1);
    }
}