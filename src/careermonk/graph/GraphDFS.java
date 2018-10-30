package careermonk.graph;


import java.util.Iterator;
import java.util.LinkedList;

public class GraphDFS {

    static class UndirectedGraph{

        int nodeCounts;
        LinkedList<Integer>[] arrayLList;

        //constructor
        UndirectedGraph(int nodeCounts){
            this.nodeCounts = nodeCounts;
            arrayLList = new LinkedList[nodeCounts];
            for(int i=0;i<nodeCounts;i++){
                arrayLList[i]=new LinkedList<>();
            }
        }

        void addNewNode(UndirectedGraph g,int src,int dest){
            g.arrayLList[src].add(dest);
            g.arrayLList[dest].add(src);

        }

        void printGraph(UndirectedGraph g){
            for(int i=0;i<g.nodeCounts;i++){
                System.out.println("Vertex : "+i);
                System.out.print("head");
                for(Integer each : g.arrayLList[i]){
                    System.out.print(" -> "+each);
                }
                System.out.println();
                System.out.println();
            }
        }

    }

    static void DFSutil(UndirectedGraph g,int v,boolean[] visited){
        visited[v]=true;
        System.out.println("Node Visited :"+v);
        Iterator<Integer> it = g.arrayLList[v].listIterator();
        while(it.hasNext()){
            int next=it.next();
            if(!visited[next]){
                DFSutil(g,next,visited);
            }
        }
    }

    static void DFS(UndirectedGraph g){
        boolean[] visited = new boolean[g.nodeCounts];
        for(int i=0;i<g.arrayLList.length;i++){
            if(!visited[i]){
                DFSutil(g,i,visited);
            }
        }
    }


    public static void main(String args[]){
        System.out.println("GraphDFS");
        System.out.println("Creating graph");
        UndirectedGraph graph = new UndirectedGraph(6);
        graph.addNewNode(graph,1,2);
        graph.addNewNode(graph,2,3);
        graph.addNewNode(graph,3,4);
        graph.addNewNode(graph,4,1);
        graph.addNewNode(graph,4,5);
        graph.printGraph(graph);
        GraphDFS.DFS(graph);
    }
}
