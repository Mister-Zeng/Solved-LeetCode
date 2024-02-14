class MyHashMap {
    
    int[] list; 
    
    public MyHashMap() {
        list = new int[1000001];
        Arrays.fill(list, -1);
    }
    
    public void put(int key, int value) {
        list[key] = value;
    }
    
    public int get(int key) {
        return list[key];
    }
    
    public void remove(int key) {
        list[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */