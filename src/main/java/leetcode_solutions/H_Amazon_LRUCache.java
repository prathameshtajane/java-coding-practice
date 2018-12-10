package leetcode_solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 146. LRU Cache
 *
 * Design and implement a data structure for Least Recently Used (LRU) cache.
 * It should support the following operations: get and put.
 *
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new item.
 *
 * Follow up:
 * Could you do both operations in O(1) time complexity?
 *
 * Example:
 *
 * LRUCache cache = new LRUCache( 2 capacity );

    cache.put(1,1);
    cache.put(2,2);
    cache.get(1);       // returns 1
    cache.put(3,3);    // evicts key 2
    cache.get(2);       // returns -1 (not found)
    cache.put(4,4);    // evicts key 1
    cache.get(1);       // returns -1 (not found)
    cache.get(3);       // returns 3
    cache.get(4);       // returns 4

 link : https://leetcode.com/problems/lru-cache/description/
 */
public class H_Amazon_LRUCache {
    static class Node{
        int val;
        int return_val;
        Node next;
        Node prev;
        Node(int val,int return_val){
            this.val=val;
            this.return_val=return_val;
        }
    }

    static class DLinkedList{
         int currCapacity = 0;
         int capacity;
         Node head;
         Node tail;
         Map<Integer,Node> map;

         DLinkedList(int capacity){
             map=new HashMap<>();
             this.capacity=capacity;
         }

         public boolean isPreset(int k){
             return map.containsKey(k);
         }

         public int insert(int k,int v){
            if(isPreset(k)){
                //update the existing Node
                remove(k);
                Node newNode = new Node(k,v);
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
                map.put(k,newNode);
                ++currCapacity;
            }else{
                //insert new value
                if(currCapacity != capacity){
                    Node newNode = new Node(k,v);
                    if (currCapacity == 0){
                        head=newNode;
                        tail=newNode;
                    }else {
                    newNode.prev=tail;
                    tail.next=newNode;
                    tail=newNode;
                    }
                    map.put(k,newNode);
                    ++currCapacity;
                }else{
                    // capacity is full, so remove oldest Node and add new Node
//                    map.remove(head.val);
//                    head=head.next;
//                    head.prev=null;
//                    --currCapacit;
                    remove(head.val);
                    insert(k,v);
//                    Node newNode = new Node(k,v);
//                    tail.next=newNode;
//                    newNode.prev=tail;
//                    tail=newNode;
//                    map.put(newNode.val,newNode);
//                    ++currCapacity;
                }
            }
            return v;
         }

         public int get(int k){
             if(isPreset(k)){
                 //update the existing Node
                 Node existingNode = map.get(k);
                 remove(k);
                 insert(k,existingNode.return_val);
                 return existingNode.return_val;
//                 Node newNode = new Node(k,existingNode.return_val);
//                 tail.next=newNode;
//                 newNode.prev=tail;
//                 map.put(k,newNode);
//                 return newNode.return_val;
             }else {
                 return -1;
             }
         }

         public void remove(int k){
             Node nodeToBeRemoved = map.get(k);
             Node prevNode = nodeToBeRemoved.prev;
             Node nextNode = nodeToBeRemoved.next;

             if(prevNode == null && nextNode == null){
                 head=null;
                 tail=null;
                 map.remove(nodeToBeRemoved.val);
                 --currCapacity;
                 return;
             }

             if(prevNode != null)
                 prevNode.next = nextNode;
             else{
                 head=nodeToBeRemoved.next;
                 head.prev=null;
             }

             if(nextNode != null)
                 nextNode.prev=prevNode;
             else{
                 tail=nodeToBeRemoved.prev;
                 tail.next=null;
             }
             map.remove(nodeToBeRemoved.val);
             --currCapacity;
             if(currCapacity == 1){
                 head=tail;
             }
         }
    }
    DLinkedList dLinkedList;
    public H_Amazon_LRUCache(int capacity) {
        dLinkedList=new DLinkedList(capacity);
    }

    public int get(int key) {
        return dLinkedList.get(key);
    }

    public void put(int key, int value) {
        dLinkedList.insert(key,value);
    }


    public static void main(String[] args) {
//        H_Amazon_LRUCache cache = new H_Amazon_LRUCache(2);
//        cache.put(1,1);
//        cache.put(2,2);
//        System.out.println(cache.get(1));       // returns 1
//        cache.put(3,3);    // evicts key 2
//        System.out.println(cache.get(2));       // returns -1 (not found)
//        cache.put(4,4);    // evicts key 1
//        System.out.println(cache.get(1));       // returns -1 (not found)
//        System.out.println(cache.get(3));       // returns 3
//        System.out.println(cache.get(4));       // returns 4

        H_Amazon_LRUCache cache = new H_Amazon_LRUCache(1);
        cache.put(2,1);
        System.out.println(cache.get(2));       // returns 2

    }
}
