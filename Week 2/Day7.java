//Implement Trie (Prefix Tree)
class Trie {

    class TrieNode {
        public boolean isEnd;
        public TrieNode[] next;

        public TrieNode() {
            this.isEnd = false;
            this.next = new TrieNode[26];
        }
    }

    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        this.root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (word != null) {
            int i, N = word.length();
            char ch;
            TrieNode current = this.root;
            for (i = 0; i < N; i++) {
                ch = word.charAt(i);
                if (current.next[ch - 'a'] == null) {
                    current.next[ch - 'a'] = new TrieNode();
                }

                current = current.next[ch - 'a'];
            }

            current.isEnd = true;
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if (word == null || word.length() == 0)
            return true;
        else {
            int i, N = word.length();
            char ch;
            TrieNode current = root;

            for (i = 0; i < N; i++) {
                ch = word.charAt(i);
                if (current.next[ch - 'a'] == null) {
                    return false;
                }

                current = current.next[ch - 'a'];
            }

            return current.isEnd;
        }
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.length() == 0)
            return true;
        else {
            int i, N = prefix.length();
            char ch;
            TrieNode current = root;

            for (i = 0; i < N; i++) {
                ch = prefix.charAt(i);
                if (current.next[ch - 'a'] == null) {
                    return false;
                }

                current = current.next[ch - 'a'];
            }

            return true;
        }
    }
}
/**
 * Your Trie object will be instantiated and called as such: Trie obj = new
 * Trie(); obj.insert(word); boolean param_2 = obj.search(word); boolean param_3
 * = obj.startsWith(prefix);
 */