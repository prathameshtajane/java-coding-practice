package ctci;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of Trie data structure
 */
public class TrieDataStructure {



    static class TrieNode{
        Map<Character,TrieNode> children;
        boolean endOfWord;
//        private TrieNode root;

        public TrieNode(){
            children = new HashMap<>();
            endOfWord = false;
        }

    }

    static final TrieNode root = new TrieNode();

    public void insert(String inputString){
        char[] inputArray = inputString.toCharArray();
        TrieNode current = root;
        for(char eachChar : inputArray){
            TrieNode temp = current.children.get(eachChar);
            if(temp == null){
                TrieNode newNode = new TrieNode();
                current.children.put(eachChar,newNode);
                current=newNode;
            }else{
                current = temp;
            }

        }
        current.endOfWord=true;
    }

    boolean search(String searchedQuery){
        char[] searchQueryArray = searchedQuery.toCharArray();
        TrieNode current = root;
        for(char eachChar : searchQueryArray){
            TrieNode  tempNode = current.children.get(eachChar);
            if(tempNode == null){
                return false;
            }
            current = tempNode;
        }
        return current.endOfWord;
    }

    public static void main(String args[]){
        System.out.println("TrieDataStructure");
        TrieDataStructure trie = new TrieDataStructure();
        trie.insert("abcd");
        trie.insert("abgl");
        trie.insert("cdf");
        System.out.println("TrieDataStructure constructed !");
        System.out.println(trie.search("cdf"));
        System.out.println(trie.search("abc"));
    }
}
