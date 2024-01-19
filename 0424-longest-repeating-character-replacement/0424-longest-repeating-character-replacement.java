class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left = 0; 
        int result = 0; 
        int max = 0; 
        
        for(int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;
            max = Math.max(max, arr[s.charAt(right) - 'A']);
            
            if(right - left + 1 - max > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            
            result = Math.max(result, right - left + 1);
        }
        
        return result;
    }
}