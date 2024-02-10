class RandomizedSet {
    
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random rand;
    
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            map.put(val, list.size());
            list.add(val);
            return true;
        }
        
        return false;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)) {
            int lastElement = list.get(list.size() - 1);
            int index = map.get(val);
            
            list.set(index, lastElement);
            map.put(lastElement, index);
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }
        
        return false;
    }
    
    public int getRandom() {
        int item = rand.nextInt(list.size());
        return list.get(item);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */