class Solution {
    public boolean isPowerOfTwo(int n) {
        int result = n;
        
        if(n <= 0) return false;
        
       
        while(result != 1) {
            if (result % 2 == 1) {
                return false;
            } 
            result = result / 2;
        }
        
        return true;
    }
}