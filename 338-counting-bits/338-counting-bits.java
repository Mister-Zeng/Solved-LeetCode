class Solution {
    public int[] countBits(int n) {
        // an array to store each bit 
        int[] ans = new int[n + 1]; // n + 1 since we are including the index of 0
        
        // loop through from 0 to n 
        for(int i = 0; i <= n ; i++) {
            ans[i] = counts(i);
        }
        
        return ans;
    }
    
    // find amount of 1s in the bits
    public int counts(int num) {
        // variable to store counts 
        int count = 0;
        
        // using & bitwise operator 
        while(num != 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}