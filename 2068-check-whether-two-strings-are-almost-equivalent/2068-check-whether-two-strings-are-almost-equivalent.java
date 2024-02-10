class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> mapOne = new HashMap<>();
        Map<Character, Integer> mapTwo = new HashMap<>();
        
        for(char c : word1.toCharArray()) {
            mapOne.put(c, mapOne.getOrDefault(c, 0) + 1);
        }
        
        for(char c : word2.toCharArray()) {
            mapTwo.put(c, mapTwo.getOrDefault(c, 0) + 1);
        }
        
        for(char c : mapOne.keySet()) {
            int mapTwoCount = mapTwo.getOrDefault(c, 0);
            if(Math.abs(mapOne.get(c) - mapTwoCount) > 3) {
                return false;
            }
        }
        
        for(char c : mapTwo.keySet()) {
            int mapOneCount = mapOne.getOrDefault(c, 0);
            if(Math.abs(mapTwo.get(c) - mapOneCount) > 3) {
                return false;
            }
        }
        
        
        
        return true;
    }
}