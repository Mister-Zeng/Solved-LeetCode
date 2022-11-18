class Solution {
    public boolean isPowerOfTwo(int n) {
        int result = n;
        
        if(n <= 0) return false;
        
       
        while(true) {
            if(result == 1) {
                return true;
            } else if (result % 2 == 1) {
                return false;
            } 
            result = result / 2;
        }
    }
}