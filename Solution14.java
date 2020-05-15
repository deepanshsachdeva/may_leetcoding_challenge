class Trie {
    
    private TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode r = root;
        
        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            int ix = c-'a';
            if (r.children[ix] == null) {
                TrieNode t = new TrieNode();
                r.children[ix] = t;
                r = t;
            } else {
                r = r.children[ix];
            }
        }
        
        r.isLeaf = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode p = searchEndNode(word);
        
        if(p==null){
            return false;
        }else{
            if(p.isLeaf)
                return true;
        }
 
        return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode p = searchEndNode(prefix);
        
        if (p == null) {
            return false;
        } else {
            return true;
        }
    }
    
    private TrieNode searchEndNode(String word) {
        TrieNode r = root;
        
        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            int ix = c-'a';
            
            if (r.children[ix] != null) {
                r = r.children[ix];
            } else {
                return null;
            }
        }
        
        return r;
    }
}

class TrieNode {
    TrieNode children[];
    boolean isLeaf;
    
    public TrieNode() {
        this.children = new TrieNode[26];
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */