class Trie {
    
    class Node {
        private int value; 
        private boolean isWord; 
        private Node[] children;

        public Node(int value) {
            this.value = value;
            this.isWord = false;
            this.children = new Node[26];
        }
    }
    
    Node root; 
    
    public Trie() {
        root = new Node('\0');
    }
    
    private Node getLast(String word) {
        Node curr = root; 
        for(char c : word.toCharArray()) {
            if(curr.children[c - 'a'] == null) {
                return null;
            }
            
            curr = curr.children[c - 'a'];
        }
        
        return curr; 
    }
    
    public void insert(String word) {
        Node curr = root; 
        for(char c : word.toCharArray()) {
            if(curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new Node(c);
            }
            
            curr = curr.children[c - 'a'];
        }
        
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        Node result = getLast(word);
        return (result != null && result.isWord); 
    }
    
    public boolean startsWith(String prefix) {
        Node result = getLast(prefix);
        return (result == null ? false : true);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */