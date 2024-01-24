class Trie {
    
    class Node {
        private int value;
        private boolean isWord;
        private Node[] children; 
        
        public Node(int val) {
            this.value = val;
            this.isWord = false; 
            this.children = new Node[26];
        }
    }
    
    Node root;
    
    public Trie() {
        root = new Node('\0');
    }
    
    public Node getLast(String word) {
        Node curr = root; 
        for(char x : word.toCharArray()){
            if(curr.children[x - 'a'] == null) {
                return null;
            }
            curr = curr.children[x - 'a'];
        }
        return curr;
    }
    
    public void insert(String word) {
        Node curr = root;
        for(char x : word.toCharArray()){
            if(curr.children[x - 'a'] == null) {
                curr.children[x - 'a'] = new Node(x);
            }
            curr = curr.children[x - 'a'];
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        Node res = getLast(word);
        return (res != null && res.isWord);
    }
    
    public boolean startsWith(String prefix) {
        Node res = getLast(prefix);
        if(res == null) return false;
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */