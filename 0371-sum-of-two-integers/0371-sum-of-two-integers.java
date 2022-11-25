class Solution {
    public int getSum(int a, int b) {
        // check if 
        while(b != 0) {
            // find the bit & value and shift over by 1
            // store in a temp variable since you want to use the old a value
            int temp = (a & b) << 1;
            
            // find the bit XOR value
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}