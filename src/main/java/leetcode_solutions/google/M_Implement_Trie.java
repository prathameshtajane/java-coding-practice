package leetcode_solutions.google;

/*
Implement a trie with insert, search, and startsWith methods.

Example:

Trie trie = new Trie();

trie.insert("apple");
trie.search("apple");   // returns true
trie.search("app");     // returns false
trie.startsWith("app"); // returns true
trie.insert("app");
trie.search("app");     // returns true
Note:

You may assume that all inputs are consist of lowercase letters a-z.
All inputs are guaranteed to be non-empty strings.

Link : https://leetcode.com/problems/implement-trie-prefix-tree/description/
 */

import java.util.HashMap;
import java.util.Map;

class TrieNode{
    Map<Character,TrieNode> map;
    boolean isLastCharOfWord = false;

    TrieNode(Map<Character,TrieNode> map , boolean isLastCharOfWord){
        this.map = map;
        this.isLastCharOfWord=isLastCharOfWord;
    }
}

class Trie {

    /** Initialize your data structure here. */
    TrieNode root;

    public Trie() {
        root = new TrieNode(new HashMap<>(),false);
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode currentNode = root;
        for(int i=0;i<=word.length()-1;i++){
            char c = word.charAt(i);
            if(currentNode.map.containsKey(c)){
                currentNode = currentNode.map.get(c);
                if(!currentNode.isLastCharOfWord){
                    currentNode.isLastCharOfWord=(i == word.length()-1);
                }
            }else{
                TrieNode tempNode = new TrieNode(new HashMap<>(),(i == word.length()-1));
                currentNode.map.put(c,tempNode);
                currentNode = tempNode;
            }
        }
    }

    /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode currentNode = root;
            for(char c : word.toCharArray()){
                if(currentNode.map.containsKey(c)){
                    currentNode = currentNode.map.get(c);
                }else{
                    return false;
                }
            }
            return currentNode.isLastCharOfWord;
        }

    /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode currentNode = root;
            for(char c : prefix.toCharArray()){
                if(currentNode.map.containsKey(c)){
                    currentNode = currentNode.map.get(c);
                }else{
                    return false;
                }
            }
            return true;
        }
}

public class M_Implement_Trie {


    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */


    public static void main(String args[]){
        System.out.println("M_Implement_Trie");
        Trie trie = new Trie();

        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");
        System.out.println(trie.search("apps") +" "+ trie.search("app")+" "+trie.search("ad")
                +" "+ trie.search("ap"));



    }
}
