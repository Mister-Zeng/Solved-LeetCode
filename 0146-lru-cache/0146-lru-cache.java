class LRUCache {
    
    private class Node {
        int key, value;
        Node prev, next; 
        
        Node(int key, int value) {
            this.key = key;
            this.value = value; 
        }
        
        Node() {
            this(0, 0);
        }
    }
    
    private int capacity;
    private int count; 
    Map<Integer, Node> map;
    Node head, tail; 
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        tail.prev = head;
        head.next = tail; 
    }
    
    private void add(Node node) {
        Node after = head.next;
        head.next = node; 
        node.prev = head;
        node.next = after;
        after.prev = node; 
    }
    
    private void remove(Node node) {
        Node prev = node.prev; 
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    
    private void update(Node node) {
        remove(node);
        add(node);
    }
    
    public int get(int key) {
        Node n = map.get(key);
        if(n == null) return -1;
        update(n);
        return n.value; 
    }
    
    public void put(int key, int value) {
        Node n = map.get(key);
        if(n == null) {
            n = new Node(key, value);
            map.put(key, n);
            add(n);
            ++count;
        } else {
            n.value = value;
            update(n);
        }
        
        if(count > capacity) {
            Node prev = tail.prev; 
            remove(prev);
            map.remove(prev.key);
            --count;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */