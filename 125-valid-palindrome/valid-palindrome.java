class Solution {
    public boolean isPalindrome(String s) {
        int left = 0; 
        int right = s.length() - 1;
        while(left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            if(!Character.toString(s.charAt(left)).equalsIgnoreCase(Character.toString(s.charAt(right)))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}