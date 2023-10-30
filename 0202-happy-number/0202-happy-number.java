class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visit = new HashSet<Integer>();
        
        while(!visit.contains(n)) {
            visit.add(n);
            n = sumOfSquare(n);
            
            if(n == 1){
                return true;
            }
        }
        
        return false;
        
    }
    
    public int sumOfSquare(int num) {
        int output = 0;
        
        while(num != 0){
            int digit = num % 10;
            digit = digit * digit; 
            output += digit;
            num = num / 10;
        }
        
        return output;
    }
}