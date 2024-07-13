class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0; 
        int pow = 1; 
        
        for(int i = columnTitle.length() - 1; i >= 0; i--) {
            ans += (columnTitle.charAt(i) - 64) * pow;
            pow *= 26;
        }
        
        return ans;
    }
}