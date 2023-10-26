class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i : nums){
            if(myMap.containsKey(i)){
                myMap.put(i, myMap.get(i) + 1);
            } else {
                myMap.put(i, 1);
            }
        }

        // Convert HashMap to a list of key-value pairs
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(myMap.entrySet());

        // Sort the list based on values in descending order
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Create a new sorted HashMap from the sorted list
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = sortedMap.entrySet().iterator();
        int[] result = new int[k];
        int count = 0;
        while(iterator.hasNext() && count < k ){
            Map.Entry<Integer, Integer> entry = iterator.next();
            Integer key = entry.getKey();
            result[count] = key;
            count++;
        }
        
        return result;
    }
}