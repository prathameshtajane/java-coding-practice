package leetcode_solutions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 380. Insert Delete GetRandom O(1)
 * <p>
 * Design a data structure that supports all following operations in average O(1) time.
 * <p>
 * insert(val): Inserts an item val to the set if not already present.
 * remove(val): Removes an item val from the set if present.
 * getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
 * Example:
 * <p>
 * // Init an empty set.
 * RandomizedSet randomSet = new RandomizedSet();
 * <p>
 * // Inserts 1 to the set. Returns true as 1 was inserted successfully.
 * randomSet.insert(1);
 * <p>
 * // Returns false as 2 does not exist in the set.
 * randomSet.remove(2);
 * <p>
 * // Inserts 2 to the set, returns true. Set now contains [1,2].
 * randomSet.insert(2);
 * <p>
 * // getRandom should return either 1 or 2 randomly.
 * randomSet.getRandom();
 * <p>
 * // Removes 1 from the set, returns true. Set now contains [2].
 * randomSet.remove(1);
 * <p>
 * // 2 was already in the set, so return false.
 * randomSet.insert(2);
 * <p>
 * // Since 2 is the only number in the set, getRandom always return 2.
 * randomSet.getRandom();
 * <p>
 * link : https://leetcode.com/problems/insert-delete-getrandom-o1/
 */
public class M_Insert_Delete_GetRandom {
    Map<Integer, Integer> numIndexMap;
    List<Integer> num_list;
    java.util.Random rand = new java.util.Random();

    /**
     * Initialize your data structure here.
     */
    public M_Insert_Delete_GetRandom() {
        numIndexMap = new HashMap<>();
        num_list = new ArrayList<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (!numIndexMap.containsKey(val)) {
            num_list.add(val);
            numIndexMap.put(val, num_list.size() - 1);
            return true;
        }
        return false;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (numIndexMap.containsKey(val)&& num_list.size() != 0) {
            //get index of val to be removed
            int val_index = numIndexMap.get(val);
            //replace it with the last element in list
            int last_index_val=num_list.get(num_list.size()-1);
            num_list.set(num_list.size()-1,val);
            // Important
            //num_list.add(val_index,last_index_val); will not work here
            num_list.set(val_index,last_index_val);
            numIndexMap.put(last_index_val,val_index);
            numIndexMap.remove(val);
            num_list.remove(num_list.size()-1);
            return true;
        }
        return false;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        if(num_list.size() == 1){
            return num_list.get(num_list.size()-1);
        }
        if(num_list.size() == 1){
            // System.out.println(num_list.size());
            return num_list.get(num_list.size()-1);
        }
        return num_list.get( rand.nextInt(num_list.size()) );
    }


    public static void main(String[] args) {
        System.out.println("380. Insert Delete GetRandom O(1)");
        /**
         * Your RandomizedSet object will be instantiated and called as such:
         * RandomizedSet obj = new RandomizedSet();
         * boolean param_1 = obj.insert(val);
         * boolean param_2 = obj.remove(val);
         * int param_3 = obj.getRandom();
         */

        M_Insert_Delete_GetRandom obj = new M_Insert_Delete_GetRandom();
        obj.insert(0);
        obj.remove(0);
        obj.insert(1);

    }
}
