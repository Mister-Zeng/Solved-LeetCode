class Solution {
    public int addDigits(int num) {        
        return sumRecursion(num);
    }
    
    public int sumRecursion(int numsArray){        
        if(numsArray < 10) {
            return numsArray;
        }
        int sum = 0;
        while (numsArray > 0) {
            sum += numsArray % 10; 
            numsArray /= 10;
        }

        return sumRecursion(sum); 
    }
}