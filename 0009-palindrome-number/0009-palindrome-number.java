class Solution {
    public boolean isPalindrome(int x) {
        String intAsString = Integer.toString(x);
        int left = 0;
        int right = intAsString.length() - 1; 
        
        while(left < right) {
            if(intAsString.charAt(left) != intAsString.charAt(right)){
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}