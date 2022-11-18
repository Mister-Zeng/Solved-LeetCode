class Solution {
    public boolean isUgly(int n) {
        if( n <= 0 ) return false;
        
        n = divide(n, 2);
        n = divide(n, 3);
        n = divide(n, 5);
        
        return n == 1;
    }
    
    public int divide(int a, int b){
        while(a % b == 0) a = a / b;
        
        return a;
    }
}