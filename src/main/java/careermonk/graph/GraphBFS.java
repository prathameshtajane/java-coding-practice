package careermonk.graph;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * Step 1 : Create graph using Adjacency List
 * Step 2 : BFS Traversal
 */
public class GraphBFS {

    static class UndirectedGraph{
        int nodeCount = 0;
        LinkedList<Integer>[] arrayList;


        //constructor
        UndirectedGraph(int nodeCount){
            this.nodeCount=nodeCount;
            arrayList = new LinkedList[nodeCount];
            for(int i=0;i<nodeCount;i++){
                arrayList[i]=new LinkedList<Integer>();
            }
        }

        void addNodeInUndirectedGraph(int src,int dest){
            if(src >= this.nodeCount || dest >= this.nodeCount){
                System.err.println("Node addition failed !");
            }else {
                arrayList[src].add(dest);
                arrayList[dest].add(src);
            }
        }

        void printUndirectedGraphAdjacencyList(){
            for(int i = 0;i<this.nodeCount;i++){
                System.out.println("Vertex : "+i);
                System.out.print("head");
                for(int each : this.arrayList[i]){
                    System.out.print(" -> "+each);
                }
                System.out.println("");
            }
        }

    }


    static void BFSTraversal(UndirectedGraph graph){
        boolean[] visited = new boolean[graph.nodeCount];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        visited[0]=true;
        q.addLast(0);
        while(!q.isEmpty()){
            int temp=q.removeFirst();
            System.out.println(temp);
            for(int i=0;i<graph.arrayList[temp].size();i++){
                if(!visited[graph.arrayList[temp].get(i)]){
                    q.addLast(graph.arrayList[temp].get(i));
                    visited[graph.arrayList[temp].get(i)]=true;
                }
            }
        }
    }

    public static void main(String args[]){
        System.out.println("GraphBFS");
        UndirectedGraph g = new UndirectedGraph(4);
        g.addNodeInUndirectedGraph(0,1);
        g.addNodeInUndirectedGraph(1,2);
        g.addNodeInUndirectedGraph(2,3);
        g.addNodeInUndirectedGraph(3,0);
        g.printUndirectedGraphAdjacencyList();
        GraphBFS.BFSTraversal(g);
    }
}
