class WordDictionary {
    
    private class Node {
        char value;
        boolean isWord;
        Node[] children; 
        
        public Node(char val) {
            this.value = val;
            this.isWord = false;
            this.children = new Node[26];
        }
    }
    
    Node root;
    
    public WordDictionary() {
        root = new Node('\0');
    }
    
    public void addWord(String word) {
        Node curr = root; 
        for(char x : word.toCharArray()) {
            if(curr.children[x - 'a'] == null) {
                curr.children[x - 'a'] = new Node(x);
            }
            curr = curr.children[x - 'a'];
        }
        curr.isWord = true;
    }
                        
    private boolean searchHelper(String word, Node curr, int index) {
        for(int i = index; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            if(ch == '.') {
                for (Node temp: curr.children) {
                    if(temp != null && searchHelper(word, temp, i + 1)) {
                        return true;
                    }
                }
                return false;
            }
            
            if(curr.children[ch - 'a'] == null) {
                return false;
            }
            
            curr = curr.children[ch - 'a'];
        }
        
        return curr.isWord;
    }
    
    public boolean search(String word) {
        return searchHelper(word, root, 0);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */