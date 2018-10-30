import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by prathamesh on 5/20/17.
 *
 * Given an integer array with even length, where different numbers in this array represent different kinds of candies.
 * Each number means one candy of the corresponding kind.
 * You need to distribute these candies equally in number to brother and sister.
 * Return the maximum number of kinds of candies the sister could gain.
 *
 * Example 1 :
 *
 * Input: candies = [1,1,2,2,3,3]
 * Output: 3
 * Explanation:
 * There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
 * Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
 * The sister has three different kinds of candies.
 *
 * Example 2 :
 * Input: candies = [1,1,2,3]
 * Output: 2
 * Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1].
 * The sister has two different kinds of candies, the brother has only one kind of candies.
 *
 *
 */
public class DistributeCandies {
    public static int distributeCandies(int[] candies) {
        int maxCandiesForSis=candies.length/2;
        int maxDistForSis=1;

        //Using HasMap Collection to maintain types of candies
        HashMap<Integer,Integer> candySets=new HashMap<>();

        for(int i=0;i<candies.length;i++){
            candySets.putIfAbsent(candies[i],0);
            candySets.put(candies[i],candySets.get(candies[i])+1);
        }

        for(Integer key:candySets.keySet()){
            if(candySets.get(key)<=maxCandiesForSis){
                maxDistForSis++;
                if(maxDistForSis>=maxCandiesForSis && candySets.keySet().size()>maxCandiesForSis){
                    return maxCandiesForSis;
                }else if(maxDistForSis >= candySets.keySet().size()){
                    return candySets.keySet().size();
                }
            }
        }
        return maxDistForSis;
    }

    public static void main(String args[]){
        int candies1[]={1,1,2,3};
        System.out.println(distributeCandies(candies1));
    }

}
