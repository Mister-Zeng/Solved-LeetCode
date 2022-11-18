class Solution {
    public boolean isPowerOfTwo(int n) {
        int result = n;
        
        if(n == 1) return true;
        
        if(n <= 0) return false;
        
        if (result % 2 == 1) {
                return false;
         } 
        
        while(true) {
            result = result / 2;
            
            if(result == 1) {
                return true;
            } else if (result % 2 == 1) {
                return false;
            } 
            
        }
    }
}