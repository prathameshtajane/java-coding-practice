package careermonk.graph;

import java.util.LinkedList;

/**
 * Step 1 : Create Directed graph
 * Step 2 : Topological sort
 */
public class TopologicalGraphSort {

    static class DirectedGraph{
        int nodeCount=0;
        LinkedList<Integer>[] arrayList;

        DirectedGraph(int nodeCount){
            this.nodeCount=nodeCount;
            arrayList = new LinkedList[this.nodeCount];

            for(int i=0;i<this.nodeCount;i++){
                arrayList[i]=new LinkedList<Integer>();
            }
        }

        void addFromToDirectedPath(int src,int dest){
            if(src >= this.nodeCount || dest >= this.nodeCount){
                System.err.println("Error");
            }else {
                arrayList[src].add(dest);
            }
        }
    }

    static void topologicalSort(DirectedGraph graph){
        //todo : topologicalSort Implementation
    }

    public static void main(String args[]){
        System.out.println("TopologicalGraphSort");
    }
}
