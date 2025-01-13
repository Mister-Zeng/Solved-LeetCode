class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>(); 
        Map<String, List<String>> map = new HashMap<>(); 

        for(String s : strs) {
            char[] hash = new char[26]; 

            for(char c : s.toCharArray()) {
                hash[c - 'a']++; 
            }

            String hashedString = new String(hash); 

            if (!map.containsKey(hashedString)) {
                map.put(hashedString, new ArrayList<>());
            }

            map.get(hashedString).add(s);
        }

        result.addAll(map.values());

        return result;

    }
}