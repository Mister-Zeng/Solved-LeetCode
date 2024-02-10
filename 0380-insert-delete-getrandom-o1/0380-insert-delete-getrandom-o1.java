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
            map.put(val, val);
            list.add(val);
            return true;
        }
        
        return false;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)) {
            map.remove(val);
            int index = list.indexOf(val);
            list.remove(index);
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