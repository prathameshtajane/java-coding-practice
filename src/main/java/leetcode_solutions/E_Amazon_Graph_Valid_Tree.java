package leetcode_solutions;
import java.util.*;

/**
 *  Graph Valid TreeGiven n nodes labeled from 0 to n-1 and a list of undirected edges (each edge is a pair of nodes),
 *  write a function to check whether these edges make up a valid tree.
 *
 * Example 1:
 *
 * Input: n = 5, and edges = [[0,1], [0,2], [0,3], [1,4]]
 * Output: true
 * Example 2:
 *
 * Input: n = 5, and edges = [[0,1], [1,2], [2,3], [1,3], [1,4]]
 * Output: false
 * Note: you can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0,1] is the
 * same as [1,0] and thus will not appear together in edges.
 */
public class E_Amazon_Graph_Valid_Tree {


    Map<Integer, List<Integer>> map;
    boolean[] visited;
    boolean[] recursion;

    E_Amazon_Graph_Valid_Tree(){
        map=new HashMap<>();
    }


    boolean isCyclicUtil(int i,boolean[] visited, boolean[] recursion){
        if(recursion[i]){
            return true;
        }
        if(visited[i]){
            return false;
        }

        visited[i]=true;
        recursion[i]=true;
        List<Integer> children = map.get(i);

        if(children != null){
            for(int j = 0 ; j < map.get(i).size() ; j++){
                if(isCyclicUtil(map.get(i).get(j),visited,recursion)){
                    return true;
                }
            }
        }
        recursion[i]=false;
        return false;
    }

    boolean isCyclic(Map<Integer, List<Integer>> map){
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            if(isCyclicUtil(entry.getKey(),visited,recursion)){
                return  true;
            }
        }
        return false;
    }

    public boolean validTree(int n, int[][] edges) {
        visited=new boolean[n];
        recursion=new boolean[n];
        for(int[] edge : edges){
            List<Integer> tempList = map.getOrDefault(edge[0],new ArrayList<>());
            tempList.add(edge[1]);
            map.put(edge[0],tempList);

            List<Integer> tempList2 = map.getOrDefault(edge[1],new ArrayList<>());
            tempList2.add(edge[0]);
            map.put(edge[1],tempList2);
        }
        return !isCyclic(map);
    }

}
