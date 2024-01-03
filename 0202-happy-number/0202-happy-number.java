class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while(!seen.contains(n) && n != 1) {
            seen.add(n);
            n = sumOfSquare(n);
        }
        
        return n == 1;
        
    }
    
    public int sumOfSquare(int n) {
        int output = 0; 
        
        while(n != 0) {
            int digit = n % 10;
            digit = digit * digit;
            output += digit; 
            
            n /= 10; 
        }
        
        return output;
    }
}