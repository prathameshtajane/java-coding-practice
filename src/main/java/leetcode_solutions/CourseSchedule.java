package leetcode_solutions;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * There are a total of n courses you have to take, labeled from 0 to n-1.
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1,
 * which is expressed as a pair: [0,1]
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 * <p>
 * Example 1:
 * Input: 2, [[1,0]]
 * Output: true
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0. So it is possible.
 * <p>
 * Example 2:
 * Input: 2, [[1,0],[0,1]]
 * Output: false
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0, and to take course 0 you should
 * also have finished course 1. So it is impossible.
 */
public class  CourseSchedule {

    static class DirectedGraph {
        int nodeCount;
        LinkedList<Integer>[] arrayList;

        DirectedGraph(int nodeCount) {
            this.nodeCount = nodeCount;
            arrayList = new LinkedList[this.nodeCount];
            for (int i = 0; i < this.nodeCount; i++) {
                arrayList[i] = new LinkedList<Integer>();
            }
        }

        void addDirectedNodeFromTo(int src, int dest) {
            this.arrayList[src].add(dest);
        }
    }

    static boolean DFSutil(DirectedGraph directedGraph, int vertex, boolean[] visited, boolean[] onStack) {
        visited[vertex] = true;
        System.out.println("Visited : " + vertex);
        onStack[vertex] = true;

        Iterator<Integer> it = directedGraph.arrayList[vertex].listIterator();
        while (it.hasNext()) {
            int temp = it.next();
            if (onStack[temp]) {
                return false;
            }
            onStack[temp]=true;
            return DFSutil(directedGraph, temp, visited, onStack);

//            if(!visited[vertex]){
//                DFSutil(directedGraph,temp,visited,onStack);
//            }
        }
        onStack[vertex] = false;
        return true;
    }


    static boolean DFS(DirectedGraph directedGraph) {
        boolean[] visited = new boolean[directedGraph.nodeCount];
        boolean[] onStack = new boolean[directedGraph.nodeCount];
        boolean notCycle = true;
        for (int i = 0; i < directedGraph.nodeCount; i++) {
                if (!DFSutil(directedGraph, i, visited, onStack)) {
                    notCycle = false;
                }
        }
        return notCycle;
    }


    public static void main(String args[]) {
        System.out.println("CourseSchedule");
        DirectedGraph graph = new DirectedGraph(3);
        int[][] prerequisites={{1,0},{2,1}};
//        DirectedGraph graph = new DirectedGraph(3);
//        int[][] prerequisites={{1,0},{2,1}};
        for(int i=0;i<prerequisites.length;i++){
            graph.addDirectedNodeFromTo(prerequisites[i][0],prerequisites[i][1]);
        }

//        graph.addDirectedNodeFromTo(1,2);
//        graph.addDirectedNodeFromTo(2,1);
        System.out.println(CourseSchedule.DFS(graph));
    }
}
