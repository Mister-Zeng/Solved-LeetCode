class Solution {
    public boolean winnerOfGame(String colors) {
        int countA = 0;
        int countB = 0;
        
        for(int i = 1; i < colors.length() - 1; i++) {
            if(colors.charAt(i) == colors.charAt(i - 1) && colors.charAt(i) == colors.charAt(i + 1)) {
                if(colors.charAt(i) == 'A') countA++;
                else if(colors.charAt(i) == 'B') countB++;
            } 
        }
        
        return countA > countB;
    }
}