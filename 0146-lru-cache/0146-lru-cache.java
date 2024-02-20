class LRUCache {
    
    class Node {
        int key;
        int value;
        Node next;
        Node prev;
        
        public Node(int key, int value) {
            this.key = key;
            this.value = value; 
        } 
        
        Node() {
            this(0, 0);
        }
    }
    
    Map<Integer, Node> map;
    int capacity;
    int count; 
    Node head;
    Node tail; 
    
    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;
        this.count = 0; 
        this.head = new Node();
        this.tail = new Node();
        head.next = this.tail;
        tail.prev = this.head; 
            
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
        Node exisitingNode = map.get(key);
        if(exisitingNode == null) return -1; 
        update(exisitingNode);
        return exisitingNode.value;
    }
    
    public void put(int key, int value) {
        Node exisitingNode = map.get(key);
        if(exisitingNode == null) {
            Node node = new Node(key, value);
            map.put(key, node);
            add(node);
            ++count;
        
        } else {
            exisitingNode.value = value;
            update(exisitingNode);
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