class Solution {
    public int romanToInt(String s) {
        if(s.length() == 0) return 0;
        Map<Character, Integer> romanDictionary = new HashMap<>();
        romanDictionary.put('I', 1);
        romanDictionary.put('V', 5);
        romanDictionary.put('X', 10);
        romanDictionary.put('L', 50);
        romanDictionary.put('C', 100);
        romanDictionary.put('D', 500);
        romanDictionary.put('M', 1000);

        Map<String, Integer> multiCharRomanDictionary = new HashMap<>();
        multiCharRomanDictionary.put("IV", 4);
        multiCharRomanDictionary.put("IX", 9);
        multiCharRomanDictionary.put("XL", 40);
        multiCharRomanDictionary.put("XC", 90);
        multiCharRomanDictionary.put("CD", 400);
        multiCharRomanDictionary.put("CM", 900);
        
        int total = 0;
        int i = 0;

        while (i < s.length()) {
            if (i < s.length() - 1 && multiCharRomanDictionary.containsKey(s.substring(i, i + 2))) {
                total += multiCharRomanDictionary.get(s.substring(i, i + 2));
                i += 2;
            } else {
                total += romanDictionary.get(s.charAt(i));
                i++;
            }
        }

        return total;
    }
}