class LRUCache {
    
    class Node {
        int key;
        int value; 
        Node prev;
        Node next;
        
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
        
        Node() {
            this(0, 0); 
        }
    }
    
    int capacity;
    int count; 
    Map<Integer, Node> map = new HashMap<>();
    Node head;
    Node tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity; 
        this.count = 0; 
        head = new Node();
        tail = new Node();
        tail.prev = head;
        head.next = tail;
    }
    
    public void add(Node node) {
        Node after = head.next;
        head.next = node;
        node.next = after; 
        node.prev = head; 
        after.prev = node; 
        
    }
    
    public void remove(Node node) {
        Node prev = node.prev;
        Node after = node.next;
        prev.next = after;
        after.prev = prev;
    }
    
    public void update(Node node) {
        remove(node);
        add(node);
    } 
    
    public int get(int key) {
        Node retrievedNode = map.get(key);
        if(retrievedNode == null) return -1; 
        update(retrievedNode);
        
        return retrievedNode.value;
    }
    
    public void put(int key, int value) {
        Node retrievedNode = map.get(key);
        if(retrievedNode == null) {
            Node newNode = new Node(key, value);
            add(newNode);
            map.put(key, newNode);
            ++count; 
        } else {
            retrievedNode.value = value;
            update(retrievedNode);
        }
        
        if(count > capacity) {
            Node lastNode = tail.prev;
            map.remove(lastNode.key);
            remove(lastNode);
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