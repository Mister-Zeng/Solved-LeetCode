class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int total = 0; 
        int save = 0;
        int maxSave = 0; 
        
        for(int i = 0, j = 0; j < customers.length; j++) {
            total += grumpy[j] == 0 ? customers[j] : 0; 
            save += grumpy[j] == 1 ? customers[j] : 0; 
            
            if(j - i + 1 > minutes) {
                save -= grumpy[i] == 1 ? customers[i] : 0; 
                i++;
            }
            
            maxSave = Math.max(maxSave, save);
        }
        
        return total + maxSave;
    }
}