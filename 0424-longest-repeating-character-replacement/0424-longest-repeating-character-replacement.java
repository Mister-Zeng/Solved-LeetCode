class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        
        int res = 0;
        int max = 0;
        int left = 0; 
        
        for(int j = 0; j < s.length(); j++) {
            arr[s.charAt(j) - 'A']++;
            max = Math.max(max, arr[s.charAt(j) - 'A']);
            
            if(j - left + 1 - max > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            
            res = Math.max(res, j - left + 1);
        }
        
        return res;
    }
}